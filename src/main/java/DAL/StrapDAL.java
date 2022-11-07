package DAL;

import Entity.Strap;
import Utils.HibernateUtils;
import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author duyph
 */
public class StrapDAL {

    private static Session session;

    public StrapDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public static void addStrap(Strap st) {
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
    }

    public void deleteStrap(int id) {
        session.beginTransaction();
        Strap str = new Strap();
        str.setStrapID(id);
        session.merge(str);
        session.delete(str);
        session.getTransaction().commit();
    }
    public void updateStrap(Strap obj) {
        session.update(obj);
    }

    public Strap getStrap(int StrapID) {
        Strap obj;
        session.beginTransaction();
        obj = session.get(Strap.class, StrapID);
        session.getTransaction().commit();
        return obj;
    }

    public List getlistStrap() {
        List<Strap> list;
        session.beginTransaction();
        list = session.createQuery("FROM Strap", Strap.class).list();
        session.getTransaction().commit();
        return list;
    }
    public static void main(String[] args) {
        StrapDAL s = new StrapDAL();
        List l = s.getlistStrap();
        for(int i=0 ; i<l.size();i++){
            System.out.println(l.get(i).toString());
        }
    }
}
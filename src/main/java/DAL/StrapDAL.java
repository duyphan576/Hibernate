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

    public void addStrap(Strap st) {
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
    }

    public void deleteStrap(int id) {
        session.clear();
        session.beginTransaction();
        Strap st = new Strap();
        st.setStrapID(id);
        session.delete(st);
        session.getTransaction().commit();
    }
    public void updateStrap(int id,String name) {
        session.clear();
        session.beginTransaction();
        Strap st = new Strap();
        st.setStrapID(id);
        st.setStrapName(name);
        session.update(st);
        session.getTransaction().commit();
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
}
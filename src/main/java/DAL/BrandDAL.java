/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Brand;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author jukut
 */
public class BrandDAL {

    private static Session session;

    public BrandDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public void addBrand(Brand br) {
        session.beginTransaction();
        session.save(br);
        session.getTransaction().commit();
    }

    public void deleteBrand(int id) {
        session.clear();
        session.beginTransaction();
        Brand br = new Brand();
        br.setBrandID(id);
        session.delete(br);
        session.getTransaction().commit();
    }

    public void updateBrand(int id, String name) {
        session.clear();
        session.beginTransaction();
        Brand br = new Brand();
        br.setBrandID(id);
        br.setBrandName(name);
        session.update(br);
        session.getTransaction().commit();
    }

    public Brand getBrand(int BrandID) {
        Brand obj;
        session.beginTransaction();
        obj = session.get(Brand.class, BrandID);
        session.getTransaction().commit();
        return obj;
    }

    public List getlistBrand() {
        List<Brand> list;
        session.beginTransaction();
        Query query = session.createSQLQuery("CALL GetAllBrands()").addEntity(Brand.class);
        list = query.list();
        session.getTransaction().commit();
        return list;
    }

}

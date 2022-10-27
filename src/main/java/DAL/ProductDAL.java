/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Product;
import Utils.HibernateUtils;
import org.hibernate.Session;

/**
 *
 * @author duyph
 */
public class ProductDAL {

    private static Session session = HibernateUtils.getSessionFactory().openSession();

    public static void addProduct(Product pr) {
        session.beginTransaction();
        session.save(pr);
        session.getTransaction().commit();
    }
}

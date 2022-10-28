/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Strap;
import Utils.HibernateUtils;
import org.hibernate.Session;

/**
 *
 * @author duyph
 */
public class StrapDAL {

    private static Session session = HibernateUtils.getSessionFactory().openSession();

    public static void addStrap(Strap st) {
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
    }
}

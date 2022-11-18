/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Entity.Strap;
import org.hibernate.Session;

/**
 *
 * @author duyph
 */
public class Test {

    public static void main(String[] args) {
        try ( Session session = HibernateUtils.getSessionFactory().openSession();) {
            // Begin a unit of work
            session.beginTransaction();
            Strap st = new Strap();
            st.setStrapName("cc");
            int StrapID = (int) session.save(st);
            System.out.println("StrapID id: "+StrapID);
            session.getTransaction().commit();
        }
    }
}

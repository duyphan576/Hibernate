/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Entity.Product;
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
            Product pr = new Product();
            pr.setBrandID(1);
            pr.setStrapID(1);
            pr.setProductName("Gucci");
            pr.setPrice(100);
            pr.setQuantity(10);
            pr.setProductDetail("ProductDetail");
            int productID = (int) session.save(pr);
            System.out.println("Product id: "+productID);
            session.getTransaction().commit();
        }
    }
}

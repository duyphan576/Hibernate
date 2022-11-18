/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Utils.HibernateUtils;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author duyph
 */
public class StatisticDAL {

    public StatisticDAL() {

    }

    public List totalSale() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.clear();
        session.beginTransaction();
        List<Object[][]> data = session.createQuery("SELECT year(Date), month(Date), sum(TotalPrice) FROM Order GROUP BY year(Date), month(Date) ORDER BY year(Date), month(Date)").list();
        session.getTransaction().commit();
        return data;
    }

    public List topProduct() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.clear();
        session.beginTransaction();
        List<Object[][]> data = session.createQuery("SELECT p.ProductName, SUM(od.Quantity) FROM Product p, OrderDetail od WHERE p.ProductID = od.ProductID GROUP BY p.ProductName ORDER BY SUM(od.Quantity) DESC").list();
        session.getTransaction().commit();
        return data;
    }

    public static void main(String[] args) {
        StatisticDAL s = new StatisticDAL();
        List<Object[]> list = s.topProduct();
        String a = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < Arrays.toString(list.get(i)).length() - 1; j++) {
                a += Arrays.toString(list.get(i)).charAt(j);
            }
            a += ", ";
        }
        String[] part = a.split(", ");
        for (int i = 0; i < part.length; i++) {
            System.out.println(part[i]);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author duyph
 */
public class StatisticDAL {

    private Session session;

    public StatisticDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List totalSale() {
        session.clear();
        session.beginTransaction();
        List<Object[][]> data = session.createQuery("SELECT year(Date), month(Date), sum(TotalPrice) FROM Order GROUP BY year(Date), month(Date) ORDER BY year(Date), month(Date)").list();
        session.getTransaction().commit();
        return data;
    }

    public List topProduct() {
        session.clear();
        session.beginTransaction();
        List<Object[][]> data = session.createQuery("SELECT p.ProductName, SUM(od.Quantity) FROM Product p, OrderDetail od WHERE p.ProductID = od.ProductID GROUP BY p.ProductName ORDER BY SUM(od.Quantity) DESC").list();
        session.getTransaction().commit();
        return data;
    }

}

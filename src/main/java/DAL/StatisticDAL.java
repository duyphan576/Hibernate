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

    private Session session;

    public StatisticDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List totalSale() {
        session.clear();
        session.beginTransaction();
        List<Object[][]> data = session.createSQLQuery("CALL GetTotalSales()").list();
        session.getTransaction().commit();
        return data;
    }

    public List topProduct() {
        session.clear();
        session.beginTransaction();
        List<Object[][]> data = session.createSQLQuery("CALL GetTopProduct()").list();
        session.getTransaction().commit();
        return data;
    }

}

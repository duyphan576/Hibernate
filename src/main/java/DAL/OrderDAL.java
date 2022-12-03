/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Order;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Clock
 */
public class OrderDAL {

    private static Session session;

    public OrderDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List loadOrder() {
        session.clear();
        List<Order> list;
        session.beginTransaction();
        Query query = session.createSQLQuery("CALL GetAllOrders()").addEntity(Order.class);
        list = query.list();
        session.getTransaction().commit();
        return list;
    }

    public Order getOrder(int OrderID) {
        session.clear();
        session.beginTransaction();
        Order c = session.get(Order.class, OrderID);
        session.getTransaction().commit();
        return c;
    }

    public void addOrder(Order c) {
        session.clear();
        session.beginTransaction();
        session.save(c);
        session.getTransaction().commit();
    }

    public void updateOrder(Order c) {
        session.clear();
        session.beginTransaction();
        session.update(c);
        session.getTransaction().commit();
    }

    public void deleteOrder(Order c) {
        session.clear();
        session.beginTransaction();
        session.delete(c);
        session.getTransaction().commit();
    }

}

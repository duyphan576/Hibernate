/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.Order;
import Utils.HibernateUtils;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;

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
        List<Order> order;
        session.beginTransaction();
        order = session.createQuery("FROM Order", Order.class).list();
        session.getTransaction().commit();
        return order;
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

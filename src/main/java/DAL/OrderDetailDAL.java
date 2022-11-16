/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Entity.OrderDetail;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author Clock
 */
public class OrderDetailDAL {
    private static Session session = HibernateUtils.getSessionFactory().openSession();

    public OrderDetailDAL() {
        // private static Session session = HibernateUtils.getSessionFactory().openSession();
    }

    public List loadOrderDetail() {
        session.clear();
        List<OrderDetail> order;
        session.beginTransaction();
        order = session.createQuery("FROM OrderDetail", OrderDetail.class).list();
        session.getTransaction().commit();
        return order;
    }
    
    public List loadOrderDetailByOrderID(int OrderID) {
        session.clear();
        List<OrderDetail> order;
        session.beginTransaction();
        Query q = session.createQuery("FROM OrderDetail Where OrderID = :OrderID");
        q.setParameter("OrderID", OrderID);
        order = q.list();
        session.getTransaction().commit();
        return order;
    }

    public OrderDetail getOrderDetail(int OrderDetailID) {
        session.clear();
        session.beginTransaction();
        OrderDetail c = session.get(OrderDetail.class, OrderDetailID);
        session.getTransaction().commit();
        return c;
    }

    public void addOrderDetail(OrderDetail c) {
       session.clear();
       session.beginTransaction();
       session.save(c);
       session.getTransaction().commit();
        
    }

    public void updateOrderDetail(OrderDetail c) {
        session.clear();
        session.beginTransaction();
        session.update(c);
        session.getTransaction().commit();
    }

    public void deleteOrderDetail(OrderDetail c) {
        session.clear();
        session.beginTransaction();
        session.delete(c);
        session.getTransaction().commit();
    }
    
    public static void main(String[] args) {
        
    
        
        OrderDetailDAL odDal = new OrderDetailDAL();
        odDal.loadOrderDetail();
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Brand;
import Entity.Customer;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author MSI VN
 */
public class CustomerDAL {
    private static Session session;
    
    public CustomerDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }
    
    public void addCustomer(Customer customer) {
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
    }

    public void deleteCustomer(int id) {
        session.clear();
        session.beginTransaction();
        Customer customer = new Customer();
        customer.setCustomerID(id);
        session.delete(customer);
        session.getTransaction().commit();
    }

    public void updateCustomer(Customer cus) {
        session.clear();
        session.beginTransaction();
        Customer customer = new Customer();
        customer.setCustomerID(cus.getCustomerID());
        customer.setAccount(cus.getAccount());
        customer.setFullName(cus.getFullName());
        customer.setPassword(cus.getPassword());
        customer.setAddress(cus.getAddress());
        session.update(customer);
        session.getTransaction().commit();
    }

    public Customer getCustomer(int CustomerID) {
        Customer cus;
        session.beginTransaction();
        cus = session.get(Customer.class, CustomerID);
        session.getTransaction().commit();
        return cus;
    }

    public List getlistCustomer() {
        List<Customer> list;
        session.beginTransaction();
        Query query = session.createSQLQuery("CALL GetAllCustomers()").addEntity(Customer.class);
        list = query.list();
        session.getTransaction().commit();
        return list;
    }

}

package Util;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author duyph
 */


import Entity.Product;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibenateUtil {
    private static SessionFactory sessionFactory = buildSessionFactory();
    
    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        Metadata metadata = new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        return metadata.getSessionFactoryBuilder().build();
    }
    
    private static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    private static void close(){
        getSessionFactory().close();
    }
    
    public static void main(String[] args) {
        Session session = HibenateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Product> product = session.createQuery("From Product", Product.class).list();
        product.forEach(System.out::println);
    }
}

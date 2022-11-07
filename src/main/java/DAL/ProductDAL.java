/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Product;
import Entity.Strap;
import Entity.Brand;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author duyph
 */
public class ProductDAL {

    private Session session = HibernateUtils.getSessionFactory().openSession();

    public ProductDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List getAllProduct() {
        List<Product> product;
        session.beginTransaction();
        product = session.createQuery("FROM Product", Product.class).list();
        session.getTransaction().commit();
        return product;
    }
    
    public Product getProduct(int productID) {
        Product obj;
        session.beginTransaction();
        obj = session.get(Product.class, productID);
        session.getTransaction().commit();
        return obj;
    }

    public List getProductByStrap(int strapID) {
        List list;
        session.beginTransaction();
        Query q = session.createQuery("FROM Product WHERE StrapID = :strapID");
        q.setParameter("strapID", strapID);
        list = q.list();
        session.getTransaction().commit();
        return list;
    }

    public void addProduct(Product obj) {
        session.save(obj);
    }

    public void updateProduct(Product obj) {
        session.update(obj);
    }
    
    public void deleteProduct(int id) {
        session.clear();
        session.beginTransaction();
        Product pr = new Product();
        pr.setProductID(id);
        session.delete(pr);
        session.getTransaction().commit();
    }
    public void updateproduct(int id,Strap strap,Brand brand,String name,int price,int quantity,String detail) {
        session.clear();
        session.beginTransaction();
        Product pr = new Product();
        pr.setProductID(id);
        pr.setProductName(name);
        pr.setProductDetail(detail);
        pr.setQuantity(quantity);
        pr.setPrice(price);
        pr.setBrand(brand);
        pr.setStrap(strap);
        session.update(pr);
        session.getTransaction().commit();
    }
}

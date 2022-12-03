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
        List<Product> list;
        session.beginTransaction();
        Query query = session.createSQLQuery("CALL GetAllProducts()").addEntity(Product.class);
        list = query.list();
        session.getTransaction().commit();
        return list;
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

    public List getProductByBrand(int brandID) {
        List list;
        session.beginTransaction();
        Query q = session.createQuery("FROM Product WHERE BrandID = :brandID");
        q.setParameter("brandID", brandID);
        list = q.list();
        session.getTransaction().commit();
        return list;
    }

    public void deleteProduct(int id) {
        session.clear();
        session.beginTransaction();
        Product pr = new Product();
        pr.setProductID(id);
        session.delete(pr);
        session.getTransaction().commit();
    }

    public void updateProduct(int id, Strap strap, Brand brand, String name, float price, int quantity, String detail) {
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

    public void addProduct(Strap strap, Brand brand, String name, float price, int quantity, String detail) {
        session.clear();
        session.beginTransaction();
        Product pr = new Product();
        pr.setProductName(name);
        pr.setProductDetail(detail);
        pr.setQuantity(quantity);
        pr.setPrice(price);
        pr.setBrand(brand);
        pr.setStrap(strap);
        session.save(pr);
        session.getTransaction().commit();
    }
    
    public void updateQuantity(int id, int quantity){
        session.clear();
        session.beginTransaction();
        Product pr = new Product();
        pr.setProductID(id);
        pr.setQuantity(quantity);
        session.update(pr);
        session.getTransaction().commit();
    }
}

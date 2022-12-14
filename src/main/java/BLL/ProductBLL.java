/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ProductDAL;
import Entity.Product;
import Entity.Strap;
import Entity.Brand;
import java.util.List;

/**
 *
 * @author zolo
 */
public class ProductBLL {

    private ProductDAL proDAL;

    public ProductBLL() {
        proDAL = new ProductDAL();
    }

    public List loadProduct() {
        List list = proDAL.getAllProduct();
        return list;
    }

    public List loadProductbyStrap(int id) {
        List list = proDAL.getProductByStrap(id);
        return list;
    }

    public List loadProductbyBrand(int id) {
        List list = proDAL.getProductByBrand(id);
        return list;
    }

    public Product getProduct(int productID) {
        return proDAL.getProduct(productID);
    }

    public List getProductByStrap(int strapID) {
        List list = proDAL.getProductByStrap(strapID);
        return list;
    }

    public List getProductByBrand(int brandID) {
        List list = proDAL.getProductByBrand(brandID);
        return list;
    }

    public void delProduct(int id) {
        proDAL.deleteProduct(id);
    }

    public void updateProduct(int id, Strap strap, Brand brand, String name, float price, int quantity, String detail) {
        proDAL.updateProduct(id, strap, brand, name, price, quantity, detail);
    }

    public void addProduct(Strap strap, Brand brand, String name, float price, int quantity, String detail) {
        proDAL.addProduct(strap, brand, name, price, quantity, detail);
    }

    public Object[][] converProduct(List<Product> list) {
        int rows = list.size();
        int cols = 7;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getProductID();
            obj[i][1] = list.get(i).getProductName();
            obj[i][2] = list.get(i).getStrap().getStrapName();
            obj[i][3] = list.get(i).getBrand().getBrandName();
            obj[i][4] = list.get(i).getPrice();
            obj[i][5] = list.get(i).getQuantity();
            obj[i][6] = list.get(i).getProductDetail();
        }
        return obj;
    }

}

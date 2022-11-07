/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ProductDAL;
import Entity.Product;
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
        List list;
        list = proDAL.getAllProduct();
        return list;
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

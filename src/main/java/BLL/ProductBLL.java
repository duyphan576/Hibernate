/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.ProductDAL;

/**
 *
 * @author duyph
 */
public class ProductBLL {
    public ProductDAL productDAL;

    public ProductBLL() {
        productDAL = new ProductDAL();
    }
    
    public void deleteProduct(int id){
        productDAL.deleteProduct(id);
    }
}

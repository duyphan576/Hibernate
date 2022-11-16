/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.BrandDAL;
import Entity.Brand;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jukut
 */
public class BrandBLL {

    public BrandDAL brdal;
    private DefaultTableModel model;

    public BrandBLL() {
        brdal = new BrandDAL();
    }

    public void addbrand(String name) {
        Brand br = new Brand();
        br.setBrandName(name);
        brdal.addBrand(br);
    }

    public void delBrand(int id) {
        brdal.deleteBrand(id);
    }

    public void editBrand(int id, String name) {
        brdal.updateBrand(id, name);
    }

    public List loadBrand() {
        List list;
        list = brdal.getlistBrand();
        return list;
    }
    
    public Object[][] converBrand(List<Brand> list) {
        int rows = list.size();
        int cols = 2;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getBrandID();
            obj[i][1] = list.get(i).getBrandName();
        }
        return obj;
    }
}

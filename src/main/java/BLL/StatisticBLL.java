/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.StatisticDAL;
import java.util.List;

/**
 *
 * @author duyph
 */
public class StatisticBLL {

    private StatisticDAL staDAL;

    public StatisticBLL() {
        this.staDAL = new StatisticDAL();
    }

    public List totalSale() {
        return staDAL.totalSale();
    }

    public List topProduct() {
        return staDAL.topProduct();
    }
    
}

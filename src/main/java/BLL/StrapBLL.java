/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.StrapDAL;
import Entity.Strap;
import java.util.List;

/**
 *
 * @author jukut
 */
public class StrapBLL {

    public StrapDAL strdal;

    public StrapBLL() {
        strdal = new StrapDAL();
    }

    public void addStrap(Strap str) {
        strdal.addStrap(str);
    }

    public void delStrap(int id) {
        strdal.deleteStrap(id);
    }

    public void editStrap(int id, String name) {
        strdal.updateStrap(id, name);
    }

    public List loadStrap() {
        List list;
        list = strdal.getlistStrap();
        return list;
    }

    public Strap getStrap(int StrapID) {
        return strdal.getStrap(StrapID);
    }

    public Object[] convertList1(List<Strap> list) {
        int rows = list.size();
        Strap[] newList = new Strap[rows];
        for (int i = 0; i < rows; i++) {
            newList[i] = list.get(i);

        }
        return newList;
    }

    public Object[][] converStrap(List<Strap> list) {
        int rows = list.size();
        int cols = 2;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getStrapID();
            obj[i][1] = list.get(i).getStrapName();
        }
        return obj;
    }
}

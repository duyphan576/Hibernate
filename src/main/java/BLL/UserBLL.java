/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.UserDAL;
import Entity.Role;
import Entity.User;
import java.util.List;

/**
 *
 * @author jukut
 */
public class UserBLL {

    private UserDAL usdal;

    public UserBLL() {
        usdal = new UserDAL();
    }

    public List getUser(String us, String pass) {
        List l = usdal.getUser(us, pass);
        return l;
    }

    public Object[][] converProduct(List<User> list) {
        int rows = list.size();
        int cols = 4;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            String lock = "";
            obj[i][0] = list.get(i).getUserID();
            obj[i][1] = list.get(i).getUserName();
            obj[i][2] = list.get(i).getRole().getRoleName();
            if (list.get(i).getStatus() == 0) {
                lock = "Open";
            } else {
                lock = "Lock";
            }
            obj[i][3] = lock;
        }
        return obj;
    }

    public List loadUser() {
        List list = usdal.getAllUser();
        return list;
    }
    public void addUser(Role role, String username, String password,int status){
        usdal.addUser(role, username, password, status);
    }
}

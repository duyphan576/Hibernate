/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.RoleDAL;
import Entity.Role;
import java.util.List;

/**
 *
 * @author duyph
 */
public class RoleBLL {
    public RoleDAL roleDal;

    public RoleBLL() {
        roleDal = new RoleDAL();
    }

    public void addRole(Role br) {
        roleDal.addRole(br);
    }

    public void delRole(int id) {
        roleDal.deleteRole(id);
    }

    public void editRole(int id, String name) {
        roleDal.updateRole(id, name);
    }

    public void updateRole(int id, String name) {
        roleDal.updateRole(id, name);
    }

    public Role getRole(int RoleID) {
        return roleDal.getRole(RoleID);
    }

    public List loadRole() {
        return roleDal.getlistRole();
    }

    public Object[][] converRole(List<Role> list) {
        int rows = list.size();
        int cols = 2;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getRoleID();
            obj[i][1] = list.get(i).getRoleName();
        }
        return obj;
    }
}

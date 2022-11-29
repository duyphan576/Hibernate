/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Role;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author duyph
 */
public class RoleDAL {

    private static Session session;

    public RoleDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public void addRole(Role role) {
        session.beginTransaction();
        session.save(role);
        session.getTransaction().commit();
    }

    public void deleteRole(int id) {
        session.clear();
        session.beginTransaction();
        Role role = new Role();
        role.setRoleID(id);
        session.delete(role);
        session.getTransaction().commit();
    }

    public void updateRole(int id, String name) {
        session.clear();
        session.beginTransaction();
        Role role = new Role();
        role.setRoleID(id);
        role.setRoleName(name);
        session.update(role);
        session.getTransaction().commit();
    }

    public Role getRole(int RoleID) {
        Role obj;
        session.beginTransaction();
        obj = session.get(Role.class, RoleID);
        session.getTransaction().commit();
        return obj;
    }

    public List getlistRole() {
        List<Role> list;
        session.beginTransaction();
        list = session.createQuery("FROM Role", Role.class).list();
        session.getTransaction().commit();
        return list;
    }
    
}

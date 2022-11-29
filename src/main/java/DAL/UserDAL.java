/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entity.Role;
import Entity.User;
import Utils.HibernateUtils;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.query.Query;

/**
 *
 * @author jukut
 */
public class UserDAL {

    private Session session = HibernateUtils.getSessionFactory().openSession();
   
    public UserDAL() {
        session = HibernateUtils.getSessionFactory().openSession();
    }

    public List getUser(String username,String pass) {
        List list;
        session.beginTransaction();
        Query q = session.createQuery("FROM User WHERE UserName = :username AND Password = :pass");
        q.setParameter("username", username);
        q.setParameter("pass", pass);
        list =q.list();
        session.getTransaction().commit();
        return list;
    }
    public List getAllUser() {
        List<User> user;
        session.beginTransaction();
        user = session.createQuery("FROM User", User.class).list();
        session.getTransaction().commit();
        return user;
    }
     public void addUser(Role role, String username, String password,int status) {
        session.clear();
        session.beginTransaction();
        User us = new User();
        us.setRole(role);
        us.setUserName(username);
        us.setPassword(password);
        us.setStatus(status);
        session.save(us);
        session.getTransaction().commit();
    }
}

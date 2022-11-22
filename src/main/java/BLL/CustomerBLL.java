/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.CustomerDAL;
import Entity.Customer;
import java.util.List;

/**
 *
 * @author MSI VN
 */
public class CustomerBLL {

    public CustomerDAL cusdal;

    public CustomerBLL() {
        cusdal = new CustomerDAL();
    }

    public Customer getCustomer(int id) {
        return cusdal.getCustomer(id);
    }

    public void addCustomer(Customer customer) {
        Customer cus = new Customer();
        cus.setCustomerID(customer.getCustomerID());
        cus.setFullName(customer.getFullName());
        cus.setPassword(customer.getPassword());
        cus.setAddress(cus.getAddress());
        cusdal.addCustomer(cus);
    }

    public void delCustomer(int id) {
        cusdal.deleteCustomer(id);
    }

    public void editCustomer(Customer customer) {
        cusdal.updateCustomer(customer);
    }

    public List loadCustomer() {
        List list;
        list = cusdal.getlistCustomer();
        return list;
    }

    public Object[] convertList1(List<Customer> list) {
        int rows = list.size();
        Customer[] newList = new Customer[rows];
        for (int i = 0; i < rows; i++) {
            newList[i] = list.get(i);

        }
        return newList;
    }

    public Object[][] convertCustomer(List<Customer> list) {
        int rows = list.size();
        int cols = 3;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getCustomerID();
            obj[i][1] = list.get(i).getFullName();
            obj[i][2] = list.get(i).getAddress();
        }
        return obj;
    }
}

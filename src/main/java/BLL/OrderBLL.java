/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import Entity.Order;
import DAL.OrderDAL;
import java.util.List;

/**
 *
 * @author Clock
 */
public class OrderBLL {

    private OrderDAL orderDAL;

    public OrderBLL() {
        orderDAL = new OrderDAL();
    }

    public List loadOrder() {
        List list;
        list = orderDAL.loadOrder();
        return list;
    }

    public Order getOrder(int OrderID) {
        Order c = orderDAL.getOrder(OrderID);
        return c;
    }

        public void addOrder(Order c) {
        orderDAL.addOrder(c);
    }

    public void updateOrder(Order c) {
        orderDAL.updateOrder(c);
    }

    public void deleteOrder(Order c) {
        orderDAL.deleteOrder(c);
    }
    
    public Object[][] convertList(List<Order> list) {
        int rows = list.size();
        int cols = 8;
        Object[][] obj = new Object[rows][cols];
        for (int i = 0; i < rows; i++) {
            obj[i][0] = list.get(i).getOrderID();
            obj[i][1] = list.get(i).getUserID();
            obj[i][2] = list.get(i).getCustomerID();
            obj[i][3] = list.get(i).getTotalQuantity();
            obj[i][4] = list.get(i).getTotalPrice();
            obj[i][5] = list.get(i).getDate();
            obj[i][6] = list.get(i).getStatus();
            obj[i][7] = list.get(i).getListOrderDetail().size();
        }
        return obj;
    }

    public Order[] convertList1(List<Order> list) {
        int rows = list.size();
        Order[] newList = new Order[rows];
        for (int i = 0; i < rows; i++) {
            newList[i] = list.get(i);

        }
        return newList;
    }

}

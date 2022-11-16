/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import Entity.OrderDetail;
import DAL.OrderDetailDAL;
import java.util.List;
/**
 *
 * @author Clock
 */
public class OrderDetailBLL {
    private OrderDetailDAL orderdetailDAL;
    
    
    public OrderDetailBLL()
    {
        orderdetailDAL = new OrderDetailDAL();
    }
    
    public List loadOrderDetail()
    {
        List list;
        list = orderdetailDAL.loadOrderDetail();
        
        return list;
    }
    
    public List loadOrderDetailByOrderID(int OrderID)
    {
        List list;
        list = orderdetailDAL.loadOrderDetailByOrderID(OrderID);
        
        return list;
    }
    
    public OrderDetail getOrderDetail(int OrderDetailID)
    {
        OrderDetail c = orderdetailDAL.getOrderDetail(OrderDetailID);
        return c;
    }
    
    public void addOrderDetail(OrderDetail c)
    {
        orderdetailDAL.addOrderDetail(c);
    }
    
    public void updateOrderDetail(OrderDetail c)
    {
        orderdetailDAL.updateOrderDetail(c);
    }
    
    public void deleteOrderDetail(OrderDetail c)
    {
        orderdetailDAL.deleteOrderDetail(c);
    }
    
    
    public Object[][] convertList(List<OrderDetail> list)
    {
        int rows = list.size();
        int cols = 5;
        Object[][] obj = new Object[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            obj[i][0] = list.get(i).getOrderDetailID();
            obj[i][1] = list.get(i).getOrderID();
            obj[i][2] = list.get(i).getProductID();
            obj[i][3] = list.get(i).getQuantity();
            obj[i][4] = list.get(i).getPrice();            
        }
        return obj;
    }
    
    public OrderDetail[] convertList1 (List<OrderDetail> list)
    {
        int rows = list.size();
        OrderDetail[] newList = new OrderDetail[rows];
        for(int i = 0; i < rows; i++)
        {
            newList[i] = list.get(i);
            
        }
        return newList;
    }
}

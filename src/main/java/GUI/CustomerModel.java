/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Entity.Customer;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author ACER NITRO 5
 */
public class CustomerModel extends DefaultComboBoxModel<Customer> {

    public CustomerModel(Customer[] items) {
        super(items);
    }
}

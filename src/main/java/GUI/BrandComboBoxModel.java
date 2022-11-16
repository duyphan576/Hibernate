/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import Entity.Brand;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author TBao
 */
public class BrandComboBoxModel extends DefaultComboBoxModel<Brand> {

    public BrandComboBoxModel(Brand[] items) {
        super(items);
    }
}

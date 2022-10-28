/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import java.sql.Date;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * @author jukut
 */
@Data
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID;
    
    @Column
    private int UserID;
    
    @Column
    private int CustomerID;
    
    @Column
    private int TotalQuanity;
    
    @Column
    private float TotalPrice;
    
    @Column
    private Date Date;
    
    @Column
    private int Status;
    
}

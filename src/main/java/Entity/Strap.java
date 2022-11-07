/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
/**
 *
 * @author jukut
 */
@Data
@Entity
@Table(name = "Strap")
public class Strap implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int StrapID;
    
    @Column
    private String StrapName;
}

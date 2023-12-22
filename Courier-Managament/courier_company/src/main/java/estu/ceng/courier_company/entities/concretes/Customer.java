package estu.ceng.courier_company.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","payment", "delivery"})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cusid")
    private int id;

    @Column(name = "cusname")
    private String cusName;

    @Column(name = "cusmail")
    private String cusMail;

    @Column(name = "cusphone")
    private String cusPhone;

    @Column(name = "cusadress")
    private String cusAdress;

    @OneToMany(mappedBy = "customer")
    private List<Payment> payment;

    @OneToMany(mappedBy = "customer")
    private List<Delivery> delivery;


}

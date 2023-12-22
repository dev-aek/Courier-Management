package estu.ceng.courier_company.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "del_id")
    private int id;

    @Column(name = "del_desc")
    private String delDesc;

    @Column(name = "del_date")
    private Date delDate;

    @Column(name = "del_adress")
    private String delAdress;

    @ManyToOne()
    @JoinColumn(name = "fk_cus_id")
    private Customer customer;

    @ManyToOne()
    @JoinColumn(name = "fk_com_id")
    private Company company;

    @ManyToOne()
    @JoinColumn(name = "fk_pay_id")
    private Payment payment;

    @ManyToOne()
    @JoinColumn(name = "fk_cour_id")
    private Courier courier;
}

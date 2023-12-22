package estu.ceng.courier_company.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="payment")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler", "delivery"})
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pay_id")
    private int id;

    @Column(name = "pay_amount")
    private String payAmaount;

    @Column(name = "pay_date")
    private Date payDate;

    @Column(name = "pay_rept_no")
    private String payReptNo;

    @ManyToOne()
    @JoinColumn(name = "fk_cus_id")
    private Customer customer;

    @OneToMany(mappedBy = "payment")
    private List<Delivery> delivery;
}

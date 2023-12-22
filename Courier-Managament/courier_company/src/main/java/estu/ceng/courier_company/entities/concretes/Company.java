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
@Table(name="company")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler", "delivery"})
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "com_id")
    private int id;

    @Column(name = "com_name")
    private String comName;

    @Column(name = "com_mail")
    private String comMail;

    @Column(name = "com_phone")
    private String comPhone;

    @OneToMany(mappedBy = "company")
    private List<Delivery> delivery;
}

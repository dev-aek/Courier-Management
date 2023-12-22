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
@Table(name="courier")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler", "delivery"})

public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cour_id")
    private int id;

    @Column(name = "cour_type")
    private String courType;

    @Column(name = "cour_driver_ln")
    private String courDriverLN;

    @Column(name = "cusphone")
    private String cusPhone;

    @Column(name = "couriercol")
    private String couriercol;

    @OneToMany(mappedBy = "courier")
    private List<Delivery> delivery;
}

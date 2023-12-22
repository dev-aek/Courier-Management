package estu.ceng.courier_company.dataAccess.abstracts;

import estu.ceng.courier_company.entities.concretes.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface DeliveryDao extends JpaRepository <Delivery, Integer> {

    List<Delivery> findByDelDate(Date delDate);
}

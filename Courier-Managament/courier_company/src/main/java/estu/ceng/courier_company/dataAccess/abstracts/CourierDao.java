package estu.ceng.courier_company.dataAccess.abstracts;

import estu.ceng.courier_company.entities.concretes.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierDao extends JpaRepository<Courier, Integer> {
}

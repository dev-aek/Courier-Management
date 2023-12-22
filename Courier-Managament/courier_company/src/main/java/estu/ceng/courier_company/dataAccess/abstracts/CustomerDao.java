package estu.ceng.courier_company.dataAccess.abstracts;

import estu.ceng.courier_company.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Integer> {
}

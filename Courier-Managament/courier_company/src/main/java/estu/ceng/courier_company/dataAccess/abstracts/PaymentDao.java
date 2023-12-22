package estu.ceng.courier_company.dataAccess.abstracts;

import estu.ceng.courier_company.entities.concretes.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentDao extends JpaRepository<Payment,Integer> {
}

package estu.ceng.courier_company.business.abstracts;

import estu.ceng.courier_company.entities.concretes.Payment;

import java.util.List;

public interface PaymentService {
    List<Payment> getAll();

}

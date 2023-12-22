package estu.ceng.courier_company.business.concretes;

import estu.ceng.courier_company.business.abstracts.PaymentService;
import estu.ceng.courier_company.dataAccess.abstracts.PaymentDao;
import estu.ceng.courier_company.entities.concretes.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentManager implements PaymentService {

    private PaymentDao paymentDao;

    @Autowired
    public PaymentManager(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    @Override
    public List<Payment> getAll() {
        return paymentDao.findAll();
    }
}

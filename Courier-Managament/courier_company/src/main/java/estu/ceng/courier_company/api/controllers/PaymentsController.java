package estu.ceng.courier_company.api.controllers;

import estu.ceng.courier_company.business.abstracts.PaymentService;
import estu.ceng.courier_company.entities.concretes.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin
public class PaymentsController {

    private PaymentService paymentService;

    @Autowired
    public PaymentsController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/getall")
    public List<Payment> getall(){return this.paymentService.getAll();}
}

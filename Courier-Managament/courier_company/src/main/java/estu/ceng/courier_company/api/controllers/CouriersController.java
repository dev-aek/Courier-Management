package estu.ceng.courier_company.api.controllers;

import estu.ceng.courier_company.business.abstracts.CourierService;
import estu.ceng.courier_company.entities.concretes.Courier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/couriers")
@CrossOrigin
public class CouriersController {

    private CourierService courierService;

    @Autowired
    public CouriersController(CourierService courierService) {
        this.courierService = courierService;
    }

    @GetMapping("/getall")
    public List<Courier> getall(){
        return this.courierService.getAll();
    }
}

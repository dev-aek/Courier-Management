package estu.ceng.courier_company.api.controllers;

import estu.ceng.courier_company.business.abstracts.DeliveryService;
import estu.ceng.courier_company.entities.concretes.Delivery;
import estu.ceng.courier_company.entities.dtos.PostingDeliveryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
@CrossOrigin
public class DeliveriesController {
    private DeliveryService deliveryService;

    @Autowired
    public DeliveriesController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }


    @GetMapping("/getall")
    public List<Delivery> getall(){
        return this.deliveryService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody PostingDeliveryDto postingDeliveryDto)
    {
        this.deliveryService.add(postingDeliveryDto);
    }

    @GetMapping("/getbydeldate")
    public List<Delivery> findByDelDate(Date delDate){
        return this.deliveryService.findByDelDate(delDate);
    }
}

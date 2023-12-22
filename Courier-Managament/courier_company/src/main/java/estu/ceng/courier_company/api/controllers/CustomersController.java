package estu.ceng.courier_company.api.controllers;

import estu.ceng.courier_company.business.abstracts.CustomerService;
import estu.ceng.courier_company.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin
public class CustomersController {

    private CustomerService customerService;

    @Autowired
    public CustomersController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public List<Customer> getall(){
        return this.customerService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody Customer customer){
        this.customerService.add(customer);
    }
}

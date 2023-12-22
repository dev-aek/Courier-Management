package estu.ceng.courier_company.business.abstracts;

import estu.ceng.courier_company.entities.concretes.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAll();
    void add (Customer customer);
}

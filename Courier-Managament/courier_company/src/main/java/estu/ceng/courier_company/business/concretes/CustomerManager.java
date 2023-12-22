package estu.ceng.courier_company.business.concretes;

import estu.ceng.courier_company.business.abstracts.CustomerService;
import estu.ceng.courier_company.dataAccess.abstracts.CustomerDao;
import estu.ceng.courier_company.entities.concretes.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;

    @Autowired
    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public List<Customer> getAll() {
        return this.customerDao.findAll();
    }

    @Override
    public void add(Customer customer) {
        this.customerDao.save(customer);
    }
}

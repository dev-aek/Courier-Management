package estu.ceng.courier_company.business.concretes;

import estu.ceng.courier_company.business.abstracts.DeliveryService;
import estu.ceng.courier_company.dataAccess.abstracts.DeliveryDao;
import estu.ceng.courier_company.entities.concretes.*;
import estu.ceng.courier_company.entities.dtos.PostingDeliveryDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class DeliveryManager implements DeliveryService {

   private DeliveryDao deliveryDao;

    @Autowired
    public DeliveryManager(DeliveryDao deliveryDao) {
        this.deliveryDao = deliveryDao;
    }

    @Override
    public List<Delivery> getAll() {
        return null;
    }

    @Override
    public void add(PostingDeliveryDto postingDeliveryDto) {
        Delivery delivery = new Delivery(0,postingDeliveryDto.getDelDesc(),postingDeliveryDto.getDelDate(), postingDeliveryDto.getDelAdress(),
                new Customer(postingDeliveryDto.getCustomerId(),null,null,null,null,null,null),
                new Company(postingDeliveryDto.getCompanyId(),null,null,null,null),
                new Payment(postingDeliveryDto.getPaymentId(),null,null,null,null,null),
                new Courier(postingDeliveryDto.getCourierId(),null,null,null,null,null)
        );
        this.deliveryDao.save(delivery);
    }

    @Override
    public List<Delivery> findByDelDate(Date delDate) {
        return this.deliveryDao.findByDelDate(delDate);
    }
}

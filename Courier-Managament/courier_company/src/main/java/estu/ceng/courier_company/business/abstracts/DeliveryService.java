package estu.ceng.courier_company.business.abstracts;

import estu.ceng.courier_company.entities.concretes.Delivery;
import estu.ceng.courier_company.entities.dtos.PostingDeliveryDto;

import java.sql.Date;
import java.util.List;

public interface DeliveryService {
    List<Delivery> getAll();
    void add(PostingDeliveryDto postingDeliveryDto);
    List<Delivery> findByDelDate(Date delDate);
}

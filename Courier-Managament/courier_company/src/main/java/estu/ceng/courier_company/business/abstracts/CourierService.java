package estu.ceng.courier_company.business.abstracts;

import estu.ceng.courier_company.entities.concretes.Courier;

import java.util.List;

public interface CourierService {
    List<Courier> getAll();
}

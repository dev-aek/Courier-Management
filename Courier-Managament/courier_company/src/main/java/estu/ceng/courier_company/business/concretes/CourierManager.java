package estu.ceng.courier_company.business.concretes;

import estu.ceng.courier_company.business.abstracts.CourierService;
import estu.ceng.courier_company.dataAccess.abstracts.CourierDao;
import estu.ceng.courier_company.entities.concretes.Courier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierManager implements CourierService {

    private CourierDao courierDao;

    @Autowired
    public CourierManager(CourierDao courierDao) {
        this.courierDao = courierDao;
    }

    @Override
    public List<Courier> getAll() {
        return this.courierDao.findAll();
    }
}

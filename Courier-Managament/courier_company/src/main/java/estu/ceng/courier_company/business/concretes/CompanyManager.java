package estu.ceng.courier_company.business.concretes;

import estu.ceng.courier_company.business.abstracts.CompanyService;
import estu.ceng.courier_company.dataAccess.abstracts.CompanyDao;
import estu.ceng.courier_company.dataAccess.abstracts.CustomerDao;
import estu.ceng.courier_company.entities.concretes.Company;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {

    private CompanyDao companyDao;

    @Autowired
    public CompanyManager(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public List<Company> getAll() {
        return this.companyDao.findAll();
    }
}

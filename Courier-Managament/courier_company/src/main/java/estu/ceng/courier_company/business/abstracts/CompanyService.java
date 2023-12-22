package estu.ceng.courier_company.business.abstracts;

import estu.ceng.courier_company.entities.concretes.Company;

import java.util.List;

public interface CompanyService {
    List<Company> getAll();
}

package estu.ceng.courier_company.api.controllers;

import estu.ceng.courier_company.business.abstracts.CompanyService;
import estu.ceng.courier_company.entities.concretes.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/companies")
@CrossOrigin
public class CompaniesController {

    private CompanyService companyService;

    @Autowired
    public CompaniesController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/getall")
    public List<Company> getall(){
        return this.companyService.getAll();
    }
}

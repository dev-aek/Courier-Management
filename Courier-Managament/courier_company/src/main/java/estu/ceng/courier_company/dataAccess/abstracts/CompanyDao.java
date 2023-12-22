package estu.ceng.courier_company.dataAccess.abstracts;

import estu.ceng.courier_company.entities.concretes.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyDao extends JpaRepository<Company, Integer> {
}

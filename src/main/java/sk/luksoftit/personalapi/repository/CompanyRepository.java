package sk.luksoftit.personalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.Company;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    Company findFirstByCertificatesIn(List<Certificate> certificates);
}

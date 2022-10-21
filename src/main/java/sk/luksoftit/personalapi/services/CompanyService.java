package sk.luksoftit.personalapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.Company;
import sk.luksoftit.personalapi.repository.CompanyRepository;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Company findCompanyByCertification(Certificate certificate) {
        return companyRepository.findFirstByCertificatesIn(List.of(certificate));
    }
}

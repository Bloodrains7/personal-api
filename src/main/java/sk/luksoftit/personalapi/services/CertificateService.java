package sk.luksoftit.personalapi.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Service;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.repository.CertificateRepository;

import java.util.List;

@Service
public class CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;

    @SchemaMapping
    public List<Certificate> certificates() {
        return certificateRepository.findAll();
    }
}

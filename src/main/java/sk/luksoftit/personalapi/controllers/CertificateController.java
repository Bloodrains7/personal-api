package sk.luksoftit.personalapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.CertificationType;
import sk.luksoftit.personalapi.entity.Company;
import sk.luksoftit.personalapi.entity.Tag;
import sk.luksoftit.personalapi.services.CertificateService;
import sk.luksoftit.personalapi.services.CertificateTypeService;
import sk.luksoftit.personalapi.services.CompanyService;
import sk.luksoftit.personalapi.services.TagService;

import java.util.List;

@Controller
public class CertificateController {

    @Autowired
    private CertificateService certificateService;

    @Autowired
    private TagService tagService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CertificateTypeService certificateTypeService;

    @QueryMapping
    public List<Certificate> certificates() {
        return certificateService.certificates();
    }

    @SchemaMapping
    public List<Tag> tags(Certificate certificate) {
        return tagService.findTagsByCertification(certificate);
    }

    @SchemaMapping
    public Company company(Certificate certificate) { return companyService.findCompanyByCertification(certificate); }

    @SchemaMapping
    public List<CertificationType> types(Certificate certificate) {
        return certificateTypeService.findCertificationTypes(certificate);
    }
}

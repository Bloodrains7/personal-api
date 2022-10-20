package sk.luksoftit.personalapi.controllers;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.Tag;
import sk.luksoftit.personalapi.services.CertificateService;

import java.util.List;

@Controller
public class CertificateController {

    private CertificateService certificateService;

    @QueryMapping
    public List<Certificate> certificates() {
        return certificateService.certificates();
    }

    @SchemaMapping
    public List<Tag> tags(Certificate certificate) {
        return null;
    }
}

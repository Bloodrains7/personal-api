package sk.luksoftit.personalapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.CertificationType;
import sk.luksoftit.personalapi.repository.CertificateTypeRepository;

import java.util.List;

@Service
public class CertificateTypeService {

    @Autowired
    private CertificateTypeRepository certificateTypeRepository;

    public List<CertificationType> findCertificationTypes(Certificate certificate) {
        return certificateTypeRepository.findAllByCertificatesIn(List.of(certificate));
    }
}

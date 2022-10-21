package sk.luksoftit.personalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.CertificationType;

import java.util.List;

@Repository
public interface CertificateTypeRepository extends JpaRepository<CertificationType, Long> {

    List<CertificationType> findAllByCertificatesIn(List<Certificate> certificates);
}

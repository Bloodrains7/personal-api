package sk.luksoftit.personalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.luksoftit.personalapi.entity.Certificate;

public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}

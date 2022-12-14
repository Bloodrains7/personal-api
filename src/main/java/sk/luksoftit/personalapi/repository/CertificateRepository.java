package sk.luksoftit.personalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.luksoftit.personalapi.entity.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> {
}

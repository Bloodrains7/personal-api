package sk.luksoftit.personalapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.Tag;

import java.util.List;

public interface TagRepository extends JpaRepository<Tag, Long> {

    List<Tag> findAllByCertificatesIn(List<Certificate> certificates);
}

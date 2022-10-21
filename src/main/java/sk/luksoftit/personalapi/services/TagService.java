package sk.luksoftit.personalapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sk.luksoftit.personalapi.entity.Certificate;
import sk.luksoftit.personalapi.entity.Tag;
import sk.luksoftit.personalapi.repository.TagRepository;

import java.util.List;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> findTagsByCertification(Certificate certificate) {
        return tagRepository.findAllByCertificatesIn(List.of(certificate));
    }
}

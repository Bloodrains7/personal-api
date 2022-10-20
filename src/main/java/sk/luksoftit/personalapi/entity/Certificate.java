package sk.luksoftit.personalapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToOne(mappedBy = "certificate")
    private Company company;

    @Column(name = "duration")
    private String duration;

    @OneToMany(mappedBy = "certificate")
    private List<CertificationType> type;

    @Column(name = "parents")
    private Boolean parent;

    @Column(name = "url")
    private String url;

    @OneToMany(mappedBy = "certificate")
    private List<Tag> tags;
}

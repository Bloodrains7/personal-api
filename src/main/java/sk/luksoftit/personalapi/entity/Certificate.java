package sk.luksoftit.personalapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
@Entity
@Getter
@Setter
@Table(name = "certificate")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private Company company;

    @Column(name = "duration")
    private String duration;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "cert_type",
            joinColumns = @JoinColumn(name = "cert_id"),
            inverseJoinColumns = @JoinColumn(name = "type_id")
    )
    private List<CertificationType> types;

    @Column(name = "parents")
    private Boolean parent;

    @Column(name = "url")
    private String url;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name ="cert_tag",
            joinColumns = @JoinColumn(name = "cert_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags;
}

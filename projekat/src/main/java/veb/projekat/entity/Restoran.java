package veb.projekat.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Restoran implements Serializable{

    enum TipRestorana {ITALIJANKSI, KINESKI, SRPSKI, FRANCUSKI, GRCKI}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private TipRestorana tipRestorana;

    @OneToMany (mappedBy = "restoran", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Artikal> artikli = new HashSet<>();

    //@Column
    //private Lokacija lokacija;

    //@OneToMany
    //private Set<Lokacija> lokacija;

}

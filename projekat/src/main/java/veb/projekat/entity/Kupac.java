package veb.projekat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Kupac extends Korisnik{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // kupac ima vise porudzbina ??
    //@OneToMany(mappedBy = "kupac", cascade = CascadeType.ALL)
   // @JsonIgnore
    //private Set<Porudzbina> porudzbine = new HashSet<>();

    @ManyToMany
    private Set<Porudzbina> porudzbine = new HashSet<>();

    @Column
    private int sakupljeniBodovi;

    //@OneToOne(fetch = FetchType.EAGER)
    //private TipKupca tipKupca;
}

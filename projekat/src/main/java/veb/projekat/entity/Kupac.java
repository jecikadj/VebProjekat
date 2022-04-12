package veb.projekat.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Kupac extends Korisnik{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // kupac ima vise porudzbina
    //@OneToMany(mappedBy = "kupac")
    //private List<Porudzbina> porudzbine = new ArrayList<>();

    @Column
    private int sakupljeniBodovi;

    //@Column
    //private TipKupca tipKupca;
}

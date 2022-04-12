package veb.projekat.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Artikal implements Serializable {

    enum Tip {JELO, PICE}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;

    @Column
    private Double cena;

    @Column
    private Tip tip;

    @Column
    private int kolicina;

    @Column
    private String opis;

    //@ManyToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    //private Restoran restoran;

    //@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    //private Porudzbina porudzbina;
}

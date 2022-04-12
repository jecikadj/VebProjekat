package veb.projekat.entity;

import javax.persistence.*;
import java.io.Serializable;

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

   // @OneToMany

    //@Column
    //private Lokacija lokacija;

}

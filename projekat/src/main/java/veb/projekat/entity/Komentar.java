package veb.projekat.entity;

import javax.persistence.*;
import java.io.Serializable;


public class Komentar{

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Kupac kupac;

    @OneToOne(fetch = FetchType.EAGER)
    private Restoran restoran;

    private String tekst;

    private int ocena;


}

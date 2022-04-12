package veb.projekat.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Entity
public class Porudzbina implements Serializable {

    enum Status {OBRADA, U_PRIPREMI, CEKA_DOSTAVLJACA, U_TRANSPORTU, DOSTAVLJENA, OTKAZANA}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long UUID;

    //@OneToMany

    //@Column
    //private Restoran restoran;

    @Column
    private Date datum;

    @Column
    private Time vreme;

    @Column
    private Double cena;

    //@Column
    //private String korisnickoImeKupca;

    @Column
    private Status status;




}

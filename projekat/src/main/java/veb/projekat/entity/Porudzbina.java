package veb.projekat.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class Porudzbina implements Serializable {

    enum Status {OBRADA, U_PRIPREMI, CEKA_DOSTAVLJACA, U_TRANSPORTU, DOSTAVLJENA, OTKAZANA}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String uniqueID = UUID.randomUUID().toString();

    @OneToOne
    private Restoran restoran;

    @Column
    private LocalDateTime datumVreme;

    @Column
    private Double cena;

    @Column
    private String korisnickoImeKupca;

    @Column
    private Status status;

    @OneToMany()
    private Set<Artikal> poruceniArtikli;

    @ManyToOne(fetch = FetchType.EAGER)
    private Dostavljac dostavljac;





}

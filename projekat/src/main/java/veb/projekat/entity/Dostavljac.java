package veb.projekat.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Dostavljac extends Korisnik{

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "dostavljac", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Porudzbina> porudzbine = new HashSet<>();




}

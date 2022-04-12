package veb.projekat.entity;

import javax.persistence.Column;

public class TipKupca {

    enum Ime {ZLATNI, SREBRNI, BRONZANI}

    @Column
    private Ime ime;

    @Column
    private Double popust;

    @Column
    private int trazeniBrojBodova;


}

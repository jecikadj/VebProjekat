package veb.projekat.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Menadzer extends Korisnik{

    @OneToOne
    private Restoran restoran;

    public Menadzer() {}

    public Restoran getRestoran() {
        return restoran;
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    @Override
    public String toString() {
        return "Menadzer{" +
                "korisnickoIme='" + korisnickoIme + '\'' +
                ", lozinka='" + lozinka + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", pol='" + pol + '\'' +
                ", datumRodjenja=" + datumRodjenja +
                ", uloga=" + uloga +
                ", restoran=" + restoran +
                '}';
    }

    public Menadzer(Restoran restoran) {
        this.restoran = restoran;
    }

    public Menadzer(Long id, String korisnickoIme, String lozinka, String ime, String prezime, String pol, Date datumRodjenja, Uloga uloga, Restoran restoran) {
        super(id, korisnickoIme, lozinka, ime, prezime, pol, datumRodjenja, uloga);
        this.restoran = restoran;
    }
}

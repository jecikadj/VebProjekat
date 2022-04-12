package veb.projekat.entity;

import javax.persistence.Column;

public class Lokacija {

    @Column
    private Double geografskaDuzina;

    @Column
    private Double geografskaSirina;

    @Column
    private String adresa;

    public Double getGeografskaDuzina() {
        return geografskaDuzina;
    }

    public void setGeografskaDuzina(Double geografskaDuzina) {
        this.geografskaDuzina = geografskaDuzina;
    }

    public Double getGeografskaSirina() {
        return geografskaSirina;
    }

    public void setGeografskaSirina(Double geografskaSirina) {
        this.geografskaSirina = geografskaSirina;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Lokacija(Double geografskaDuzina, Double geografskaSirina, String adresa) {
        this.geografskaDuzina = geografskaDuzina;
        this.geografskaSirina = geografskaSirina;
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return "Lokacija{" +
                "geografskaDuzina=" + geografskaDuzina +
                ", geografskaSirina=" + geografskaSirina +
                ", adresa='" + adresa + '\'' +
                '}';
    }

    public Lokacija() {}
}

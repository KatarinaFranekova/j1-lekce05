package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Adresa {

    private String ulica;
    private String castObce;
    private String obec;
    private String psc;



    public void setUlica(String ulica) {
        Objects.requireNonNull(ulica);
        if (ulica.isBlank()) {
            System.err.println("Ulica nemůže být prázdné.");
            return;
        }
        this.ulica = ulica;
    }
    public String getUlica(String pekna) {
        return ulica;
    }



    public String getCastObce(String s) {
        return castObce;
    }

    public void setCastObce(String castObce) {
        Objects.requireNonNull(obec);
        if (castObce.isBlank()) {
            System.err.println("Cast obce nemůže být prázdné.");
            return;
        }
        this.castObce = castObce;
    }

    public String getObec(String mala) {
        return obec;
    }

    public void setObec(String obec) {
        Objects.requireNonNull(obec);
        if (obec.isBlank()) {
            System.err.println("Obec nemůže být prázdné.");
            return;
        }
        this.obec = obec;
    }

    public String getPsc(String s) {
        return psc;
    }

    public void setPsc(String psc) {
        Objects.requireNonNull(psc);
        if (psc.isBlank()) {
            System.err.println("Psc nemůže být prázdné.");
            return;
        }
        this.psc = psc;
    }
}

package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private String rodneCislo;

    private Telefon telefon;

    private String SukromnyEmail;

    private String PracovnyEmail;


    public void setJmeno(String jmeno) {
        Objects.requireNonNull(jmeno);
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Telefon getTelefon() {
        return telefon;
    }


    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String toString() {
        return jmeno + " " + prijmeni + " (" + rodneCislo + ")";
    }


    public void setSukromnyEmail(String SukromnyEmail) {
        Objects.requireNonNull(SukromnyEmail);
        if (SukromnyEmail.isBlank()) {
            System.err.println("Sukromny Email nemůže být prázdné.");
            return;
        }
        this.SukromnyEmail = SukromnyEmail;
    }

    public String getSukromnyEmail() {
        return SukromnyEmail;
    }


    public String getPracovnyEmail() {
        return PracovnyEmail;
    }

    public void setPracovnyEmail(String PracovnyEmail) {
        Objects.requireNonNull(PracovnyEmail);
        if (PracovnyEmail.isBlank()) {
            System.err.println("Pracovny Email nemůže být prázdné.");
            return;
        }
        this.PracovnyEmail = PracovnyEmail;


    }

}

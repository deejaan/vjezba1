package ba.unsa.etf.rs.dodatnitut;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Student {
    private String ime, prezime;
    private Integer index;
    private LocalDate datumRodjenja;

    public Student() {
    }

    public Student(String ime, String prezime, Integer index, LocalDate datumRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.index = index;
        this.datumRodjenja = datumRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public LocalDate getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(LocalDate datumRodjenja) {
        this.datumRodjenja = datumRodjenja;
    }

    @Override
    public String toString() {
        return getIme() + " " + getPrezime() + " (" + getIndex() + ")" + " - " + getDatumRodjenja().format(DateTimeFormatter.ofPattern("dd. MM. yyyy"));
    }
}

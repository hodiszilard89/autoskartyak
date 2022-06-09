package hu.nye.progkorny.autoskartyak.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


public class Kartya {


    private  Long id;
    private String gyarto;
    private String tipus;
    private Uzemanyag uanyag;
    private int telje;
    private int gyors;
    private int hszam;
    private int lgsb;

    public Kartya(){}

    public Kartya(Long id, String gyarto, String tipus, Uzemanyag uanyag, int telje, int gyors, int hszam, int lgsb) {
        this.id= id;
        this.gyarto = gyarto;
        this.tipus = tipus;
        this.uanyag= uanyag;
        this.telje = telje;
        this.gyors = gyors;
        this.hszam = hszam;
        this.lgsb = lgsb;
    }

    public String getGyarto() {
        return gyarto;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getTelje() {
        return telje;
    }

    public void setTelje(int telje) {
        this.telje = telje;
    }

    public int getGyors() {
        return gyors;
    }

    public void setGyors(int gyors) {
        this.gyors = gyors;
    }

    public int getHszam() {
        return hszam;
    }

    public void setHszam(int hszam) {
        this.hszam = hszam;
    }

    public int getLgsb() {
        return lgsb;
    }

    public void setLgsb(int lgsb) {
        this.lgsb = lgsb;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uzemanyag getUanyag() {
        return uanyag;
    }

    public void setUanyag(Uzemanyag uanyag) {
        this.uanyag = uanyag;
    }
}

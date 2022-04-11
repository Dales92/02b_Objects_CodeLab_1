package com.cc.java;

public class Konto {

    private int kontostand;

    public Konto(int kontostand) {
        this.kontostand = kontostand;
    }

    // Getter
    public int getKontostand() {
        return kontostand;
    }

    // modifiz. Setter
    public void setKontostand(int factor) {
        // this.kontostand = factor * this.kontostand;
        this.kontostand *= factor;
    }

    
}

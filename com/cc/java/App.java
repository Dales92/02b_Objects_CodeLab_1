package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        // Instanziierung
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        // Abfrage Kontostand über Getter
        output("Konto 1: " + konto1.getKontostand());
        output("Konto 2: " + konto2.getKontostand());
        output("Konto 3: " + konto3.getKontostand());
        output("------------------");

        // *2 / *3 / *10
        konto1.setKontostand(2); // Verdoppelung
        konto2.setKontostand(3); // Verdreifachung
        konto3.setKontostand(10); // Verzehnfachung

        // Abfrage Kontostand über Getter
        output("Konto 1: " + konto1.getKontostand());
        output("Konto 2: " + konto2.getKontostand());
        output("Konto 3: " + konto3.getKontostand());
        output("------------------");



    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


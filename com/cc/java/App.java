package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
        // Instanziierung
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        // Abfrage Kontostand über Getter
        pollAccounts(konto1, konto2, konto3);

        // *2 / *3 / *10
        konto1.setKontostand(2); // Verdoppelung
        konto2.setKontostand(3); // Verdreifachung
        konto3.setKontostand(10); // Verzehnfachung

        // Abfrage Kontostand über Getter
        pollAccounts(konto1, konto2, konto3);
    }

    public static void pollAccounts(Konto k1, Konto k2, Konto k3) {
        output("Konto 1: " + k1.getKontostand());
        output("Konto 2: " + k2.getKontostand());
        output("Konto 3: " + k3.getKontostand());
        output("------------------"); 
    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


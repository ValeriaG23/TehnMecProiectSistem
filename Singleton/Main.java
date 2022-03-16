package com.company;

public class Main {

    public static void main(String[] args) {
            Singleton blugi = Singleton.Singleton();
            Singleton bluza = Singleton.Singleton();
            Singleton adidasi = Singleton.Singleton();
            Singleton sorti = Singleton.Singleton();

            blugi.s = (blugi.s).toUpperCase();
            System.out.println("Comanda blugi " + blugi.s);
            System.out.println("Comanda bluza " + bluza.s);
            System.out.println("Comanda adidasi " + adidasi.s);
            System.out.println("Comanda sorti " + sorti.s);
            System.out.println("\n");

            sorti.s = (sorti.s).toLowerCase();
            System.out.println("Comanda blugi " + blugi.s);
            System.out.println("Comanda bluza " + bluza.s);
            System.out.println("Comanda adidasi " + adidasi.s);
            System.out.println("Comanda sorti " + sorti.s);
        }

}

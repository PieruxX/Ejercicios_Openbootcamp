package com.campusopenbootcamp;

public class Coche {
    public int Puertas = 1;

    public void anadirPuertas() {

        this.Puertas++;
    }
}

 class Main{

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.anadirPuertas();
        System.out.println(miCoche.Puertas);
    }

}



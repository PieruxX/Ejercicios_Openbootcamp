package com.campusopenbootcamp;

public class Ejercicio1 {
    public static int sumaTresNumeros(int num1, int num2, int num3) {
        int suma = num1 + num2 + num3;
        return suma;
    }

    public static void main(String[] args) {
        int resultado = sumaTresNumeros(10, 30, 5);
        System.out.println(resultado);
    }
}

package com.paolo;

import java.util.Scanner;

public class Pregunta4 {

    String capacLlenado;
    String Marca;
    String Modelo;
    String Color;

    public static void main(String[] args) {

        Scanner caracteristica = new Scanner(System.in);
        Pregunta4 auto = new Pregunta4();

        System.out.println("Ingrese la Capacidad de Llenado del Auto: ");
        auto.capacLlenado = caracteristica.next();

        System.out.println("Ingrese la Marca del Auto: ");
        auto.Marca = caracteristica.next();

        System.out.println("Ingrese el Modelo del Auto: ");
        auto.Modelo = caracteristica.next();

        System.out.println("Ingrese el Color del Auto: ");
        auto.Color = caracteristica.next();

        System.out.println("");
        System.out.println("Las Caracteristicas o Datos de un Auto ");
        System.out.println("Capacidad de Llenado: "+auto.capacLlenado);
        System.out.println("Marca: "+auto.Marca);
        System.out.println("Modelo: "+auto.Modelo);
        System.out.println("Color: "+auto.Color);
    }
}

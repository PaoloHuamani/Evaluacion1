package com.paolo;

import java.util.Scanner;

public class Pregunta2 {

    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero para ser elevado al cuadrado: ");
        int numero = scaner.nextInt();

        int operacion = numero * numero;

        System.out.println("El resultado es: "+operacion);

    }
}

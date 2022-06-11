package com.paolo;

import java.util.Scanner;

public class Pregunta3 {

    Scanner scaner = new Scanner(System.in);

    public Pregunta3(){
        double area, radio;
        double longitud;
        System.out.println("Ingrese el radio del circulo: ");
        radio= scaner.nextDouble();

        area = Math.PI*Math.pow(radio,2);
        longitud=2*Math.PI*radio;
        System.out.println("El area del circulo es: "+area);
        System.out.println("La longitud de la circunferencia es: "+longitud);
    }

    public static void main(String[] args){
        Pregunta3 operacion = new Pregunta3();

        System.out.println(operacion);
    }
}

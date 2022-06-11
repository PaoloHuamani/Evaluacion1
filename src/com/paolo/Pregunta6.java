package com.paolo;

import java.util.Scanner;

public class Pregunta6 {

    static Scanner scaner = new Scanner(System.in);


    public static void main(String[] args){

        System.out.println("Ingrese el primer numero");
        double n1=scaner.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double n2=scaner.nextDouble();
        String operacion=Double.toString(Decimal(n1,n2));
        System.out.println(operacion);
    }
    static double Decimal(double n1,double n2){
        double operacion=n1*n2;
        return operacion;
    }

}

package com.paolo;

import java.util.Scanner;

public class Pregunta1 {

    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);

        System.out.println("Ingrese usuario:");
        String usu = scaner.nextLine();
        System.out.println("Ingrese su habilidad:");
        String habilidad = scaner.nextLine();

        System.out.println("Su usuario es: "+usu +" y su habilidad es "+habilidad);

    }


}

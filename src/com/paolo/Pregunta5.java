package com.paolo;

import java.util.Scanner;

public class Pregunta5 {

    public static void main(String[] args){

        Scanner scaner = new Scanner(System.in);

        int num;

        System.out.println("Ingrese el numero para verificar si es par o impar: ");
        num = scaner.nextInt();

        if (num% 2==0) {
            System.out.println(num+" Es un Numero Par");
        }
        else {
            System.out.println(num+" Es un Numero Impar");
        }
    }
}

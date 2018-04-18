package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {
    
    public static void main(String[] args) {

        System.out.println("Escribe un numero");
        Scanner keyboard = new Scanner(System.in);
        int valor = keyboard.nextInt();
        Random generator = new Random();
        int random = generator.nextInt(10) + 1;

        if (valor == random){
            System.out.println("Es Correcto");
            System.exit(0);
        }
        else if (valor > random) {
            System.out.println("Es mayor");
        }
        else  {
            System.out.println("Es menor");
        }

        valor = keyboard.nextInt();
        if (valor == random){
            System.out.println("Es Correcto");
            System.exit(0);
        }
        else if (valor > random) {
            System.out.println("Es mayor");
        }
        else  {
            System.out.println("Es menor");
        }

        valor = keyboard.nextInt();
        if (valor == random){
            System.out.println("Es Correcto");
            System.exit(0);
        }
        System.out.println("Has perdido el numero correcto es " + random);
    }

}

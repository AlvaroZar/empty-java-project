package com.teaching.android;

import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {
        System.out.println("Escribe un numero");
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        if(valor % 2 == 0) {
            System.out.println("Es par");
        }
        else {
            System.out.println("Es impar");
        }
    }

}

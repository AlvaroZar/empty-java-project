package com.teaching.android;

import java.util.Random;
import java.util.Scanner;

/**
 * Empty Java App for teaching purposes.
 */
public class JavaApp {

    public static void main(String[] args) {

        Persona p1 = new Persona("Paco", 100f);
        Persona p2 = new Persona("Pepe",500f);
        p1.pagar(p2, 400f);
        String nombre1 = p1.getNombre();
        System.out.println(nombre1);
        System.out.println(" tiene "+ p1.getDinero() + "€");
        String nombre2 = p2.getNombre();
        System.out.println(nombre2);
        System.out.println(" tiene "+ p2.getDinero() + "€");
        p1.setDinero(0);
        }

    }

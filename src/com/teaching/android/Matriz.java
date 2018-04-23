package com.teaching.android;

public class Matriz {

    private int[][] matriz;


    public Matriz(int size) {
        this.matriz = new int[size][size];

    }
    /**
     * Iniciar la matriz
     * @param vector datos iniciales
     */

    public void asignarDatos(int[]vector) {
        if (Math.sqrt(vector.length) == matriz.length) {
            int indice = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = vector[indice++];

                }

            }
        }
        else {
            System.out.println("No compatible");
        }
    }

    public void suma(Matriz m) {
        if (m.matriz.length == this.matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    this.matriz[i][j] = this.matriz[i][j] += m.matriz[i][j];
                }
            }
        }
        else {
            System.out.println("No compatible");
        }
    }
        public void producto (Matriz m){
            if (m.matriz.length == this.matriz.length) {
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                        this.matriz[i][j] = this.matriz[i][j] *= m.matriz[i][j];
                    }
                }
            }
            else{
                System.out.println("No compatible");
            }
        }
        public void mostrar (Matriz m){
              for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(m.matriz[i][j]);
                }
                System.out.println();
            }
        }
    }


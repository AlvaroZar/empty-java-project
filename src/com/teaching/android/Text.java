package com.teaching.android;

public class Text {
    /**
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Matriz m = new Matriz(3);
        Matriz n = new Matriz(3);

        int[] vector = {3, 2, 1, 1, 2, 3, 2, 3, 1};m.asignarDatos(vector);
        m.asignarDatos(new int[]{3, 2, 1, 1, 2, 3, 2, 3, 1});
        int[] vector2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};n.asignarDatos(vector2);
        n.asignarDatos(new int[]{1, 1, 2, 2, 1, 1, 1, 2, 1});


        m.mostrar();
        n.mostrar();

        m.producto(n);
        m.mostrar();

        m.suma(n);
        m.mostrar();

    }
}

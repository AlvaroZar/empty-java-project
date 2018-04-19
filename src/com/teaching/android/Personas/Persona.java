
package com.teaching.android.Personas;

public class Persona {
    private String nombre;
    private float dinero;

    public Persona(String pnombre, float pdinero){
        nombre = pnombre;
        dinero = pdinero;
        System.out.println(" Crea un nombre "+ nombre +" dinero " + dinero + "€");
    }
    public void pagar(Persona p, float cantidad){
        this.dinero = this.dinero + cantidad;
        p.dinero = p.dinero - cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDinero() {
        return dinero;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDinero(float dinero){

    }
}

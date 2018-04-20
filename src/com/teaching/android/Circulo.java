package com.teaching.android;

public class Circulo {
    private Punto centro;
    private int radio;


    public Circulo(){

    }

    public Circulo(int pX ,int pY, int rRadio){
        centro = new Punto(pX,pY);
        radio = radio;


    }

    public Circulo(Punto p, int pRadio){
         centro = p;
         radio = pRadio;


    }

    public int getRadio(){
    return radio;
    }

    public Punto getCentro(){
        return centro;
    }

    public void setRadio(int radio){
        this.radio = radio;
    }

    public void setCentro(Punto centro){
        this.centro = centro;
    }

    public double getArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    public double getCircumference(){
        return 2 * Math.PI * radio;
    }

}

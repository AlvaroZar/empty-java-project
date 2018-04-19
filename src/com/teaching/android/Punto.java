package com.teaching.android;

public class Punto {
    private int x;
    private int y;

    public Punto(){

    }
    public Punto(int pX,int pY){
        x = pX;
        y = pY;
        System.out.println("Parametro x " + x + " Paramero y " + y);
    }
    public double distancia(int pX, int pY){
     int diferenciaX = pX - x;
     int diferenciaY = pY - y;
     double diferenciaXElevado = Math.pow(diferenciaX,2);
     double diferenciaYElavado = Math.pow(diferenciaY,2);
     double suma = diferenciaXElevado + diferenciaYElavado;
     double resultado= Math.sqrt(suma);

     return resultado;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

   public void setX(){
    this.x = x;
   }
   public void setY (){
    this.y = y;
   }
   public double distancia(Punto pDestino){
       int diferenciaX = pDestino.x - x;
       int diferenciaY = pDestino.y - y;
       double diferenciaXElevado = Math.pow(diferenciaX,2);
       double diferenciaYElavado = Math.pow(diferenciaY,2);
       double suma = diferenciaXElevado + diferenciaYElavado;
       double resultado= Math.sqrt(suma);

       return resultado;
   }


    public String toString() {
        return "Punto{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.base.entidades;

/**
 *
 * @author DIANA
 */
public abstract class Vehiculo {
  private int alto;
  private int ancho;
  private int largo;

    

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    
   public Vehiculo(int alto ,int ancho,int largo){
    setAlto(alto);
    setAncho(ancho);
    setLargo(largo);
    
}
   public String toString(){
       return "( -altura:"  + alto +  " -ancho:" + ancho + " -largo:" + largo +")";
   }
}
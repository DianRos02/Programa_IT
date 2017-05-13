/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Vehiculo;

/**
 *
 * @author DIANA
 */
public class Auto extends Vehiculo{
    
    String marca;
    String modelo;
    String color;

    public  Auto(String marca,String modelo,String color,int alto,int ancho,int largo) {
        super(alto, ancho, largo);
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        
    }

   
    public String toString(){
        return marca + " "+ modelo + " " + color +" "+super.toString();
               
                }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
                  
}

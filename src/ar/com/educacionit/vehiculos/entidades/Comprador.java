/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.vehiculos.entidades;

import ar.com.educacionit.base.entidades.Persona;

/**
 *
 * @author DIANA
 */
public class Comprador extends Persona{
   private double presupuesto; 

    public Comprador(String nombre, String apellido, String numeroDocumento,double presupuesto) {
        super(nombre, apellido, numeroDocumento);
        this.presupuesto=presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public String toString(){
        return super.toString() + " Presupuesto $: "+presupuesto;
    }
}

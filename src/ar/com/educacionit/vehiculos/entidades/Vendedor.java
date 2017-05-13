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
public class Vendedor extends Persona {
    private int cantAutosVendidos;

    
    
    public Vendedor(String nombre,String apellido,String numeroDocumento,int cantAutosVendidos) {
        super(nombre, apellido, numeroDocumento);
       this.cantAutosVendidos=cantAutosVendidos;
    }
    public String toString(){
       return super.toString() + " Autos Vendidos:" + cantAutosVendidos;
    }
    public int getCantAutosVendidos() {
        return cantAutosVendidos;
    }

    public void setCantAutosVendidos(int cantAutosVendidos) {
        this.cantAutosVendidos = cantAutosVendidos;
    }
    
}

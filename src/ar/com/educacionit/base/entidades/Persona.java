/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.educacionit.base.entidades;


public abstract class Persona {
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
    public Persona(String nombre,String apellido,String numeroDocumento){
        setNombre(nombre);
        setApellido(apellido);
        setNumeroDocumento(numeroDocumento);
        
}
    public String toString(){
        return nombre+ " " + apellido + " " + " DNI: " + numeroDocumento; 
    }
}
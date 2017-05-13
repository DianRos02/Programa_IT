package ar.com.educacionit.vehiculos.pruebas;
import ar.com.educacionit.vehiculos.entidades.Auto;
import ar.com.educacionit.vehiculos.entidades.Comprador;
import ar.com.educacionit.vehiculos.entidades.Vendedor;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */









public class Programa {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Vehiculo v=new Vehiculo(85,110,250) {};
        System.out.println("MEDIDAS DEL VEHICULO");
        
        System.out.println("Alto :" +v.getAlto());
        System.out.println("Ancho :" +v.getAncho());
        System.out.println("Largo :" +v.getLargo());
        System.out.println("---------------------");
        
        System.out.println("DATOS DE PERSONA!!");
        
        Persona p=new Persona("Natalia","Paredes","34.567.888") {};
           System.out.println("Nombre="+ p.getNombre());
            System.out.println("Apellido="+ p.getApellido());
            System.out.println("Numero de Documento="+ p.getNumeroDocumento());*/
       
       System.out.println("CARACTERISTICAS DEL AUTO");
       Auto au = new Auto("Toyota","Corolla","Gris",85,120,250);
       System.out.println(au);
       
       System.out.println();
       
       System.out.println(" DATOS DEL COMPRADOR" );
      Comprador c= new Comprador("José","Rojas","94.456.554",180000);
      System.out.println(c);
      
      System.out.println();
      System.out.println( " DATOD DEL VENDEDOR ");
       Vendedor v1= new Vendedor("Pedro","Martinez","92.472.178",4);
       System.out.println(v1);
       
       
        
       
       
       
       
        }
    }
    



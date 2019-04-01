/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;
/**
 *
 * @author Byron
 * Aqui se estan creando get y set para llamar a una clase dentro de 
 * otra clase codigo por desarrollar
 */
public class Seccion {
    private String nombreSeccion;
    private Noticia noticia[];
            
public void setNombreSeccion(String nombreSeccion){
      this.nombreSeccion = nombreSeccion;
}


public String getNombreSeccion( ){
        return this.nombreSeccion;
    }

}

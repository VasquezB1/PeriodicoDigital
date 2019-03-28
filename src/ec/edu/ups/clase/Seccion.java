/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;
/**
 *
 * @author Byron
 */
public class Seccion {
    private String nombreSeccion;
    private String[] noticia;
            
public void setNombreSeccion(String nombreSeccion){
      this.nombreSeccion = nombreSeccion;
}

public void setNoticia(String[] noticia){
    this.noticia = noticia;
}

public String getNombreSeccion( ){
        return this.nombreSeccion;
    }
public String[] getNoticia(){
    return this.noticia;
} 
}

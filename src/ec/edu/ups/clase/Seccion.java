/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Byron Aqui se estan creando get y set para llamar a una clase dentro
 * de otra clase codigo por desarrollar
 */
public class Seccion {

    private String nombreSeccion;
    private List<Noticia> noticias;

    //Uso de constructores
    /* Deben ser publicos
       Nada en el medio  - no retorna
       Igual a la clase
     */
    public Seccion() {
        noticias = new ArrayList<>(); //Crea una nueva lista pues esta instanciando

    }

    @Override
    public String toString() {
        return "Seccion{" + "nombreSeccion=" + nombreSeccion + ", noticias=" + noticias + '}';
    }

    public void setNombreSeccion(String nombreSeccion) {
        this.nombreSeccion = nombreSeccion;
    }

    public String getNombreSeccion() {
        return this.nombreSeccion;
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);

    }
}

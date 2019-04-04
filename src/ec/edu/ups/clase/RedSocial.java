/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;
/**
 *
 * @author Byron
 * Esta clase sirvio como apoyo y base para nuestras demas clases pues asi 
 * pudimos darnos un avanze en todas las demas clases a crear
 */
public class RedSocial {

    private int codigo;
    private String nombre;
    private String url;
    private String[] publicaciones;

    @Override
    public String toString() {
        return "RedSocial{" + "nombre=" + nombre + ", url=" + url + '}';
    }
    

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public int getCodigo( ){
        return this.codigo;
    }
    
    public String getNombre( ){
        return this.nombre;
    }
    
    public String getUrl( ){
        return this.url;
    }
}

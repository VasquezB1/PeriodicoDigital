/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clase;

import java.util.Date;

/**
 * @author Byron
 * @date 31 de Marzo del 2019 En esta clase estan definidas la estrucutra
 * principal de nuestro periodico
 *
 */
public class Noticia {

    private String titulo;
    private String autor;
    private Date fecha;
    private String contenido;
    private String lugar;
    private Multimedia[] multimedia;

    @Override
    public String toString() {
        return "Noticia{" + "titulo=" + titulo + ", autor=" + autor + ", fecha=" + fecha + ", contenido=" + contenido + ", lugar=" + lugar + ", multimedia=" + multimedia + '}';
    }

    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setMultimedia(Multimedia[] multimedia) {
        this.multimedia = multimedia;
    }
    
    public void setLugar(String lugar){
        this.lugar = lugar;
    }
    
    public String getLugar(){
        return this.lugar;
    }
    
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getContenido() {
        return this.contenido;
    }

    public Multimedia[] getMultimedia() {
        return this.multimedia;
    }
}

//Benjamin Malo y Geronimo Yiansens
package Dominio;

import java.io.Serializable;


public class Tematica implements Serializable{
    private String nombre;
    private String descripcion;
    
    public Tematica(String nombre,String descripcion){
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public String toString() {
        return "Tematica{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
    } 
}

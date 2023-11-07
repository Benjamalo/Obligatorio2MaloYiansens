package Dominio;
import javax.swing.JTextField;
public class Tematica {
    private String nombre;
    private String descripcion;
    private int nivel;
    public Tematica(String nombre, int nivel){
        this.nombre=nombre;
        this.nivel =nivel;
        
    }
    public Tematica(){
    
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
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

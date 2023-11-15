
package Dominio;



public class Persona{
    private String nombre;
    private int cedula;
    private String direccion;
    
    public Persona(String nombre, int cedula, String direccion){
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }
    public Persona(){
        this.nombre = "";
        this.cedula = 0;
        this.direccion = "";
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}

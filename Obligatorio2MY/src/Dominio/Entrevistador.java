
package Dominio;


public class Entrevistador extends Persona {
    private int ingreso;
    
    public Entrevistador(String nombre, int cedula, String direccion, int ingreso){
        
        super(nombre, cedula, direccion);
        
        this.ingreso = ingreso;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }
    
}

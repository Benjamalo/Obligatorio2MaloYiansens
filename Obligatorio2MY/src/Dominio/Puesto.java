package Dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class Puesto implements Serializable {
    private String nombre;
    private String tipoDeTrabajo;
    private ArrayList<String> temasRequeridos;
    
    public Puesto(String nombrePuesto,String tipoDeTrabajo,ArrayList<String> temasRequeridos){
        this.nombre = nombrePuesto;
        this.tipoDeTrabajo=tipoDeTrabajo;
        this.temasRequeridos = new ArrayList<>(temasRequeridos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDeTrabajo() {
        return tipoDeTrabajo;
    }

    public void setTipoDeTrabajo(String tipoDeTrabajo) {
        this.tipoDeTrabajo = tipoDeTrabajo;
    }

    public ArrayList<String> getTemasRequeridos() {
        return temasRequeridos;
    }

    public void setTemasRequeridos(ArrayList<String> temasRequeridos) {
        this.temasRequeridos = temasRequeridos;
    }

    @Override
    public String toString() {
        return "Puesto{" + "nombre=" + nombre + ", tipoDeTrabajo=" + tipoDeTrabajo + ", temasRequeridos=" + temasRequeridos + '}';
    }
    
}

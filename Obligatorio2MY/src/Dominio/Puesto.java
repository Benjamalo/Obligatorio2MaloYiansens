package Dominio;

import java.util.ArrayList;

public class Puesto {
    private String nombre;
    private String tipoDeTrabajo;
    private ArrayList<Tematica> temasRequeridos;
    public Puesto(String nombrePuesto,String tipoDeTrabajo,ArrayList<Tematica> temasRequeridos){
        this.nombre = nombrePuesto;
        this.tipoDeTrabajo=tipoDeTrabajo;
        this.temasRequeridos= temasRequeridos;
    }
}

//Benjamin Malo y Geronimo Yiansens
package Dominio;

import java.util.*;

public class Postulante extends Persona{
    
    private String linkedIn;
    private int telefono;
    private String mail;
    private String modalidad;
    private ArrayList<TematicaExperiencia> tematicas;
    
    public Postulante(String nombre, int cedula, String direccion, String linkedIn, int telefono, String mail, String modalidad,ArrayList<TematicaExperiencia> tema){
     
        super(nombre, cedula, direccion);  
        this.linkedIn = linkedIn;
        this.telefono = telefono;
        this.mail = mail;
        this.modalidad = modalidad;
        this.tematicas = new ArrayList<>(tema);
    }
    
    
    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public ArrayList<TematicaExperiencia> getTematicas() {
        return tematicas;
    }
    public void setTematicas(ArrayList<TematicaExperiencia> tematicas) {
        this.tematicas = tematicas;
    }
    @Override
    public String toString(){
        return getNombre() + "(" + getCedula()+ ")" + "tematicas: " + getTematicas();
    }
}


package Dominio;
public class TematicaExperiencia {
    private String nombreTematica;
    private int nivelExperiencia;

    public TematicaExperiencia(String nombreTematica, int nivelExperiencia) {
        this.nombreTematica = nombreTematica;
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getNombreTematica() {
        return nombreTematica;
    }

    public int getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNombreTematica(String nombreTematica) {
        this.nombreTematica = nombreTematica;
    }

    public void setNivelExperiencia(int nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    @Override
    public String toString() {
        return nombreTematica  + nivelExperiencia ;
    }
}


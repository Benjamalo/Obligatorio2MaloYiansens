
package Dominio;


public class Entrevista {
    private Entrevistador entrevistador;
    private Postulante postulante;
    private int puntaje;
    private String comentarios;
    private int ID;
    
    public Entrevista(Entrevistador entrevistador, Postulante postulante, int puntaje, String comentarios, int ID){
        this.entrevistador= entrevistador;
        this.postulante = postulante;
        this.puntaje = puntaje;
        this.comentarios = comentarios;
        this.ID = ID;
    }

    public Entrevistador getEntrevistador() {
        return entrevistador;
    }

    public void setEntrevistador(Entrevistador entrevistador) {
        this.entrevistador = entrevistador;
    }

    public Postulante getPostulante() {
        return postulante;
    }

    public void setPostulante(Postulante postulante) {
        this.postulante = postulante;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}


package Dominio;

import java.util.ArrayList;


public class Sistema {
    private ArrayList<Postulante> listaDePostulantes = new ArrayList<>();
    private ArrayList<Tematica> listaDeTematicas = new ArrayList<>();
    private ArrayList<Entrevistador> listaDeEntrevistadores = new ArrayList<>();
    public Sistema(){
    }

    public ArrayList<Tematica> getListaDeTematicas() {
        return listaDeTematicas;
    }

    public void setListaDeTematicas(ArrayList<Tematica> listDeTematicas) {
        this.listaDeTematicas = listDeTematicas;
    }

    public ArrayList<Postulante> getListaDePostulantes() {
        return listaDePostulantes;
    }

    public void setListaDePostulantes(ArrayList<Postulante> listaDePostulantes) {
        this.listaDePostulantes = listaDePostulantes;
    }

    public ArrayList<Entrevistador> getListaDeEntrevistadores() {
        return listaDeEntrevistadores;
    }

    public void setListaDeEntrevistadores(ArrayList<Entrevistador> listaDeEvaluadores) {
        this.listaDeEntrevistadores = listaDeEvaluadores;
    }
    public void agregarEntrevistador(String nombre, int cedula, String direccion, int fecha){
        Entrevistador entrevistador = new Entrevistador(nombre, cedula, direccion, fecha);
        this.listaDeEntrevistadores.add(entrevistador);
    }

    @Override
    public String toString() {
        return "Sistema{" + "listaDePostulantes=" + listaDePostulantes + ", listaDeTematicas=" + listaDeTematicas + ", listaDeEntrevistadores=" + listaDeEntrevistadores + '}';
    }
    
}

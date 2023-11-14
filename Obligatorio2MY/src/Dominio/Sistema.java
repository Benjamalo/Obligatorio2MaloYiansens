
package Dominio;

import Interfaz.VentanaHistorial;
import java.awt.Desktop;
import java.io.IOException;
import java.net.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Sistema {
    private ArrayList<Postulante> listaDePostulantes;
    private ArrayList<Tematica> listaDeTematicas;
    private ArrayList<Entrevistador> listaDeEntrevistadores;
    private ArrayList<Entrevista> listaDeEntrevistas;
    public int contadorEntrevista=1;
    private ArrayList<Puesto> listaDePuestos;
    private ArrayList<String> Temario;
    private ArrayList<String> PersonaACEPTADA;
    private HashMap<String, Integer> mapeoDePostulantes;

 
    public Sistema(){
        PersonaACEPTADA=new ArrayList<>();
        Temario = new ArrayList<>();
        listaDePuestos = new ArrayList<>();
        listaDePostulantes = new ArrayList<>();
        listaDeTematicas = new ArrayList<>();
        listaDeEntrevistadores = new ArrayList<>();
        listaDeEntrevistas = new ArrayList<>();
        mapeoDePostulantes = new HashMap<>();
    }
    

    
    //Voy a tener que crear un metodo para que me elimine TODO de un postulante cuando se baja (incluido entrevistas)
    
   public ArrayList<String> tieneEntrevista(String nombrePuesto, int nivelPuesto) {
        PersonaACEPTADA.clear();
        mapeoDePostulantes.clear();
        for(Puesto puesto : listaDePuestos){
            if (puesto.getNombre().equals(nombrePuesto)){
                for (Postulante postulante : listaDePostulantes) {
                   Temario.clear();
                   for(TematicaExperiencia xp : postulante.getTematicas()){
                        Temario.add(xp.getNombreTematica());
                    }
                    for (String nombres : Temario) {
                        System.out.println("El temario es: "+ nombres);
                    }
                   
                    if (!Temario.containsAll(puesto.getTemasRequeridos())) {
                        break;
                    }
                    System.out.println("El temario contiene TODOS");
                    boolean encontrado = false;
                    System.out.println(listaDeEntrevistas.size());
                    for (Entrevista entrevista : listaDeEntrevistas) {
                        int puntaje = entrevista.getPuntaje();
                        if (postulante.getNombre().equals(entrevista.getPostulante().getNombre()) &&
                            postulante.getModalidad().equals(puesto.getTipoDeTrabajo())){
                            for(String temaRequerido : puesto.getTemasRequeridos()){
                                for (TematicaExperiencia tematicaPostulante : postulante.getTematicas()){

                                    if (temaRequerido.equals(tematicaPostulante.getNombreTematica())&&
                                        tematicaPostulante.getNivelExperiencia()>=nivelPuesto) {
                                        //PersonaACEPTADA.add(postulante.getNombre());
                                        mapeoDePostulantes.put(postulante.getNombre(), puntaje);
                                        System.out.println("Agrego persona aceptado");
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (encontrado) {
                                break;
                                }
                                }
                            }
                        if (encontrado) {
                        break;
                        }
                    }
                }
            }
        }
        List<Map.Entry<String, Integer>> lista = new ArrayList<>(mapeoDePostulantes.entrySet());
        lista.sort(Map.Entry.comparingByValue());
        Collections.sort(lista, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (Map.Entry<String, Integer> entrada : lista) {
            PersonaACEPTADA.add(entrada.getKey());
        }
        return PersonaACEPTADA;
    }

    public void exportarDatos(ArrayList<String> entrada, Puesto puesto){
        ArchivoGrabacion archivo = new ArchivoGrabacion("Consulta.txt");
        String nombrePuesto = "Puesto: "+puesto.getNombre();
        archivo.grabarLinea(nombrePuesto);
        for(int i=0; i<entrada.size(); i++){
            String nombre = entrada.get(i);
            for(Postulante postulante : listaDePostulantes){
                String datos = postulante.getNombre() + " (" + ""+postulante.getCedula() + ") " + postulante.getMail();
                if(nombre.equals(postulante.getNombre())){
                    archivo.grabarLinea(datos);
                }
            }
        }
        archivo.cerrar();
    }
    
    /*public void clickEnLink(String link){
        try{
            Desktop.getDesktop().browse(new URI(link));
        }
        catch(IOException | URISyntaxException e){
            JOptionPane.showMessageDialog(VentanaHistorial, "El link no existe, o fue ingresado de manera incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }*/
    
    public ArrayList<Puesto> getListaDePuestos() {
        return listaDePuestos;
    }
    
    public ArrayList<Entrevista> buscadorPorPalabras(String[] palabras, String persona){
        ArrayList<Entrevista> retorno = new ArrayList<>();
        for(Entrevista entre : this.getListaDeEntrevistas()){
            if(entre.getPostulante().getNombre().equals(persona) && comprobarPalabras(palabras, entre.getComentarios())){
                retorno.add(entre);
            }
        }
        return retorno;
    }
    
    public boolean comprobarPalabras(String[] palabras, String comentario){
        for(int i=0; i<palabras.length; i++){
            if(!comentario.contains(palabras[i])){
                return false;
            }
        }
        return true;
    }
    
    public void setListaDePuestos(Puesto nuevoPuesto) {
        System.out.println("puesto ha sido agregado: " + nuevoPuesto.getNombre()+ "Temas requeridos: " + nuevoPuesto.getTemasRequeridos());
        this.listaDePuestos.add(nuevoPuesto);
    }
    public boolean comprueboPuesto(String nombrePuesto){
        for(Puesto puesto : listaDePuestos){
            if (puesto.getNombre().equals(nombrePuesto)) {
                return true;
            }
        }
        return false;
    }
    
    
    public Entrevistador darEntrevistador(String nombre){
        for (Entrevistador entrevistador:listaDeEntrevistadores){
            if (entrevistador.getNombre().equals(nombre)) {
                return entrevistador;
            }
        }
        return null;
    }
    public Postulante darPostulante(String nombre){
        for (Postulante postulante:listaDePostulantes){
            if (postulante.getNombre().equals(nombre)) {
                return postulante;
            }
        }
        return null;
    }
    
    public ArrayList<Entrevista> getListaDeEntrevistas() {
        return listaDeEntrevistas;
    }

    public void setListaDeEntrevistas(Entrevista listaDeEntrevistas) {
        contadorEntrevista+=1;
        this.listaDeEntrevistas.add(listaDeEntrevistas);
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
    public void agregarEntrevistador(Entrevistador entrevistador){
        this.listaDeEntrevistadores.add(entrevistador);
        System.out.println("El entrevistador ha sido agregado: " + entrevistador.getNombre());
    }
    public boolean existeCedula(int cedula){
        for(Postulante postulante : listaDePostulantes){
            if (postulante.getCedula() == cedula) {
                return true;
            }
        }
        for (Entrevistador entrevistador : listaDeEntrevistadores) {
             if (entrevistador.getCedula() == cedula) {
                    return true;
                }
        }
        return false;
    }
    
    public boolean establecerFecha(int fecha){
        return fecha>=1950;
    }
    @Override
    public String toString() {
        return "Sistema{" + "listaDePostulantes=" + listaDePostulantes + ", listaDeTematicas=" + listaDeTematicas + ", listaDeEntrevistadores=" + listaDeEntrevistadores + '}';
    }
    
}


package Dominio;

import Interfaz.VentanaPrincipal;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import javax.swing.JOptionPane;

public class Sistema implements Serializable {
    private ArrayList<Postulante> listaDePostulantes;
    private ArrayList<Tematica> listaDeTematicas;
    private ArrayList<Entrevistador> listaDeEntrevistadores;
    private ArrayList<Entrevista> listaDeEntrevistas;
    public int contadorEntrevista=1;
    private ArrayList<Puesto> listaDePuestos;
    private ArrayList<String> temario;
    private ArrayList<String> personaAceptada;
    private HashMap<String, Integer> mapeoDePostulantes;
    private transient PropertyChangeSupport manejador;
    
    public Sistema(){
        personaAceptada = new ArrayList<>();
        temario = new ArrayList<>();
        listaDePuestos = new ArrayList<>();
        listaDePostulantes = new ArrayList<>();
        listaDeTematicas = new ArrayList<>();
        listaDeEntrevistadores = new ArrayList<>();
        listaDeEntrevistas = new ArrayList<>();
        mapeoDePostulantes = new HashMap<>();
        this.manejador = new PropertyChangeSupport(this);
    }
    
    public void inicializarManejador(){
        this.manejador = new PropertyChangeSupport(this);
    }
    

    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        manejador.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        manejador.removePropertyChangeListener(listener);
    }
    
    public int puestosConTematica(String nombreTematica){
        int contador= 0;
        for(Puesto pues : listaDePuestos){
            for(String nombreTemas: pues.getTemasRequeridos()){
                if(nombreTemas.equals(nombreTematica)){
                    contador++;
                }
            }
        
        }
        return contador;
    }
    
    public int personasConTematica(String nombreTematica){

        int contadorPersonas = 0;
        for(Postulante post : listaDePostulantes){
            for(TematicaExperiencia tematicas : post.getTematicas()){
                if(tematicas.getNombreTematica().equals(nombreTematica) && tematicas.getNivelExperiencia()>=5)

                contadorPersonas++;
            }
        }
        return contadorPersonas;
    }
    
   public ArrayList<String> tieneEntrevista(String nombrePuesto, int nivelPuesto) {
        personaAceptada.clear();
        mapeoDePostulantes.clear();
        for(Puesto puesto : listaDePuestos){
            if (puesto.getNombre().equals(nombrePuesto)){
                for (Postulante postulante : listaDePostulantes) {
                   temario.clear();
                   for(TematicaExperiencia xp : postulante.getTematicas()){
                        temario.add(xp.getNombreTematica());
                    }

                   
                    if (!temario.containsAll(puesto.getTemasRequeridos())) {
                        break;
                    }

                    boolean encontrado = false;

                    for (Entrevista entrevista : listaDeEntrevistas) {
                        int  puntajeUltimaEntrevista=entrevista.getPuntaje();
                        for(Entrevista otra: listaDeEntrevistas){
                            if (entrevista.getPostulante().getNombre().equals(otra.getPostulante().getNombre())) {
                                puntajeUltimaEntrevista= otra.getPuntaje();
                            }
                        }
                        if (postulante.getNombre().equals(entrevista.getPostulante().getNombre()) &&
                            postulante.getModalidad().equals(puesto.getTipoDeTrabajo())){
                            for(String temaRequerido : puesto.getTemasRequeridos()){
                                for (TematicaExperiencia tematicaPostulante : postulante.getTematicas()){

                                    if (temaRequerido.equals(tematicaPostulante.getNombreTematica())&&
                                        tematicaPostulante.getNivelExperiencia()>=nivelPuesto) {

                                        mapeoDePostulantes.put(postulante.getNombre(), puntajeUltimaEntrevista);

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
            personaAceptada.add(entrada.getKey());
        }
        return personaAceptada;
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
    
    public ArrayList<Puesto> getListaDePuestos() {
        return listaDePuestos;
    }
    
    /*public ArrayList<Entrevista> buscadorPorPalabras(String[] palabras, String persona){
        ArrayList<Entrevista> retorno = new ArrayList<>();
        for(Entrevista entre : this.getListaDeEntrevistas()){
            if(entre.getPostulante().getNombre().equals(persona) && comprobarPalabras(palabras, entre.getComentarios())){
                retorno.add(entre);
            }
        }
        return retorno;
    }*/
    
    public boolean comprobarPalabras(String[] palabras, String comentario){
        for(int i=0; i<palabras.length; i++){
            if(!comentario.contains(palabras[i])){
                return false;
            }
        }
        return true;
    }
    
    public void setListaDePuestos(Puesto nuevoPuesto) {
        this.listaDePuestos.add(nuevoPuesto);
        manejador.firePropertyChange("Puestos", null, nuevoPuesto);
    }
    public boolean comprueboPuesto(String nombrePuesto){
        for(Puesto puesto : listaDePuestos){
            if (puesto.getNombre().toLowerCase().equals(nombrePuesto)) {
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

    public void setListaDeEntrevistas(ArrayList<Entrevista> listaDeEntrevistas) {
        this.listaDeEntrevistas = listaDeEntrevistas;
    }
    
    public void agregarEntrevista(Entrevista entrevista){
        contadorEntrevista++;
        this.listaDeEntrevistas.add(entrevista);
        manejador.firePropertyChange("Entrevistas", null, entrevista);
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
    
    public void agregarTematica(Tematica tema){
        this.listaDeTematicas.add(tema);
        manejador.firePropertyChange("Tematicas", null, tema);
    }
    public void agregarPostulante(Postulante postulante){
        this.listaDePostulantes.add(postulante);
        manejador.firePropertyChange("Postulantes", null, postulante);
    }
    
    public void setListaDeEntrevistadores(ArrayList<Entrevistador> listaDeEvaluadores) {
        this.listaDeEntrevistadores = listaDeEvaluadores;
    }
    public void agregarEntrevistador(Entrevistador entrevistador){
        this.listaDeEntrevistadores.add(entrevistador);
        manejador.firePropertyChange("Entrevistador", null, entrevistador);
    }
    
    public void eliminar(String nombre) {
        Iterator<Postulante> iteradorPostulantes = this.getListaDePostulantes().iterator();
        while (iteradorPostulantes.hasNext()) {
            Postulante pos = iteradorPostulantes.next();
            if (pos.getNombre().equals(nombre)) {
                iteradorPostulantes.remove();
            }
        }

        Iterator<Entrevista> iteradorEntrevistas = this.getListaDeEntrevistas().iterator();
        while (iteradorEntrevistas.hasNext()) {
            Entrevista entre = iteradorEntrevistas.next();
            if (entre.getPostulante().getNombre().equals(nombre)) {
                iteradorEntrevistas.remove();
            }
        }

        manejador.firePropertyChange("PostulanteEliminado", null, nombre);
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
        return fecha<2023;
    }
    
    public void guardarDatos(){
        try {
            FileOutputStream archivo = new FileOutputStream("sistema_guardado.dat");
            ObjectOutputStream serializador = new ObjectOutputStream(archivo);
            serializador.writeObject(this);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void cargarDatos(){
        Sistema sistema = new Sistema();
        FileInputStream archivo;
        try {
            archivo = new FileInputStream("sistema_guardado.dat");
            ObjectInputStream deserializador = new ObjectInputStream(archivo);
            sistema = (Sistema) deserializador.readObject();
            sistema.inicializarManejador();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encontraron datos guardados, se iniciará el sistema vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        VentanaPrincipal ventana = new VentanaPrincipal(sistema);
        ventana.setVisible(true);
    }
    
    public boolean revisar(int cedula){
        boolean ok = true;
        for(Postulante pos : this.getListaDePostulantes()){
            if( pos.getCedula()==cedula  ){
                ok=false;
            }
        }
        return ok;
    }
    
    @Override
    public String toString() {
        return "Sistema{" + "listaDePostulantes=" + listaDePostulantes + ", listaDeTematicas=" + listaDeTematicas + ", listaDeEntrevistadores=" + listaDeEntrevistadores + '}';
    }
    
}

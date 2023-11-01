
package Dominio;

import Dominio.Tematica;
import Interfaz.VentanaPostulante;
import Interfaz.VentanaPrincipal;
import Interfaz.VentanaTematica;
import java.util.ArrayList;


public class main {

    
    public static void main(String[] args) {

        //ArrayList<Tematica> tematicasRegistradas = new ArrayList<>();
        VentanaPrincipal ventana = new VentanaPrincipal();
        //VentanaTematica ventana = new VentanaTematica();
        ventana.setVisible(true);
        
        //VentanaPostulante ventanaPostulante = new VentanaPostulante(ventana.getTematicasRegistradas());
        //ventanaPostulante.setVisible(true);
     
        
        //System.out.println("Tematicas registradas: " + tematicasRegistradas);


    }
    
}

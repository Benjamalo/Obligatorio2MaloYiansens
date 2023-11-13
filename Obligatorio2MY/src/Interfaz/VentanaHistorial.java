
package Interfaz;

import Dominio.Sistema;
import Dominio.Postulante;
import Dominio.TematicaExperiencia;
import javax.swing.DefaultListModel;

public class VentanaHistorial extends javax.swing.JFrame {

    private Sistema sistema;
    private DefaultListModel<String> modeloListaPostulantes = new DefaultListModel<>();
    private DefaultListModel<String> modeloListaTematicas = new DefaultListModel<>();
    
    public VentanaHistorial(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        for(Postulante postulante : sistema.getListaDePostulantes()){
            modeloListaPostulantes.addElement(postulante.getNombre() + " (" + postulante.getCedula() + ")");
        }
        listaDePostulantes.setModel(modeloListaPostulantes);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        etiquetaPostulante = new javax.swing.JLabel();
        contenedorLista = new javax.swing.JScrollPane();
        listaDePostulantes = new javax.swing.JList<>();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaCedula = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaMail = new javax.swing.JLabel();
        etiquetaLinkedIn = new javax.swing.JLabel();
        etiquetaFormato = new javax.swing.JLabel();
        etiquetaExp = new javax.swing.JLabel();
        separador = new javax.swing.JSeparator();
        cedulaEnPantalla = new javax.swing.JLabel();
        direccionEnPantalla = new javax.swing.JLabel();
        telefonoEnPantalla = new javax.swing.JLabel();
        mailEnPantalla = new javax.swing.JLabel();
        linkedinEnPantalla = new javax.swing.JLabel();
        formatoEnPantalla = new javax.swing.JLabel();
        contenedorTematicas = new javax.swing.JScrollPane();
        listaTematicas = new javax.swing.JList<>();
        nombreEnPantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setText("Historial del Postulante");

        etiquetaPostulante.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        etiquetaPostulante.setText("Postulantes:");

        listaDePostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaDePostulantesValueChanged(evt);
            }
        });
        contenedorLista.setViewportView(listaDePostulantes);

        etiquetaNombre.setText("Nombre:");

        etiquetaCedula.setText("Cedula:");

        etiquetaDireccion.setText("Direccion:");

        etiquetaTelefono.setText("Telefono:");

        etiquetaMail.setText("Mail:");

        etiquetaLinkedIn.setText("LinkedIn:");

        etiquetaFormato.setText("Formato:");

        etiquetaExp.setText("Experiencia:");

        cedulaEnPantalla.setText("Seleccione un usuario.");

        direccionEnPantalla.setText("Seleccione un usuario.");

        telefonoEnPantalla.setText("Seleccione un usuario.");

        mailEnPantalla.setText("Seleccione un usuario.");

        linkedinEnPantalla.setText("Seleccione un usuario.");

        formatoEnPantalla.setText("Seleccione un usuario.");

        contenedorTematicas.setViewportView(listaTematicas);

        nombreEnPantalla.setText("Seleccione un usuario.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPostulante)
                                    .addComponent(contenedorLista, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(etiquetaNombre)
                                                    .addComponent(etiquetaCedula)
                                                    .addComponent(etiquetaDireccion))
                                                .addGap(63, 63, 63)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(direccionEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                                    .addComponent(cedulaEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(nombreEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(etiquetaMail)
                                                    .addComponent(etiquetaLinkedIn)
                                                    .addComponent(etiquetaTelefono)
                                                    .addComponent(etiquetaFormato))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(linkedinEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(telefonoEnPantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                                    .addComponent(mailEnPantalla, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(formatoEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaExp)
                                        .addGap(18, 18, 18)
                                        .addComponent(contenedorTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPostulante)
                    .addComponent(etiquetaNombre)
                    .addComponent(nombreEnPantalla))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaCedula)
                            .addComponent(cedulaEnPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaDireccion)
                            .addComponent(direccionEnPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaTelefono)
                            .addComponent(telefonoEnPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaMail)
                            .addComponent(mailEnPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaLinkedIn)
                            .addComponent(linkedinEnPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFormato)
                            .addComponent(formatoEnPantalla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaExp)
                            .addComponent(contenedorTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(contenedorLista, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaDePostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaDePostulantesValueChanged
        if (!evt.getValueIsAdjusting()) {
            String valor[] = listaDePostulantes.getSelectedValue().split(" ");
            String comprobar = valor[0];

            for (Postulante pos : sistema.getListaDePostulantes()) {
                if (pos.getNombre().equals(comprobar)) {
                    nombreEnPantalla.setText(pos.getNombre());
                    cedulaEnPantalla.setText(""+(pos.getCedula()));
                    direccionEnPantalla.setText(pos.getDireccion());
                    telefonoEnPantalla.setText(String.valueOf(pos.getTelefono()));
                    mailEnPantalla.setText(pos.getMail());
                    linkedinEnPantalla.setText(pos.getLinkedIn());
                    for(TematicaExperiencia tema : pos.getTematicas()){
                        modeloListaTematicas.addElement(tema.getNombreTematica()+" ("+tema.getNivelExperiencia()+ ")");
                    }
                    listaTematicas.setModel(modeloListaTematicas);
                    break;
                }
            }
        }
    }//GEN-LAST:event_listaDePostulantesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cedulaEnPantalla;
    private javax.swing.JScrollPane contenedorLista;
    private javax.swing.JScrollPane contenedorTematicas;
    private javax.swing.JLabel direccionEnPantalla;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaExp;
    private javax.swing.JLabel etiquetaFormato;
    private javax.swing.JLabel etiquetaLinkedIn;
    private javax.swing.JLabel etiquetaMail;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPostulante;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel formatoEnPantalla;
    private javax.swing.JLabel linkedinEnPantalla;
    private javax.swing.JList<String> listaDePostulantes;
    private javax.swing.JList<String> listaTematicas;
    private javax.swing.JLabel mailEnPantalla;
    private javax.swing.JLabel nombreEnPantalla;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel telefonoEnPantalla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

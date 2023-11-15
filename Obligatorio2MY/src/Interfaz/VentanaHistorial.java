
package Interfaz;

import Dominio.HTMLRenderer;
import Dominio.Sistema;
import Dominio.Postulante;
import Dominio.TematicaExperiencia;
import Dominio.Entrevista;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VentanaHistorial extends javax.swing.JFrame {

    private Sistema sistema;
    private DefaultListModel<String> modeloListaPostulantes = new DefaultListModel<>();
    private DefaultListModel<String> modeloListaTematicas = new DefaultListModel<>();
    private DefaultTableModel modeloTabla;
    
    
    public VentanaHistorial(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        for(Postulante postulante : sistema.getListaDePostulantes()){
            modeloListaPostulantes.addElement(postulante.getNombre() + " (" + postulante.getCedula() + ")");
        }
        listaDePostulantes.setModel(modeloListaPostulantes);
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nro.");
        modeloTabla.addColumn("Evaluador");
        modeloTabla.addColumn("Puntaje");
        modeloTabla.addColumn("Comentarios");
        tabla.setModel(modeloTabla);
        tabla.setDefaultRenderer(Object.class, new HTMLRenderer()); 
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
        etiquetaBuscar = new javax.swing.JLabel();
        textoBuscar = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        contenedorTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        botonResetear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

        cedulaEnPantalla.setText("  ");

        direccionEnPantalla.setText("  ");

        telefonoEnPantalla.setText("  ");

        mailEnPantalla.setText("  ");

        linkedinEnPantalla.setForeground(new java.awt.Color(0, 0, 255));
        linkedinEnPantalla.setText("  ");
        linkedinEnPantalla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkedinEnPantallaMouseClicked(evt);
            }
        });

        formatoEnPantalla.setText("  ");

        contenedorTematicas.setViewportView(listaTematicas);

        nombreEnPantalla.setText("  ");

        etiquetaBuscar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        etiquetaBuscar.setText("Buscar:");

        textoBuscar.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tabla.setBackground(new java.awt.Color(242, 242, 242));
        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nro.", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setOpaque(false);
        contenedorTabla.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(40);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(140);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        botonResetear.setText("Resetear");
        botonResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaPostulante)
                            .addComponent(contenedorLista, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaNombre)
                                    .addComponent(etiquetaCedula)
                                    .addComponent(etiquetaDireccion))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cedulaEnPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombreEnPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(direccionEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaExp)
                                        .addGap(18, 18, 18)
                                        .addComponent(contenedorTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaMail)
                                            .addComponent(etiquetaLinkedIn)
                                            .addComponent(etiquetaTelefono)
                                            .addComponent(etiquetaFormato))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(mailEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                            .addComponent(telefonoEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                            .addComponent(linkedinEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                            .addComponent(formatoEnPantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(etiquetaBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(botonBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonResetear)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBuscar)
                    .addComponent(textoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(botonResetear))
                .addGap(18, 18, 18)
                .addComponent(contenedorTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
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
                    formatoEnPantalla.setText(pos.getModalidad());
                    for(TematicaExperiencia tema : pos.getTematicas()){
                        modeloListaTematicas.addElement(tema.getNombreTematica()+" ("+tema.getNivelExperiencia()+ ")");
                    }
                    listaTematicas.setModel(modeloListaTematicas);
                    break;
                }
            }
            ArrayList<Entrevista> entrevistas= sistema.getListaDeEntrevistas();
            for(Entrevista i : entrevistas){
                if(i.getPostulante().getNombre().equals(comprobar)){
                    Object[] fila = {i.getID(), i.getEntrevistador().getNombre(), i.getPuntaje(), i.getComentarios()};
                    modeloTabla.addRow(fila);
                }
            }
        }
    }//GEN-LAST:event_listaDePostulantesValueChanged

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        modeloTabla.setRowCount(0);
        String valor[] = listaDePostulantes.getSelectedValue().split(" ");
        String comprobar = valor[0];
        String palabras[] = textoBuscar.getText().split(" ");
        ArrayList<Entrevista> datosImprimir= sistema.getListaDeEntrevistas();
        
        for(Entrevista entre : datosImprimir){
            if(entre.getPostulante().getNombre().equals(comprobar));
            Object[] fila = {entre.getID(), entre.getEntrevistador().getNombre(), entre.getPuntaje(), entre.getComentarios().replaceAll(palabras[0], "<font color='red'>" + palabras[0] + "</font>")};
            
            modeloTabla.addRow(fila);
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResetearActionPerformed
        modeloTabla.setRowCount(0);
    }//GEN-LAST:event_botonResetearActionPerformed

    private void linkedinEnPantallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkedinEnPantallaMouseClicked
        String enlace = linkedinEnPantalla.getText();
        try{
            Desktop.getDesktop().browse(new URI(enlace));
        }
        catch(IOException | URISyntaxException e){
            JOptionPane.showMessageDialog(this, "El link no existe, o fue ingresado de manera incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_linkedinEnPantallaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonResetear;
    private javax.swing.JLabel cedulaEnPantalla;
    private javax.swing.JScrollPane contenedorLista;
    private javax.swing.JScrollPane contenedorTabla;
    private javax.swing.JScrollPane contenedorTematicas;
    private javax.swing.JLabel direccionEnPantalla;
    private javax.swing.JLabel etiquetaBuscar;
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
    private javax.swing.JTable tabla;
    private javax.swing.JLabel telefonoEnPantalla;
    private javax.swing.JTextField textoBuscar;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

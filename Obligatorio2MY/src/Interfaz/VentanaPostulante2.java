
package Interfaz;

import Dominio.Postulante;
import Dominio.Tematica;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class VentanaPostulante2 extends javax.swing.JFrame {
    
    private ArrayList<Tematica> temas;
    private DefaultComboBoxModel<String> comboBoxModel;
    DefaultListModel<String> modeloListaTematica = new DefaultListModel<>();
    private ArrayList<String> temasAgregados;
    private String nombrePostulante;
    private int cedulaPostulante;
    private String direccionPostulante;
    private String linkedinPostulante;
    private int telefonoPostulante;
    private String mailPostulante;
    private String modalidadPostulante;
    private ArrayList<String> tematicaPostulante;
    private ArrayList<Postulante> postulantes;
    
    public VentanaPostulante2(String nombre, int cedula, String direccion, String linkedin, int telefono,String mail,String modalidad, ArrayList<Tematica> tematicasRegistradas,ArrayList<Postulante> postulantes) {
        initComponents();
        temasAgregados = new ArrayList<>();
        tematicaPostulante = new ArrayList<>();
        nombrePostulante = nombre;
        cedulaPostulante = cedula;
        direccionPostulante = direccion;
        linkedinPostulante = linkedin;
        telefonoPostulante = telefono;
        mailPostulante = mail;
        modalidadPostulante = modalidad;
        this.postulantes = postulantes;
        temas = new ArrayList<>();
        temas.addAll(tematicasRegistradas);
        DefaultListModel<String> emptyListModel = new DefaultListModel<>();
        listaExperiencia.setModel(emptyListModel);
        comboBoxModel = new DefaultComboBoxModel<>();
        listaTema.setModel(comboBoxModel);
        for (Tematica tematica : temas) {
            comboBoxModel.addElement(tematica.getNombre()); 
        }   
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        etiquetaTema = new javax.swing.JLabel();
        listaTema = new javax.swing.JComboBox<>();
        etiquetaNivel = new javax.swing.JLabel();
        numeroNivel = new javax.swing.JSpinner();
        botonAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etiquetaExperiencia = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaExperiencia = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTema.setText("Tema:");

        listaTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTemaActionPerformed(evt);
            }
        });

        etiquetaNivel.setText("Nivel:");

        numeroNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        numeroNivel.setToolTipText("");
        numeroNivel.setName(""); // NOI18N

        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(186, 202, 220));

        etiquetaExperiencia.setText("Experiencia:");

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        listaExperiencia.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaExperiencia);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaTema)
                            .addComponent(etiquetaNivel))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listaTema, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(numeroNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonAgregar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaExperiencia)
                            .addComponent(botonCancelar)
                            .addComponent(botonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonRegistrar))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTema)
                    .addComponent(listaTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNivel)
                    .addComponent(numeroNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaExperiencia)
                        .addGap(18, 18, 18)
                        .addComponent(botonEliminar)
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonRegistrar))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTemaActionPerformed
        
    }//GEN-LAST:event_listaTemaActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        String tematicaSeleccionada = listaExperiencia.getSelectedValue();
        String[] nombreTematicaSeleccionada = tematicaSeleccionada.split(" \\(");
        if (tematicaSeleccionada != null){
            modeloListaTematica.removeElement(tematicaSeleccionada);
            tematicaPostulante.remove(tematicaSeleccionada);
            temasAgregados.remove(nombreTematicaSeleccionada[0]);
            System.out.println("se eliminó: " + temasAgregados);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        String tematicaSeleccionada = (String) listaTema.getSelectedItem();
        int nivelSeleccionado = (int) numeroNivel.getValue();
        if (temasAgregados.contains(tematicaSeleccionada)) {
            return;
        }
        for (Tematica tematica : temas) {
            if (tematica.getNombre().equals(tematicaSeleccionada)) {
                String experiencia = tematica.getNombre() + " (" + nivelSeleccionado + ")";
                modeloListaTematica.addElement(experiencia);
                listaExperiencia.setModel(modeloListaTematica);
                temasAgregados.add(tematicaSeleccionada);
                tematicaPostulante.add(experiencia);
                break;
            }
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed

        Postulante postulante = new Postulante(nombrePostulante,cedulaPostulante,direccionPostulante,linkedinPostulante,telefonoPostulante,mailPostulante,modalidadPostulante, tematicaPostulante);
        System.out.println("------------------Postulante creado correctamente---------------------");
        postulantes.add(postulante);

        /*for (Postulante postulante : postulantes) {
            System.out.println("Nombre: " + postulante.getNombre());
            System.out.println("Cedula: " + postulante.getCedula());
            System.out.println("Dirección: " + postulante.getDireccion());
            System.out.println("LinkedIn: " + postulante.getLinkedIn());
            System.out.println("Teléfono: " + postulante.getTelefono());
            System.out.println("Correo electrónico: " + postulante.getMail());
            System.out.println("Modalidad: " + postulante.getModalidad());
            System.out.println("Tematicas:");
            for (String tematica : postulante.getTematicas()) {
                System.out.println("   - " + tematica);
            }   
        System.out.println("------------------------------");
        }*/
        this.dispose();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel etiquetaExperiencia;
    private javax.swing.JLabel etiquetaNivel;
    private javax.swing.JLabel etiquetaTema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaExperiencia;
    private javax.swing.JComboBox<String> listaTema;
    private javax.swing.JSpinner numeroNivel;
    // End of variables declaration//GEN-END:variables
}

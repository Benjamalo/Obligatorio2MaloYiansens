
package Interfaz;

import Dominio.Puesto;
import Dominio.Sistema;
import Dominio.Tematica;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaRegistroPuesto extends javax.swing.JFrame {
    private ButtonGroup grupoBotones;
    private String modalidad;
    private DefaultComboBoxModel<String> modeloTematicas;
    private Sistema sistema;
    DefaultListModel<String> modeloListaTematica = new DefaultListModel<>();
    private ArrayList<String> tematicasDelPuesto;
    DefaultListModel<String> modeloVacio;
    
    public VentanaRegistroPuesto(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        tematicasDelPuesto= new ArrayList<>();
        modeloTematicas = new DefaultComboBoxModel<>();
        
        modeloVacio = new DefaultListModel<>();

        listaTematicasSeleccionadas.setModel(modeloVacio);
        for (Tematica tematicas : sistema.getListaDeTematicas()) {
            modeloTematicas.addElement(tematicas.getNombre()); 
        }
        listaTemas.setModel(modeloTematicas);

        grupoBotones = new ButtonGroup();
        grupoBotones.add(radioMixto);
        grupoBotones.add(radioPresencial);
        grupoBotones.add(radioRemoto);    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        nombrePuesto = new javax.swing.JTextField();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        botonRegistrarPuesto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaTematicasSeleccionadas = new javax.swing.JList<>();
        listaTemas = new javax.swing.JComboBox<>();
        botonAgregarTematica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonVolver = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        radioRemoto.setText("Remoto");
        radioRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRemotoActionPerformed(evt);
            }
        });

        radioPresencial.setText("Presencial");
        radioPresencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPresencialActionPerformed(evt);
            }
        });

        radioMixto.setText("Mixto");
        radioMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMixtoActionPerformed(evt);
            }
        });

        botonRegistrarPuesto.setText("Registrar");
        botonRegistrarPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarPuestoActionPerformed(evt);
            }
        });

        listaTematicasSeleccionadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaTematicasSeleccionadas);

        listaTemas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaTemasActionPerformed(evt);
            }
        });

        botonAgregarTematica.setText("Agregar");
        botonAgregarTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarTematicaActionPerformed(evt);
            }
        });

        jLabel1.setText("Puesto:");

        botonVolver.setText("Volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonRegistrarPuesto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(listaTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonAgregarTematica)
                                        .addGap(94, 94, 94))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(radioRemoto)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioPresencial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(radioMixto)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioRemoto)
                            .addComponent(radioPresencial)
                            .addComponent(radioMixto))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(listaTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonAgregarTematica)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrarPuesto)
                    .addComponent(botonVolver))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarPuestoActionPerformed
        String nombreDelPuesto = nombrePuesto.getText();
        if (sistema.comprueboPuesto(nombreDelPuesto.toLowerCase())) {
            JOptionPane.showMessageDialog(null, "Puesto ya registrado.", "Error", JOptionPane.ERROR_MESSAGE);
            nombrePuesto.setText("");
            grupoBotones.clearSelection();
            listaTematicasSeleccionadas.setModel(modeloVacio);
            tematicasDelPuesto.clear();
            modeloListaTematica = new DefaultListModel<>();
            return;     
        }
        Puesto puesto = new Puesto(nombreDelPuesto,modalidad,tematicasDelPuesto);
        sistema.setListaDePuestos(puesto);
        nombrePuesto.setText("");
        grupoBotones.clearSelection();
        listaTematicasSeleccionadas.setModel(modeloVacio);
        tematicasDelPuesto.clear();
        modeloListaTematica = new DefaultListModel<>();
        
    }//GEN-LAST:event_botonRegistrarPuestoActionPerformed

    private void radioRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRemotoActionPerformed
        this.modalidad = "Remoto";
    }//GEN-LAST:event_radioRemotoActionPerformed

    private void radioPresencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPresencialActionPerformed
        this.modalidad = "Presencial";
    }//GEN-LAST:event_radioPresencialActionPerformed

    private void radioMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMixtoActionPerformed
        this.modalidad = "Mixto";
    }//GEN-LAST:event_radioMixtoActionPerformed

    private void listaTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaTemasActionPerformed

    private void botonAgregarTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarTematicaActionPerformed
        String tematicaSeleccionada = (String) listaTemas.getSelectedItem();
        if (modeloListaTematica.contains(tematicaSeleccionada)) {
            return;
        }
        modeloListaTematica.addElement(tematicaSeleccionada);
        listaTematicasSeleccionadas.setModel(modeloListaTematica);
        tematicasDelPuesto.add(tematicaSeleccionada);
    }//GEN-LAST:event_botonAgregarTematicaActionPerformed

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarTematica;
    private javax.swing.JButton botonRegistrarPuesto;
    private javax.swing.JButton botonVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> listaTemas;
    private javax.swing.JList<String> listaTematicasSeleccionadas;
    private javax.swing.JTextField nombrePuesto;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    // End of variables declaration//GEN-END:variables
}

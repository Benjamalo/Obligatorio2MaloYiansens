
package Interfaz;


import Dominio.Postulante;
import Dominio.Sistema;
import java.util.*;

public class VentanaBajaPostulante extends javax.swing.JFrame implements Observer {

    private Sistema sistema;
    
    public VentanaBajaPostulante(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        for(Postulante pos : sistema.getListaDePostulantes()){
            comboPostulantes.addItem(pos.toString());
        }
        botonEliminar.setEnabled(false);
    }

    public void actualizar(){
        String item = (String) comboPostulantes.getSelectedItem();
        for(int i=0; i<sistema.getListaDePostulantes().size(); i++){
            String pos = sistema.getListaDePostulantes().get(i).toString();
            if(pos.equals(item)){
                sistema.getListaDePostulantes().remove(sistema.getListaDePostulantes().get(i));
                break;
            }
        }
        comboPostulantes.setSelectedItem(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        etiquetaSubtitulo = new javax.swing.JLabel();
        comboPostulantes = new javax.swing.JComboBox<>();
        etiquetaEliminar = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setText("Baja de Postulante");

        etiquetaSubtitulo.setText("Seleccione un postulante para eliminarlo de la lista.");

        comboPostulantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPostulantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPostulantesActionPerformed(evt);
            }
        });

        etiquetaEliminar.setText("Eliminar:");

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(etiquetaSubtitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(etiquetaEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(comboPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(etiquetaSubtitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEliminar)
                    .addComponent(botonCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboPostulantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPostulantesActionPerformed
        botonEliminar.setEnabled(true);
    }//GEN-LAST:event_comboPostulantesActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        actualizar();
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JComboBox<String> comboPostulantes;
    private javax.swing.JLabel etiquetaEliminar;
    private javax.swing.JLabel etiquetaSubtitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        actualizar();
    }
}

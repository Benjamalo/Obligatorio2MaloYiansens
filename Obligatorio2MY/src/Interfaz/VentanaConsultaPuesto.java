//Benjamin Malo y Geronimo Yiansens
package Interfaz;

import Dominio.Puesto;
import Dominio.Sistema;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class VentanaConsultaPuesto extends javax.swing.JFrame implements PropertyChangeListener{
    private Sistema sistema;
    DefaultListModel<String> modeloListaPuestos = new DefaultListModel<>();
    DefaultListModel<String> modeloListaPostulantes = new DefaultListModel<>();
    DefaultListModel<String> modeloListaVacia;
    
    
    public VentanaConsultaPuesto(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.sistema.addPropertyChangeListener(this);
        modeloListaVacia = new DefaultListModel<>();
        cargarDatos(); 
        DefaultListModel<String> emptyListModel = new DefaultListModel<>();
        listaDePostulantes.setModel(emptyListModel);
    }
    
    public void cargarDatos(){
        for (Puesto puesto : sistema.getListaDePuestos()) {
            modeloListaPuestos.addElement(puesto.getNombre());
        }
        listaDePuestos.setModel(modeloListaPuestos); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        etiquetaPuestos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDePuestos = new javax.swing.JList<>();
        etiquetaNivel = new javax.swing.JLabel();
        nivelParaPuesto = new javax.swing.JSpinner();
        botonConsultar = new javax.swing.JButton();
        separador = new javax.swing.JSeparator();
        etiquetaPostulantes = new javax.swing.JLabel();
        listado = new javax.swing.JScrollPane();
        listaDePostulantes = new javax.swing.JList<>();
        botonExportar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        titulo.setText("Consulta para puesto");

        etiquetaPuestos.setText("Puestos:");

        listaDePuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaDePuestos);

        etiquetaNivel.setText("Nivel:");

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        etiquetaPostulantes.setText("Postulantes:");

        listaDePostulantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listado.setViewportView(listaDePostulantes);

        botonExportar.setText("Exportar");
        botonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExportarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(titulo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                                .addComponent(botonExportar))
                            .addComponent(etiquetaPostulantes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaPuestos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaNivel)
                                .addGap(144, 144, 144)
                                .addComponent(nivelParaPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonConsultar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separador, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listado, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(etiquetaPuestos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNivel)
                    .addComponent(nivelParaPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultar))
                .addGap(18, 18, 18)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaPostulantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonExportar)
                    .addComponent(botonCancelar))
                .addContainerGap())
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

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed

        listaDePostulantes.setModel(modeloListaVacia);
        modeloListaPostulantes.clear();
        String nombrePuesto = listaDePuestos.getSelectedValue();
        int nivelPuesto = (int)nivelParaPuesto.getValue();
        ArrayList<String>PersonasConNivel = sistema.tieneEntrevista(nombrePuesto, nivelPuesto);
        for(String postulante : PersonasConNivel){
            modeloListaPostulantes.addElement(postulante);
        }
        listaDePostulantes.setModel(modeloListaPostulantes);
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExportarActionPerformed
    int nivelPuesto = (int)nivelParaPuesto.getValue();
    ArrayList<String> cadena = sistema.tieneEntrevista(listaDePuestos.getSelectedValue(), nivelPuesto);
    for(Puesto puesto : sistema.getListaDePuestos()){
        if(puesto.getNombre().equals(listaDePuestos.getSelectedValue())){
             sistema.exportarDatos(cadena,puesto);
        }
    }
    }//GEN-LAST:event_botonExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonExportar;
    private javax.swing.JLabel etiquetaNivel;
    private javax.swing.JLabel etiquetaPostulantes;
    private javax.swing.JLabel etiquetaPuestos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaDePostulantes;
    private javax.swing.JList<String> listaDePuestos;
    private javax.swing.JScrollPane listado;
    private javax.swing.JSpinner nivelParaPuesto;
    private javax.swing.JSeparator separador;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarDatos();
    }
}

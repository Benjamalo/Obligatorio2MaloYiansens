package Interfaz;

import Dominio.Sistema;
import Dominio.Tematica;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.DefaultListModel;

public class VentanaConsultaTematica extends javax.swing.JFrame implements PropertyChangeListener{
    DefaultListModel<String> modeloListaTematicas = new DefaultListModel<>();
    private Sistema sistema;
    
    public VentanaConsultaTematica(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        this.sistema.addPropertyChangeListener(this);
        
        cargarTematicas();


    }

    public void cargarTematicas(){
        DefaultListModel<String> emptyListModel = new DefaultListModel<>();
        listaTematicas.setModel(emptyListModel);
        modeloListaTematicas.clear();
        for (Tematica tematica : sistema.getListaDeTematicas()) {
            modeloListaTematicas.addElement(tematica.getNombre());
        }
        listaTematicas.setModel(modeloListaTematicas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        contenedorTematicas = new javax.swing.JScrollPane();
        listaTematicas = new javax.swing.JList<>();
        etiquetaPostulantes = new javax.swing.JLabel();
        postulantesCumplidores = new javax.swing.JLabel();
        etiquetaPuestos = new javax.swing.JLabel();
        puestosParaTematica = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        botonSalir = new javax.swing.JButton();
        subtitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        listaTematicas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaTematicas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaTematicasValueChanged(evt);
            }
        });
        contenedorTematicas.setViewportView(listaTematicas);

        etiquetaPostulantes.setText("Postulantes con nivel mayor a 5:");

        etiquetaPuestos.setText("Puestos con tématica requerida:");

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setText("Consulta de temáticas requeridas");

        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        subtitulo.setText("Seleccione una temática:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(subtitulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(contenedorTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonSalir)
                                .addGap(37, 37, 37))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaPuestos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaPostulantes, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postulantesCumplidores, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(puestosParaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(Titulo)
                .addGap(20, 20, 20)
                .addComponent(subtitulo)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaPostulantes)
                            .addComponent(postulantesCumplidores, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(puestosParaTematica, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(etiquetaPuestos)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonSalir))
                    .addComponent(contenedorTematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaTematicasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaTematicasValueChanged
        postulantesCumplidores.setText("");
        puestosParaTematica.setText("");

        String nombreTematica = listaTematicas.getSelectedValue();
        int personasCumplidoras = sistema.personasConTematica(nombreTematica);
        postulantesCumplidores.setText(String.valueOf(personasCumplidoras));
        int puestosCumplidores = sistema.puestosConTematica(nombreTematica);
        puestosParaTematica.setText(String.valueOf(puestosCumplidores));
        

    }//GEN-LAST:event_listaTematicasValueChanged

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JScrollPane contenedorTematicas;
    private javax.swing.JLabel etiquetaPostulantes;
    private javax.swing.JLabel etiquetaPuestos;
    private javax.swing.JList<String> listaTematicas;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel postulantesCumplidores;
    private javax.swing.JLabel puestosParaTematica;
    private javax.swing.JLabel subtitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        cargarTematicas();
    }
}

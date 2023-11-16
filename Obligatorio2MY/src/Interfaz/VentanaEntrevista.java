package Interfaz;

import Dominio.Entrevista;
import Dominio.Entrevistador;
import Dominio.Postulante;
import Dominio.Sistema;
import javax.swing.DefaultComboBoxModel;

public class VentanaEntrevista extends javax.swing.JFrame {
    private DefaultComboBoxModel<String> comboBoxModelEntrevistadores;
    private DefaultComboBoxModel<String> comboBoxModelPostulantes;

    private Sistema sistema;
    public VentanaEntrevista(Sistema sistema) {
        initComponents();
        this.sistema = sistema;

         comboBoxModelEntrevistadores = new DefaultComboBoxModel<>();
         comboBoxModelPostulantes = new DefaultComboBoxModel<>();
         for (Entrevistador entrevistador : sistema.getListaDeEntrevistadores()) {
             System.out.println("entrevistador: "+ entrevistador.getNombre());
            comboBoxModelEntrevistadores.addElement(entrevistador.getNombre()); 
        }
         listaEvaluadores.setModel(comboBoxModelEntrevistadores);
        
        for (Postulante postulante : sistema.getListaDePostulantes()) {
            comboBoxModelPostulantes.addElement(postulante.getNombre()); 
        } 
        listaPostulantes.setModel(comboBoxModelPostulantes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        listaEvaluadores = new javax.swing.JComboBox<>();
        listaPostulantes = new javax.swing.JComboBox<>();
        puntajeEntrevista = new javax.swing.JSpinner();
        textoComentario = new javax.swing.JScrollPane();
        comentarioEntrevista = new javax.swing.JTextArea();
        botonCancelar = new javax.swing.JButton();
        botonRegistrarEntrevista = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        etiquetaEntrevistador = new javax.swing.JLabel();
        etiquetaPostulante = new javax.swing.JLabel();
        etiquetaPuntaje = new javax.swing.JLabel();
        etiquetaComentarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaEvaluadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaEvaluadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEvaluadoresActionPerformed(evt);
            }
        });

        listaPostulantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        puntajeEntrevista.setModel(new javax.swing.SpinnerNumberModel(0, null, 100, 1));

        comentarioEntrevista.setColumns(20);
        comentarioEntrevista.setRows(5);
        textoComentario.setViewportView(comentarioEntrevista);

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonRegistrarEntrevista.setText("Registrar");
        botonRegistrarEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEntrevistaActionPerformed(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Ingreso de Entrevistas");

        etiquetaEntrevistador.setText("Entrevistador:");

        etiquetaPostulante.setText("Postulante:");

        etiquetaPuntaje.setText("Puntaje:");

        etiquetaComentarios.setText("Comentarios:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaComentarios)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonRegistrarEntrevista))
                                    .addComponent(textoComentario)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(etiquetaEntrevistador)
                                            .addComponent(listaEvaluadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(80, 80, 80)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(listaPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etiquetaPostulante))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(puntajeEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(etiquetaPuntaje))
                                        .addGap(21, 21, 21)))
                                .addGap(32, 32, 32)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEntrevistador)
                    .addComponent(etiquetaPostulante)
                    .addComponent(etiquetaPuntaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaEvaluadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(puntajeEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(etiquetaComentarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textoComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonRegistrarEntrevista))
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

    private void botonRegistrarEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEntrevistaActionPerformed
        String nombreEvaluador = (String) listaEvaluadores.getSelectedItem();
        String nombrePostulante = (String) listaPostulantes.getSelectedItem();
        int puntajeDeEntrevista = (int) puntajeEntrevista.getValue();
        String comentariosDeEntrevista = comentarioEntrevista.getText();
        Entrevistador entrevistador = sistema.darEntrevistador(nombreEvaluador);
        Postulante postulante = sistema.darPostulante(nombrePostulante);
        int contadorEntrevista = sistema.contadorEntrevista;
        Entrevista entrevista = new Entrevista(entrevistador,postulante,puntajeDeEntrevista,comentariosDeEntrevista,contadorEntrevista);
        sistema.setListaDeEntrevistas(entrevista);
        System.out.println("lista de entrevistas: "+sistema.getListaDeEntrevistas());
        listaEvaluadores.setSelectedIndex(-1); // Deselecciona todos los elementos
        listaPostulantes.setSelectedIndex(-1); // Deselecciona todos los elementos
        puntajeEntrevista.setValue(0); // Reinicia el valor del JSpinner
        comentarioEntrevista.setText("");
    }//GEN-LAST:event_botonRegistrarEntrevistaActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void listaEvaluadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEvaluadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaEvaluadoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrarEntrevista;
    private javax.swing.JTextArea comentarioEntrevista;
    private javax.swing.JLabel etiquetaComentarios;
    private javax.swing.JLabel etiquetaEntrevistador;
    private javax.swing.JLabel etiquetaPostulante;
    private javax.swing.JLabel etiquetaPuntaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> listaEvaluadores;
    private javax.swing.JComboBox<String> listaPostulantes;
    private javax.swing.JSpinner puntajeEntrevista;
    private javax.swing.JScrollPane textoComentario;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}

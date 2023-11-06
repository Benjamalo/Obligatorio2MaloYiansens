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
        jScrollPane1 = new javax.swing.JScrollPane();
        comentariosEntrevista = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        botonRegistrarEntrevista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaEvaluadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        listaPostulantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        puntajeEntrevista.setModel(new javax.swing.SpinnerNumberModel(0, null, 100, 1));

        comentariosEntrevista.setColumns(20);
        comentariosEntrevista.setRows(5);
        jScrollPane1.setViewportView(comentariosEntrevista);

        jButton1.setText("Cancelar");

        botonRegistrarEntrevista.setText("Registrar");
        botonRegistrarEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEntrevistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(listaEvaluadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(listaPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(111, 111, 111)
                                .addComponent(botonRegistrarEntrevista))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(puntajeEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaEvaluadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(puntajeEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(botonRegistrarEntrevista))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegistrarEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEntrevistaActionPerformed
        String nombreEvaluador = (String) listaEvaluadores.getSelectedItem();
        String nombrePostulante = (String) listaPostulantes.getSelectedItem();
        int puntajeDeEntrevista = (int) puntajeEntrevista.getValue();
        String comentariosDeEntrevista = comentariosEntrevista.getText();
        Entrevistador entrevistador = sistema.darEntrevistador(nombreEvaluador);
        Postulante postulante = sistema.darPostulante(nombrePostulante);
        int contadorEntrevista = sistema.contadorEntrevista;
        Entrevista entrevista = new Entrevista(entrevistador,postulante,puntajeDeEntrevista,comentariosDeEntrevista,contadorEntrevista);
        sistema.setListaDeEntrevistas(entrevista);
        System.out.println("lista de entrevistas: "+sistema.getListaDeEntrevistas());
        listaEvaluadores.setSelectedIndex(-1); // Deselecciona todos los elementos
        listaPostulantes.setSelectedIndex(-1); // Deselecciona todos los elementos
        puntajeEntrevista.setValue(0); // Reinicia el valor del JSpinner
        comentariosEntrevista.setText("");
    }//GEN-LAST:event_botonRegistrarEntrevistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonRegistrarEntrevista;
    private javax.swing.JTextArea comentariosEntrevista;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listaEvaluadores;
    private javax.swing.JComboBox<String> listaPostulantes;
    private javax.swing.JSpinner puntajeEntrevista;
    // End of variables declaration//GEN-END:variables
}


package Interfaz;

import Dominio.Sistema;

public class VentanaPrincipal extends javax.swing.JFrame {
    Sistema sistema = new Sistema();

    public VentanaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        botonTematica = new javax.swing.JButton();
        botonPos = new javax.swing.JButton();
        botonEvaluador = new javax.swing.JButton();
        botonConsulta = new javax.swing.JButton();
        botonPuesto = new javax.swing.JButton();
        botonBajaPos = new javax.swing.JButton();
        botonEntrevista = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setText("Menu Principal");

        botonTematica.setText("Tematicas");
        botonTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTematicaActionPerformed(evt);
            }
        });

        botonPos.setText("Alta de Postulante");
        botonPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPosActionPerformed(evt);
            }
        });

        botonEvaluador.setText("Ingreso de Evaluadores");
        botonEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEvaluadorActionPerformed(evt);
            }
        });

        botonConsulta.setText("Consultar puestos");
        botonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultaActionPerformed(evt);
            }
        });

        botonPuesto.setText("Ingresar Puestos");

        botonBajaPos.setText("Baja de Postulante");
        botonBajaPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBajaPosActionPerformed(evt);
            }
        });

        botonEntrevista.setText("Ingreso de Entrevista");
        botonEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntrevistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonEvaluador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonBajaPos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonEntrevista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(botonConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(123, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Titulo)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonPuesto)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonTematica)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Titulo)
                .addGap(37, 37, 37)
                .addComponent(botonTematica)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBajaPos)
                    .addComponent(botonPos))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEvaluador)
                    .addComponent(botonEntrevista))
                .addGap(27, 27, 27)
                .addComponent(botonConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonPuesto)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTematicaActionPerformed
        VentanaTematica ventanatema = new VentanaTematica(sistema.getListaDeTematicas());
        ventanatema.setVisible(true);
    }//GEN-LAST:event_botonTematicaActionPerformed

    private void botonPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPosActionPerformed
        VentanaPostulante ventanaPos = new VentanaPostulante(sistema.getListaDeTematicas(), sistema.getListaDePostulantes(),sistema);
        ventanaPos.setVisible(true);
        System.out.println("SISTEMA: "+ sistema.toString());
    }//GEN-LAST:event_botonPosActionPerformed

    private void botonEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEvaluadorActionPerformed
        VentanaEvaluador ventana = new VentanaEvaluador(sistema);
        ventana.setVisible(true);
    }//GEN-LAST:event_botonEvaluadorActionPerformed

    private void botonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConsultaActionPerformed

    private void botonBajaPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBajaPosActionPerformed
        VentanaBajaPostulante ventanaBajaPos = new VentanaBajaPostulante(sistema.getListaDePostulantes());
        ventanaBajaPos.setVisible(true);
    }//GEN-LAST:event_botonBajaPosActionPerformed

    private void botonEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntrevistaActionPerformed
        VentanaEntrevista ventanaEntrevista = new VentanaEntrevista(sistema);
        ventanaEntrevista.setVisible(true);
    }//GEN-LAST:event_botonEntrevistaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonBajaPos;
    private javax.swing.JButton botonConsulta;
    private javax.swing.JButton botonEntrevista;
    private javax.swing.JButton botonEvaluador;
    private javax.swing.JButton botonPos;
    private javax.swing.JButton botonPuesto;
    private javax.swing.JButton botonTematica;
    // End of variables declaration//GEN-END:variables
}

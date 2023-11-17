
package Interfaz;

import java.util.ArrayList;
import Dominio.Entrevistador;
import javax.swing.JOptionPane;
import Dominio.Sistema;

public class VentanaEvaluador extends javax.swing.JFrame {

    private ArrayList<Entrevistador> lista;
    private Sistema sistema;
    
    public VentanaEvaluador(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        lista = sistema.getListaDeEntrevistadores();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaCedula = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaIngreso = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        textoDireccion = new javax.swing.JTextField();
        textoCedula = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        seleccionFecha = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Titulo.setText("Alta de Evaluador");

        etiquetaNombre.setText("Nombre:");

        etiquetaCedula.setText("Cédula:");

        etiquetaDireccion.setText("Dirección:");

        etiquetaIngreso.setText("Año de ingreso a empresa:");

        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
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
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegistrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(etiquetaIngreso)
                        .addGap(18, 18, 18)
                        .addComponent(seleccionFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiquetaCedula)
                                    .addComponent(etiquetaNombre))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(etiquetaDireccion)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Titulo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(textoDireccion)
                            .addComponent(textoCedula)
                            .addComponent(textoNombre))))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCedula)
                    .addComponent(textoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDireccion)
                    .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaIngreso)
                    .addComponent(seleccionFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonRegistrar))
                .addGap(22, 22, 22))
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

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        if (textoNombre.getText().isEmpty()||textoCedula.getText().isEmpty()||textoDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay campos vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String nombre = textoNombre.getText();
        String cedula = textoCedula.getText();
        if(cedula.matches(".*[a-zA-Z].*")){
            JOptionPane.showMessageDialog(null, "Asegurese que su cedula sea correcta.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        int cedula2 = Integer.parseInt(cedula);
        String direccion = textoDireccion.getText();
        int fecha = (int) seleccionFecha.getValue();
        
        if (sistema.existeCedula(cedula2)) {
            JOptionPane.showMessageDialog(null, "Cédula ya registrada.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!sistema.establecerFecha(fecha)){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
       
        Entrevistador entrevistador = new Entrevistador(nombre,cedula2,direccion,fecha);
        sistema.agregarEntrevistador(entrevistador);
        textoNombre.setText("");
        textoCedula.setText("");
        textoDireccion.setText("");
        seleccionFecha.setValue(0);
    }//GEN-LAST:event_botonRegistrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JLabel etiquetaCedula;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaIngreso;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner seleccionFecha;
    private javax.swing.JTextField textoCedula;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoNombre;
    // End of variables declaration//GEN-END:variables
}

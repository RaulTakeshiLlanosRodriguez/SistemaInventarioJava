/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Ctrl_Equipo;
import controlador.Ctrl_Mueble;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import modelo.Equipo;
import modelo.Mueble;

/**
 *
 * @author USER
 */
public class FrmMuebles extends javax.swing.JInternalFrame {

    public FrmMuebles() {
        initComponents();
        this.setSize(new Dimension(500,450));
        this.setTitle("Nuevo Mueble");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_nroOrden = new javax.swing.JTextField();
        txt_observacion = new javax.swing.JTextField();
        txt_codPatrimonial = new javax.swing.JTextField();
        txt_tipo = new javax.swing.JTextField();
        txt_unidad = new javax.swing.JTextField();
        txt_procedencia = new javax.swing.JTextField();
        txt_ubicacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_guardar_mueble = new javax.swing.JButton();
        lista_estado = new javax.swing.JComboBox<>();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nuevo Mueble");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nro Orden:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Observacion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tipo:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unidad de medida:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estado:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Procedencia:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ubicacion:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        getContentPane().add(txt_nroOrden, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 250, 30));
        getContentPane().add(txt_observacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 250, 30));
        getContentPane().add(txt_codPatrimonial, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 250, 30));
        getContentPane().add(txt_tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 250, 30));
        getContentPane().add(txt_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 250, 30));
        getContentPane().add(txt_procedencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 250, 30));
        getContentPane().add(txt_ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 250, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cod Patrimonial:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btn_guardar_mueble.setBackground(new java.awt.Color(0, 204, 204));
        btn_guardar_mueble.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_guardar_mueble.setText("GUARDAR");
        btn_guardar_mueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_muebleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar_mueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

        lista_estado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lista_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Regular", "Malo", "Defectuoso", "Obsoleto" }));
        getContentPane().add(lista_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 250, 30));

        jLabel_wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardar_muebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_muebleActionPerformed
        Mueble mueble = new Mueble();
        Ctrl_Mueble controlMueble = new Ctrl_Mueble();
        
        
        
        //validamos campos vacios
        if(txt_nroOrden.getText().isEmpty() ||txt_codPatrimonial.getText().equals("")||txt_tipo.getText().equals("")||txt_unidad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete los campos de color rojo");
            txt_nroOrden.setBackground(Color.red);
            txt_codPatrimonial.setBackground(Color.red);
            txt_tipo.setBackground(Color.red);
            txt_unidad.setBackground(Color.red);
        }else{
            mueble.setNrOrden(Integer.parseInt(txt_nroOrden.getText()));
            mueble.setCodPatrimonial(txt_codPatrimonial.getText());
            mueble.setTipo(txt_tipo.getText());
            mueble.setUnidadMedida(txt_unidad.getText());
            mueble.setEstado(lista_estado.getSelectedItem().toString());
            mueble.setProcedencia(txt_procedencia.getText());
            mueble.setUbicacion(txt_ubicacion.getText());
            mueble.setObservacion(txt_observacion.getText());
            controlMueble.guardar(mueble);
            JOptionPane.showMessageDialog(null, "Registro guardado con exito");
            txt_nroOrden.setBackground(Color.white);
            txt_codPatrimonial.setBackground(Color.white);
            txt_tipo.setBackground(Color.white);
            txt_unidad.setBackground(Color.white);
            txt_nroOrden.setText("");
            txt_codPatrimonial.setText("");
            txt_tipo.setText("");
            txt_unidad.setText("");
            txt_procedencia.setText("");
            txt_ubicacion.setText("");
            txt_observacion.setText("");
        }
        
    }//GEN-LAST:event_btn_guardar_muebleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar_mueble;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JComboBox<String> lista_estado;
    private javax.swing.JTextField txt_codPatrimonial;
    private javax.swing.JTextField txt_nroOrden;
    private javax.swing.JTextField txt_observacion;
    private javax.swing.JTextField txt_procedencia;
    private javax.swing.JTextField txt_tipo;
    private javax.swing.JTextField txt_ubicacion;
    private javax.swing.JTextField txt_unidad;
    // End of variables declaration//GEN-END:variables
}

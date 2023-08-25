        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ec.itss.vista;

//import static com.ec.itss.main.Principal.frm_prov;
import com.ec.itss.modelo.ActualizarProveedor;
import com.ec.itss.modelo.ListarProveedores;
import com.ec.itss.modelo.Proveedor;
import com.ec.itss.modelo.RegistrarProveedor;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author PAUL CROSSOVER
 */
public class Frm_RegistrarProveedor extends javax.swing.JFrame {

    /**
     * Creates new form Frm_RegistrarProveedor
     */
    public String id;

    public Frm_RegistrarProveedor() {
        initComponents();
        this.setLocationRelativeTo(null);
        ListarProveedores a = new ListarProveedores();
        //RegistrarProveedor b= new RegistrarProveedor();
        //Proveedor r = new Proveedor();
        a.mostrarTabla(tableProveedor);
        tableProveedor.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tableProveedor.getSelectedRow() >0){
                    
                    int fila = tableProveedor.getSelectedRow();
                    id=tableProveedor.getValueAt(fila, 0).toString();
                    txtNomProv.setText(tableProveedor.getValueAt(fila, 2).toString());
                    txtRuc.setText(tableProveedor.getValueAt(fila, 1).toString());
                    txtEntregas.setText(tableProveedor.getValueAt(fila,3).toString());
                    txtTprov.setText(tableProveedor.getValueAt(fila, 4).toString());
              
                }
            }
        });
        //a.mostrarTabla(tableProveedor)
    }

    /**
     * This method is called from within the constructor to initialize the form
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableProveedor = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtNomProv = new javax.swing.JTextField();
        btnCerrar2 = new javax.swing.JButton();
        btnGuardarProv = new javax.swing.JButton();
        txtRuc = new javax.swing.JTextField();
        txtEntregas = new javax.swing.JTextField();
        txtTprov = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableProveedor.setBackground(new java.awt.Color(204, 204, 255));
        tableProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tableProveedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tableProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre Proveedor", "Ruc Proveedor", "Cantidad Entregas Mes", "Tipo Proveedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProveedor);
        if (tableProveedor.getColumnModel().getColumnCount() > 0) {
            tableProveedor.getColumnModel().getColumn(0).setPreferredWidth(40);
            tableProveedor.getColumnModel().getColumn(1).setPreferredWidth(40);
            tableProveedor.getColumnModel().getColumn(2).setPreferredWidth(40);
            tableProveedor.getColumnModel().getColumn(3).setMinWidth(30);
            tableProveedor.getColumnModel().getColumn(3).setPreferredWidth(40);
        }

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtNomProv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtNomProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomProvActionPerformed(evt);
            }
        });

        btnCerrar2.setBackground(new java.awt.Color(255, 0, 0));
        btnCerrar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ec/itss/imagenes/cerrar.png"))); // NOI18N
        btnCerrar2.setText("Cerrar");
        btnCerrar2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnCerrar2.setBorderPainted(false);
        btnCerrar2.setPreferredSize(new java.awt.Dimension(38, 17));
        btnCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar2ActionPerformed(evt);
            }
        });

        btnGuardarProv.setBackground(new java.awt.Color(255, 0, 0));
        btnGuardarProv.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnGuardarProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ec/itss/imagenes/marca-de-la-senal.png"))); // NOI18N
        btnGuardarProv.setText("Guardar");
        btnGuardarProv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        btnGuardarProv.setBorderPainted(false);
        btnGuardarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProvActionPerformed(evt);
            }
        });

        txtRuc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ruc Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtRuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRucActionPerformed(evt);
            }
        });
        txtRuc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRucKeyTyped(evt);
            }
        });

        txtEntregas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad Entregas Mes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtEntregas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntregasActionPerformed(evt);
            }
        });
        txtEntregas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEntregasKeyTyped(evt);
            }
        });

        txtTprov.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12))); // NOI18N
        txtTprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTprovActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ec/itss/imagenes/ingresar.png"))); // NOI18N
        jButton1.setText("Clasificación  Proveedores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtRuc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(txtNomProv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTprov))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGuardarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNomProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEntregas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTprov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardarProv, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addComponent(btnCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txtEntregas.getAccessibleContext().setAccessibleName("Entregas al Mes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProvActionPerformed
        // TODO add your handling code here:
        
        ListarProveedores a = new ListarProveedores();
        RegistrarProveedor b= new RegistrarProveedor();
        Proveedor r = new Proveedor();
        r.setNombre (txtNomProv.getText());
        r.setRuc(txtRuc.getText());
        r.setCantidadEntregaAlMes(Integer.parseInt(txtEntregas.getText()));
        r.setTipo_proveedor(txtTprov.getText());
        b.registrar(r);
        limpiarentradas();
        a.mostrarTabla(tableProveedor);
        JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
        
        

        
    }//GEN-LAST:event_btnGuardarProvActionPerformed

    private void btnCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar2ActionPerformed
        // TODO add your handling code here:
        dispose();
        //System.exit(0);
    }//GEN-LAST:event_btnCerrar2ActionPerformed

    private void txtNomProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomProvActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNomProvActionPerformed

    private void txtEntregasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntregasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntregasActionPerformed

    private void txtRucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRucActionPerformed

    private void txtTprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTprovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTprovActionPerformed

    private void tableProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProveedorMouseClicked
        
        /*ListarProveedores a = new ListarProveedores();
        RegistrarProveedor b= new RegistrarProveedor();
        Proveedor r = new Proveedor();
        a.mostrarTabla(tableProveedor);*/
        
        
        /*int fila = tableProveedor.getSelectedRow();
        txtNomProv.setText(this.tableProveedor.getValueAt(fila, 3).toString());
        r.setRuc(txtRuc.toString());
        r.setCantidadEntregaAlMes(Integer.parseInt(txtEntregas.toString()));
        r.setTipo_proveedor(txtTprov.toString());
        a.mostrarTabla(tableProveedor);
        JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
        //b.registrar(r);
        //limpiarentradas();*/
    }//GEN-LAST:event_tableProveedorMouseClicked

    private void txtRucKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRucKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        if(txtRuc.getText().length() > 12){
            evt.consume();
        }
    }//GEN-LAST:event_txtRucKeyTyped

    private void txtEntregasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEntregasKeyTyped
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')) evt.consume();
        if(txtEntregas.getText().length() > 5){
            evt.consume();
        }
    }//GEN-LAST:event_txtEntregasKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Frm_ClasificarProveedores cl = new Frm_ClasificarProveedores();
        cl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        Proveedor proveedor = new  Proveedor();
        ActualizarProveedor act= new ActualizarProveedor();
        ListarProveedores s= new ListarProveedores();
        proveedor.setNombre(txtNomProv.getText());
        proveedor.setRuc(txtRuc.getText());
        proveedor.setCantidadEntregaAlMes(Integer.parseInt(txtEntregas.getText()));
        proveedor.setTipo_proveedor(txtTprov.getText());
        proveedor.setIdProveedor(Integer.parseInt(id));
        act.actualizar(proveedor);
        
        limpiarentradas();
        s.mostrarTabla(tableProveedor);
        
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistrarProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_RegistrarProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCerrar2;
    public javax.swing.JButton btnGuardarProv;
    private javax.swing.JButton jButton1;
    public javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tableProveedor;
    public javax.swing.JTextField txtEntregas;
    public javax.swing.JTextField txtNomProv;
    public javax.swing.JTextField txtRuc;
    public javax.swing.JTextField txtTprov;
    // End of variables declaration//GEN-END:variables

    private void limpiarentradas() {
        txtEntregas.setText("");
        txtNomProv.setText("");
        txtRuc.setText("");
        txtTprov.setText("");
        
    }
    
   
}

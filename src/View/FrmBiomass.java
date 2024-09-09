/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmBiomass extends javax.swing.JFrame {

   
    
    public FrmBiomass() {
        
        initComponents();
        
         DefaultTableModel model = new DefaultTableModel(){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };        
        
        
        model.addColumn("Biomasa");
        model.addColumn("Cantidad");
        model.addColumn("Estado");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpanel1 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBiomass = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textBiomass = new javax.swing.JTextField();
        textAmount = new javax.swing.JTextField();
        cmbState = new javax.swing.JComboBox<>();
        btnClose = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Jpanel1.setBackground(new java.awt.Color(0, 153, 153));
        Jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jpanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar Biomasa a Almacen");
        jLabel1.setOpaque(true);
        Jpanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -4, 470, 40));

        tblBiomass.setBackground(new java.awt.Color(204, 204, 204));
        tblBiomass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Biomasa", "Cantidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBiomass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBiomassMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBiomass);

        Jpanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 470, 220));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Estado :");
        Jpanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Biomasa :");
        Jpanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText(" Cantidad :");
        Jpanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        textBiomass.setBackground(new java.awt.Color(204, 204, 204));
        textBiomass.setFont(textBiomass.getFont().deriveFont(textBiomass.getFont().getSize()+2f));
        textBiomass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Jpanel1.add(textBiomass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 80, 20));

        textAmount.setBackground(new java.awt.Color(204, 204, 204));
        textAmount.setFont(textAmount.getFont().deriveFont(textAmount.getFont().getSize()+2f));
        textAmount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Jpanel1.add(textAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 80, 20));

        cmbState.setBackground(new java.awt.Color(204, 204, 204));
        cmbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bueno", "Regula", "Malo" }));
        cmbState.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Jpanel1.add(cmbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 80, 20));

        btnClose.setBackground(new java.awt.Color(204, 204, 204));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/door_in.png"))); // NOI18N
        btnClose.setText("Cerrar");
        btnClose.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        Jpanel1.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 80, 30));

        btnNew.setBackground(new java.awt.Color(204, 204, 204));
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/add.png"))); // NOI18N
        btnNew.setText("Agregar");
        btnNew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewMouseClicked(evt);
            }
        });
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        Jpanel1.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, 30));

        btnDelete.setBackground(new java.awt.Color(204, 204, 204));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/delete.png"))); // NOI18N
        btnDelete.setText("Sustraer");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        Jpanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 80, 30));

        getContentPane().add(Jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewMouseClicked
        if ( !textBiomass.getText().equals("") && !textAmount.getText().equals("") && !cmbState.getSelectedItem().equals("") ) {
            DefaultTableModel model = (DefaultTableModel)tblBiomass.getModel();        
            String role = null;
            
            
            model.addRow(new Object[]{textBiomass.getText(), textAmount.getText(), cmbState.getSelectedItem()});
            tblBiomass.setModel(model);
            
            textBiomass.setText("");
            textAmount.setText("");
            cmbState.setSelectedIndex(0);
        }        // Agregar biomasa a la tabla
    
      // TODO add your handling code here:
    }//GEN-LAST:event_btnNewMouseClicked

    private void tblBiomassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBiomassMouseClicked
        int row = tblBiomass.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tblBiomass.getModel();
        textBiomass.setText(model.getValueAt(row, 0).toString());
        textAmount.setText(model.getValueAt(row, 1).toString());
        cmbState.setSelectedItem(model.getValueAt(row, 2).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_tblBiomassMouseClicked

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
                                                              
        
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
         int row = tblBiomass.getSelectedRow();
    if (row != -1) {
        DefaultTableModel model = (DefaultTableModel) tblBiomass.getModel();
        int amount = Integer.parseInt(model.getValueAt(row, 1).toString());

        String input = JOptionPane.showInputDialog(this, "Introducir cantidad a restar:");
        if (input != null) {
            try {
                int subtractAmount = Integer.parseInt(input);
                if (subtractAmount <= amount) {
                    amount -= subtractAmount;
                    model.setValueAt(amount, row, 1);
                    JOptionPane.showMessageDialog(this, "Se ha sustraído " + subtractAmount + " unidades. Quedan " + amount + " unidades en el almacén.");

                    if (amount == 0) {
                        model.removeRow(row);
                         JOptionPane.showMessageDialog(this, "Se ha sustraído " + subtractAmount + " unidades. Quedan " + (amount == 0 ? "0" : amount) + " unidades en el almacén.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "La cantidad a restar no puede ser mayor que la cantidad actual.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor, introduzca un número entero.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una fila en la tabla.");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseClicked

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
            java.util.logging.Logger.getLogger(FrmBiomass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBiomass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBiomass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBiomass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBiomass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel1;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JComboBox<String> cmbState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lbl;
    private javax.swing.JTable tblBiomass;
    private javax.swing.JTextField textAmount;
    private javax.swing.JTextField textBiomass;
    // End of variables declaration//GEN-END:variables
}

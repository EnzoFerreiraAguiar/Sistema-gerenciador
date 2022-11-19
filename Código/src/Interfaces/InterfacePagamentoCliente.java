/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import Limitadores.SomenteNumeros;
import javax.swing.JFrame;
import javax.swing.JOptionPane;





/**
 *
 * @author Enrico Ferreira
 */
public class InterfacePagamentoCliente extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePagamentoCliente
     */


    public InterfacePagamentoCliente() {
        
    
        initComponents();
        this.setLocationRelativeTo(null);
        txtCartao.setDocument(new SomenteNumeros());
        txtCVV.setDocument(new SomenteNumeros());
        
        
       
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jCartao = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelFecharLogin3 = new javax.swing.JLabel();
        jLabelMinLogin = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rbCredito = new javax.swing.JRadioButton();
        rbDebito = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnFinalizarCompra = new javax.swing.JButton();
        txtCVV = new javax.swing.JTextField();
        txtCartao = new javax.swing.JTextField();
        btnVoltar = new javax.swing.JButton();

        jCartao.setBackground(new java.awt.Color(108, 122, 137));
        jCartao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCartao.setForeground(new java.awt.Color(236, 240, 241));
        jCartao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCartaoMouseClicked(evt);
            }
        });
        jCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCartaoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel4.setBackground(new java.awt.Color(248, 148, 6));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Efetue o pagamento");

        jLabelFecharLogin3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFecharLogin3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecharLogin3.setText("X");
        jLabelFecharLogin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharLogin3MouseClicked(evt);
            }
        });

        jLabelMinLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMinLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMinLogin.setText("-");
        jLabelMinLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jLabelMinLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFecharLogin3)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecharLogin3)
                    .addComponent(jLabelMinLogin)
                    .addComponent(jLabel4))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 400, 70);

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));
        jPanel5.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setText("CVV:");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(110, 150, 40, 17);

        rbCredito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbCredito.setForeground(new java.awt.Color(236, 240, 241));
        rbCredito.setText("Cartão de Crédito\n");
        rbCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCreditoActionPerformed(evt);
            }
        });
        jPanel5.add(rbCredito);
        rbCredito.setBounds(0, 80, 160, 20);

        rbDebito.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rbDebito.setForeground(new java.awt.Color(236, 240, 241));
        rbDebito.setText("Cartão de Débito");
        rbDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDebitoActionPerformed(evt);
            }
        });
        jPanel5.add(rbDebito);
        rbDebito.setBounds(0, 50, 130, 21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(236, 240, 241));
        jLabel6.setText("Selecione a forma de pagamento");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(10, 20, 250, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(236, 240, 241));
        jLabel7.setText("Número do Cartão:");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(10, 120, 150, 17);

        btnFinalizarCompra.setBackground(new java.awt.Color(34, 167, 240));
        btnFinalizarCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarCompra.setText("Finalizar");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jPanel5.add(btnFinalizarCompra);
        btnFinalizarCompra.setBounds(284, 200, 110, 23);

        txtCVV.setBackground(new java.awt.Color(108, 122, 137));
        txtCVV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(236, 240, 241));
        jPanel5.add(txtCVV);
        txtCVV.setBounds(150, 150, 150, 23);

        txtCartao.setBackground(new java.awt.Color(108, 122, 137));
        txtCartao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCartao.setForeground(new java.awt.Color(236, 240, 241));
        jPanel5.add(txtCartao);
        txtCartao.setBounds(150, 120, 150, 23);

        btnVoltar.setBackground(new java.awt.Color(255, 0, 0));
        btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(236, 240, 241));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel5.add(btnVoltar);
        btnVoltar.setBounds(10, 200, 80, 20);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 70, 400, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void jLabelFecharLogin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharLogin3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelFecharLogin3MouseClicked

    private void jLabelMinLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinLoginMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinLoginMouseClicked

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
         if(!rbCredito.isSelected() && !rbDebito.isSelected()){
JOptionPane.showMessageDialog(null, "Selecione a forma de pagamento", "Aviso",JOptionPane.WARNING_MESSAGE);
}else if(txtCartao.getText().equals("")){
      JOptionPane.showMessageDialog(null, "O campo Número do Cartão é obrigatório", "Aviso",JOptionPane.WARNING_MESSAGE);
       
}else if(txtCVV.getText().equals("")){
        JOptionPane.showMessageDialog(null, "O campo CVV é obrigatório", "Aviso", JOptionPane.WARNING_MESSAGE);
      
}else{
     JOptionPane.showMessageDialog(null, "Compra realizada com sucesso", "Compra efetivada",JOptionPane.INFORMATION_MESSAGE);
}
         txtCartao.setText(" ");
         txtCVV.setText(" ");
         rbCredito.setSelected(false);
         rbDebito.setSelected(false);
       
        

    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void jCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCartaoActionPerformed
  
    }//GEN-LAST:event_jCartaoActionPerformed

    private void rbDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDebitoActionPerformed
        rbCredito.setSelected(false);
    }//GEN-LAST:event_rbDebitoActionPerformed

    private void jCartaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCartaoMouseClicked
    
    }//GEN-LAST:event_jCartaoMouseClicked

    private void rbCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCreditoActionPerformed
       rbDebito.setSelected(false);
    }//GEN-LAST:event_rbCreditoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        InterfaceAtendente iatend = new InterfaceAtendente();
        iatend.setVisible(true);
        iatend.pack();
        iatend.setLocationRelativeTo(null);
        iatend.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed
   
        
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
            java.util.logging.Logger.getLogger(InterfacePagamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePagamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePagamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePagamentoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePagamentoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTextField jCartao;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelFecharLogin3;
    private javax.swing.JLabel jLabelMinLogin;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbDebito;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCartao;
    // End of variables declaration//GEN-END:variables
}



    
    

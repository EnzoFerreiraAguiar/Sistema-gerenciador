/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;
import javax.swing.JFrame;


public class InterfaceAtendente extends javax.swing.JFrame {

    /**
     * Creates new form InterfaceAtendente
     */
    public InterfaceAtendente() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFecharLogin = new javax.swing.JLabel();
        jLabelMinLogin = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCompraCliente = new javax.swing.JButton();
        btnVisuUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Olá! Seja bem-vindo(a)!");

        jLabelFecharLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelFecharLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFecharLogin.setText("X");
        jLabelFecharLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFecharLoginMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabelMinLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelFecharLogin)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecharLogin)
                    .addComponent(jLabelMinLogin)
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 70);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(null);

        btnCompraCliente.setBackground(new java.awt.Color(108, 122, 137));
        btnCompraCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCompraCliente.setForeground(new java.awt.Color(236, 240, 241));
        btnCompraCliente.setText("Compra do Cliente");
        btnCompraCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnCompraCliente);
        btnCompraCliente.setBounds(80, 140, 220, 33);

        btnVisuUser.setBackground(new java.awt.Color(108, 122, 137));
        btnVisuUser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVisuUser.setForeground(new java.awt.Color(236, 240, 241));
        btnVisuUser.setText("Visualizar Produtos");
        btnVisuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisuUserActionPerformed(evt);
            }
        });
        jPanel2.add(btnVisuUser);
        btnVisuUser.setBounds(80, 50, 220, 33);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 70, 400, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelFecharLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFecharLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelFecharLoginMouseClicked

    private void jLabelMinLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinLoginMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinLoginMouseClicked

    private void btnCompraClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraClienteActionPerformed

 InterfaceProduto iprod = new InterfaceProduto();
        iprod.setVisible(true);
        iprod.pack();
        iprod.setLocationRelativeTo(null);
        iprod.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btnCompraClienteActionPerformed

    private void btnVisuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisuUserActionPerformed
        AtendVisualizaProdutos iatendvisuProdutos = new AtendVisualizaProdutos();
        iatendvisuProdutos.setVisible(true);
        iatendvisuProdutos.pack();
        iatendvisuProdutos.setLocationRelativeTo(null);
        iatendvisuProdutos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
      
    }//GEN-LAST:event_btnVisuUserActionPerformed

  
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
            java.util.logging.Logger.getLogger(InterfaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompraCliente;
    private javax.swing.JButton btnVisuUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFecharLogin;
    private javax.swing.JLabel jLabelMinLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}

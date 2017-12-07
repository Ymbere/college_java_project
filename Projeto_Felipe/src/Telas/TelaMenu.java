/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;
import Classes.Menu;


/**
 *
 * @author caue
 */
public class TelaMenu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
 
    Menu menu = new Menu();

    public TelaMenu() {
        initComponents();                 
    }
    
    public void SetInstance(String Instancia){
        instancia_usuario_logado.setText(Instancia);
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
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_Clientes = new javax.swing.JButton();
        btn_Carros = new javax.swing.JButton();
        btn_Servicos = new javax.swing.JButton();
        lbl_usuariologged = new javax.swing.JLabel();
        instancia_usuario_logado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 190, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel14.setText("ItCars");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 131, -1));

        jLabel15.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel15.setText("menu");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        btn_Clientes.setBackground(new java.awt.Color(102, 102, 102));
        btn_Clientes.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_Clientes.setText("CLIENTES");
        btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, 40));

        btn_Carros.setBackground(new java.awt.Color(102, 102, 102));
        btn_Carros.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_Carros.setText("CARROS");
        btn_Carros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CarrosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Carros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 40));

        btn_Servicos.setBackground(new java.awt.Color(102, 102, 102));
        btn_Servicos.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_Servicos.setText("SERVIÇOS");
        btn_Servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ServicosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Servicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, 40));

        lbl_usuariologged.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        lbl_usuariologged.setText("Usuario logado:");
        jPanel1.add(lbl_usuariologged, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        instancia_usuario_logado.setText("jLabel1");
        jPanel1.add(instancia_usuario_logado, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClientesActionPerformed
        TelaClientes telaCliente = new TelaClientes();
        telaCliente.armazenaInstancia(instancia_usuario_logado.getText());
        telaCliente.setVisible(true);
       // System.out.println(menu.get);
        dispose();
    }//GEN-LAST:event_btn_ClientesActionPerformed

    private void btn_ServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ServicosActionPerformed
        // TODO add your handling code here:
        TelaOrdemDeServico telaServicos = new TelaOrdemDeServico();
        telaServicos.armazenaInstancia(instancia_usuario_logado.getText());
        telaServicos.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btn_ServicosActionPerformed

    private void btn_CarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CarrosActionPerformed
        // TODO add your handling code here:
        TelaCarros telaCarro = new TelaCarros();
        telaCarro.armazenaInstancia(instancia_usuario_logado.getText());
        telaCarro.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_CarrosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Carros;
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_Servicos;
    private javax.swing.JLabel instancia_usuario_logado;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_usuariologged;
    // End of variables declaration//GEN-END:variables
}
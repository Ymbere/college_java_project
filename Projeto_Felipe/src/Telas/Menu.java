/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;


/**
 *
 * @author caue
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
 

    public Menu() {
        initComponents();

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
        jPanel1.add(btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 100, 40));

        btn_Carros.setBackground(new java.awt.Color(102, 102, 102));
        btn_Carros.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_Carros.setText("CARROS");
        jPanel1.add(btn_Carros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 40));

        btn_Servicos.setBackground(new java.awt.Color(102, 102, 102));
        btn_Servicos.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_Servicos.setText("SERVIÇOS");
        jPanel1.add(btn_Servicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 100, 40));

        lbl_usuariologged.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        lbl_usuariologged.setText("Usuario logado:");
        jPanel1.add(lbl_usuariologged, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
                new Menu().setVisible(true);
=======
>>>>>>> 095adb046c4d19ae955286133978d899ab5b4cd9
                new Menu().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Carros;
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_Servicos;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_usuariologged;
    // End of variables declaration//GEN-END:variables
}

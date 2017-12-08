/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DB.DataBase;
import Classes.Menu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caue
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    DataBase acessobanco = new DataBase();
    
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        btn_Entrar_login = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfield_login_username = new javax.swing.JTextField();
        btn_Sair_login = new javax.swing.JButton();
        passwdfield_senha_login = new javax.swing.JPasswordField();
        jpanel_login = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setName("tela_login"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel1.setText("ItCars");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 24, 131, -1));

        btn_Entrar_login.setBackground(new java.awt.Color(102, 102, 102));
        btn_Entrar_login.setText("Entrar");
        btn_Entrar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Entrar_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Entrar_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 100, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 84, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Senha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 150, -1, -1));
        getContentPane().add(txtfield_login_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 108, 290, 28));

        btn_Sair_login.setBackground(new java.awt.Color(243, 243, 243));
        btn_Sair_login.setText("Sair");
        btn_Sair_login.setMaximumSize(new java.awt.Dimension(63, 23));
        btn_Sair_login.setMinimumSize(new java.awt.Dimension(63, 23));
        getContentPane().add(btn_Sair_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 236, 100, 41));
        getContentPane().add(passwdfield_senha_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 290, 28));
        getContentPane().add(jpanel_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Entrar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Entrar_loginActionPerformed
     
        
        String valor = new String(passwdfield_senha_login.getPassword());
        boolean resposta = AutenticaLogin(txtfield_login_username.getText(), valor);
        if (resposta == true) {
               TelaMenu menu = new TelaMenu();
               Menu classe_menu = new Menu();
               
               classe_menu.setInstancia(txtfield_login_username.getText());
               
               menu.setVisible(true);
               menu.SetInstance(classe_menu.getInstancia());
               dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha inválidos.", "Tente Novamente", JOptionPane.ERROR_MESSAGE);
        }
        
        

    }//GEN-LAST:event_btn_Entrar_loginActionPerformed
 
    public boolean AutenticaLogin(String username_banco, String passwd_banco) {
        boolean autenticado = false;
        String sql;
        try {          
            
            Connection con = acessobanco.getConnection();
            sql = "SELECT usuario,senha FROM login WHERE usuario = ? and senha = ?";
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setString(1, txtfield_login_username.getText());
            ps.setString(2, passwdfield_senha_login.getText());
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                username_banco = rs.getString("usuario");
                passwd_banco = rs.getString("senha");
                autenticado = true;
            } else {
                ps.close();
                return autenticado;
            }
        } catch (SQLException sqle) {
            sqle.getMessage();
        }
        return autenticado;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Entrar_login;
    private javax.swing.JButton btn_Sair_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpanel_login;
    private javax.swing.JPasswordField passwdfield_senha_login;
    private javax.swing.JTextField txtfield_login_username;
    // End of variables declaration//GEN-END:variables
}

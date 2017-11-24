/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import DB.DataBase;
import Classes.Clientes;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author caue
 */
public class TelaClientes extends javax.swing.JFrame {

    /**
     * Creates new form TelaClientes
     */
    DataBase acessobanco = new DataBase();

    public void travarTxtfieldConsulta() {

        txt_cpf_consulta.setEnabled(false);
        txt_nome_consulta.setEnabled(false);
        txt_telefone_consulta.setEnabled(false);
        txt_email_consulta.setEnabled(false);
        txt_enderecol_consulta.setEnabled(false);
    }

    public void destravarTxtfieldConsulta() {
        
        txt_nome_consulta.setEnabled(true);
        txt_telefone_consulta.setEnabled(true);
        txt_email_consulta.setEnabled(true);
        txt_enderecol_consulta.setEnabled(true);
    }

    public void limparTelaClientes() {

        txt_nome_cliente.setText("");
        txt_cpf_cliente.setText("");
        txt_telefone_cliente.setText("");
        txt_email_cliente.setText("");
        txtfield_endereco.setText("");
    }

    public TelaClientes() {
        initComponents();
        travarTxtfieldConsulta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtabbed_Clientes = new javax.swing.JTabbedPane();
        jpanel_Clientes = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_nome_cliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cpf_cliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_telefone_cliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txt_email_cliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfield_endereco = new javax.swing.JTextField();
        btn_cadastrar_cliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jpanel_Clientes1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txt_busca_cpf = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btn_editarcliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txt_nome_consulta = new javax.swing.JTextField();
        txt_cpf_consulta = new javax.swing.JTextField();
        txt_telefone_consulta = new javax.swing.JTextField();
        txt_email_consulta = new javax.swing.JTextField();
        txt_enderecol_consulta = new javax.swing.JTextField();
        btn_salvar_allteracoes = new javax.swing.JButton();
        btn_buscar_cpf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanel_Clientes.setBackground(new java.awt.Color(190, 190, 190));
        jpanel_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel14.setText("ItCars");
        jpanel_Clientes.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 131, -1));

        jLabel15.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel15.setText("CADASTRAR");
        jpanel_Clientes.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel1.setText("NOME");
        jpanel_Clientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));
        jpanel_Clientes.add(txt_nome_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 390, 40));

        jLabel9.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel9.setText("CPF");
        jpanel_Clientes.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jpanel_Clientes.add(txt_cpf_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 390, 40));

        jLabel10.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel10.setText("TELEFONE");
        jpanel_Clientes.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));
        jpanel_Clientes.add(txt_telefone_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 390, 40));

        jLabel18.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel18.setText("E-MAIL");
        jpanel_Clientes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));
        jpanel_Clientes.add(txt_email_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 390, 40));

        jLabel11.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel11.setText("ENDEREÇO");
        jpanel_Clientes.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        jpanel_Clientes.add(txtfield_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 390, 40));

        btn_cadastrar_cliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_cadastrar_cliente.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_cadastrar_cliente.setText("CADASTRAR");
        btn_cadastrar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrar_clienteActionPerformed(evt);
            }
        });
        jpanel_Clientes.add(btn_cadastrar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 110, 50));

        jtabbed_Clientes.addTab("CADASTRAR", jpanel_Clientes);

        jpanel_Clientes1.setBackground(new java.awt.Color(190, 190, 190));
        jpanel_Clientes1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel16.setText("ItCars");
        jpanel_Clientes1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 131, -1));

        jLabel17.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel17.setText("DIGITE O CPF");
        jpanel_Clientes1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));
        jpanel_Clientes1.add(txt_busca_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 220, 30));

        jLabel19.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel19.setText("CONSULTAR");
        jpanel_Clientes1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        btn_editarcliente.setBackground(new java.awt.Color(102, 102, 102));
        btn_editarcliente.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_editarcliente.setText("EDITAR");
        btn_editarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarclienteActionPerformed(evt);
            }
        });
        jpanel_Clientes1.add(btn_editarcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 110, 50));

        jLabel2.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel2.setText("NOME");
        jpanel_Clientes1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel12.setText("CPF");
        jpanel_Clientes1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel13.setText("TELEFONE");
        jpanel_Clientes1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel20.setText("E-MAIL");
        jpanel_Clientes1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jLabel21.setFont(new java.awt.Font("Andale Mono", 1, 14)); // NOI18N
        jLabel21.setText("ENDEREÇO");
        jpanel_Clientes1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));
        jpanel_Clientes1.add(txt_nome_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 530, 30));
        jpanel_Clientes1.add(txt_cpf_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 250, 30));
        jpanel_Clientes1.add(txt_telefone_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 250, 30));
        jpanel_Clientes1.add(txt_email_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 530, 30));
        jpanel_Clientes1.add(txt_enderecol_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 530, 40));

        btn_salvar_allteracoes.setBackground(new java.awt.Color(102, 102, 102));
        btn_salvar_allteracoes.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_salvar_allteracoes.setText("ATUALIZAR");
        btn_salvar_allteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvar_allteracoesActionPerformed(evt);
            }
        });
        jpanel_Clientes1.add(btn_salvar_allteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 110, 50));

        btn_buscar_cpf.setBackground(new java.awt.Color(102, 102, 102));
        btn_buscar_cpf.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_buscar_cpf.setText("GO");
        btn_buscar_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_cpfActionPerformed(evt);
            }
        });
        jpanel_Clientes1.add(btn_buscar_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 50, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanel_Clientes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpanel_Clientes1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
        );

        jtabbed_Clientes.addTab("CONSULTAR", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtabbed_Clientes)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtabbed_Clientes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cadastrar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrar_clienteActionPerformed

        Clientes cadcliente = new Clientes();

        // usando classe para pegar os dados
        cadcliente.setNome(txt_nome_cliente.getText().toUpperCase());
        cadcliente.setCpf(txt_cpf_cliente.getText().toUpperCase());
        cadcliente.setTelefone(txt_telefone_cliente.getText().toUpperCase());
        cadcliente.setEmail(txt_email_cliente.getText().toLowerCase());
        cadcliente.setEndereco(txtfield_endereco.getText().toUpperCase());

        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itcars", "postgres", "");
            con.setAutoCommit(false);
            try {
                String query = "INSERT INTO clientes VALUES (?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, cadcliente.getCpf());
                ps.setString(2, cadcliente.getNome());
                ps.setString(3, cadcliente.getTelefone());
                ps.setString(4, cadcliente.getEmail());
                ps.setString(5, cadcliente.getEndereco());
                ps.executeUpdate();
                con.commit();
            } catch (SQLException ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Registro Adicionado");
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        limparTelaClientes();

    }//GEN-LAST:event_btn_cadastrar_clienteActionPerformed

    private void btn_editarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarclienteActionPerformed
        // TODO add your handling code here:
        destravarTxtfieldConsulta();

    }//GEN-LAST:event_btn_editarclienteActionPerformed

    private void btn_salvar_allteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvar_allteracoesActionPerformed
        // TODO add your handling code here:

        acessobanco.conecta();
        String cpf = txt_busca_cpf.getText();
        String cpfnovo = txt_cpf_consulta.getText();
        String nome = txt_nome_consulta.getText();
        String telefone = txt_telefone_consulta.getText();
        String email = txt_email_consulta.getText();
        String endereco = txt_enderecol_consulta.getText();

        acessobanco.updateCliente(cpf, cpfnovo, nome, telefone, email, endereco);
        acessobanco.fechaConexao();
        travarTxtfieldConsulta();
    }//GEN-LAST:event_btn_salvar_allteracoesActionPerformed

    private void btn_buscar_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_cpfActionPerformed
        // TODO add your handling code here:

        try {
            acessobanco.conecta();

            String sql;
            sql = "SELECT * FROM clientes WHERE cpf = '" + txt_busca_cpf.getText() + "'";
            ResultSet resultados = acessobanco.consulta(sql);

            destravarTxtfieldConsulta();

            // ta pulando essa parte do codigo não sei porque
            while (resultados.next()) {
                txt_nome_consulta.setText(resultados.getString("nome").toUpperCase());
                txt_cpf_consulta.setText(resultados.getString("cpf").toUpperCase());
                txt_telefone_consulta.setText(resultados.getString("telefone").toUpperCase());
                txt_email_consulta.setText(resultados.getString("email").toUpperCase());
                txt_enderecol_consulta.setText(resultados.getString("endereco").toUpperCase());
            }

        } catch (SQLException sqle) {
            sqle.getMessage();
        } finally {
            acessobanco.fechaConexao();
            travarTxtfieldConsulta();

        }

    }//GEN-LAST:event_btn_buscar_cpfActionPerformed

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
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaClientes().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar_cpf;
    private javax.swing.JButton btn_cadastrar_cliente;
    private javax.swing.JButton btn_editarcliente;
    private javax.swing.JButton btn_salvar_allteracoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel_Clientes;
    private javax.swing.JPanel jpanel_Clientes1;
    private javax.swing.JTabbedPane jtabbed_Clientes;
    private javax.swing.JTextField txt_busca_cpf;
    private javax.swing.JTextField txt_cpf_cliente;
    private javax.swing.JTextField txt_cpf_consulta;
    private javax.swing.JTextField txt_email_cliente;
    private javax.swing.JTextField txt_email_consulta;
    private javax.swing.JTextField txt_enderecol_consulta;
    private javax.swing.JTextField txt_nome_cliente;
    private javax.swing.JTextField txt_nome_consulta;
    private javax.swing.JTextField txt_telefone_cliente;
    private javax.swing.JTextField txt_telefone_consulta;
    private javax.swing.JTextField txtfield_endereco;
    // End of variables declaration//GEN-END:variables
}

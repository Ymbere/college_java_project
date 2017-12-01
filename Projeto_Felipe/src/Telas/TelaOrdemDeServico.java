/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Servicos;
import DB.DataBase;
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
 * @author ymber
 */
public class TelaOrdemDeServico extends javax.swing.JFrame {

    /**
     * Creates new form TelaOrdemDeServico
     */
    
    DataBase acessobanco = new DataBase();
    
    public TelaOrdemDeServico() {
        initComponents();
        travarTelaConsuta();
    }
    
    public void limparTelaCadastro(){
        
        txt_numero_ordem.setText("");
        txt_servico_cpf.setText("");
        txt_servico_data.setText("");
        txt_servico_func.setText("");
        txt_servico_mdeobra.setText("");
        txt_servico_placa.setText("");
        txt_servico_valor.setText("");
        txtarea_servico_desc.setText("");
    }

    public void travarTelaConsuta(){
        
        txt_consultar_cpf.setEnabled(false);
        txt_consultar_data.setEnabled(false);
        txt_consultar_func.setEnabled(false);
        txt_consultar_mobra.setEnabled(false);
        txt_consultar_placa.setEnabled(false);
        txt_consultar_valor.setEnabled(false);
        cmbbox_estado_ordem.setEnabled(false);
        txtarea_consultar_desc.setEnabled(false);
    }
    
    public void destravarTelaConsulta(){
        
        txt_consultar_cpf.setEnabled(false);
        txt_consultar_data.setEnabled(true);
        txt_consultar_func.setEnabled(false);
        txt_consultar_mobra.setEnabled(true);
        txt_consultar_placa.setEnabled(false);
        txt_consultar_valor.setEnabled(true);
        cmbbox_estado_ordem.setEnabled(true);
        txtarea_consultar_desc.setEnabled(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txt_numero_ordem = new javax.swing.JTextField();
        txt_servico_mdeobra = new javax.swing.JTextField();
        txt_servico_func = new javax.swing.JTextField();
        txt_servico_data = new javax.swing.JTextField();
        txt_servico_placa = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtarea_servico_desc = new javax.swing.JTextArea();
        txt_servico_cpf = new javax.swing.JTextField();
        btn_cad_ordemservico = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_servico_valor = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_consultar_nordem = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txt_consultar_cpf = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txt_consultar_func = new javax.swing.JTextField();
        txt_consultar_data = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_consultar_placa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtarea_consultar_desc = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txt_consultar_mobra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_consultar_valor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_atualizar_servicos = new javax.swing.JButton();
        cmbbox_estado_ordem = new javax.swing.JComboBox<>();
        btn_buscar_ordem = new javax.swing.JButton();
        btn_consultar_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setBackground(new java.awt.Color(190, 190, 190));

        jPanel3.setBackground(new java.awt.Color(190, 190, 190));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NUMERO ORDEM");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PLACA CARRO");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("MÃO DE OBRA");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 20));

        jLabel17.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel17.setText("ItCars");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 131, -1));

        jLabel18.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel18.setText("emitir servico");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 46, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("CPF");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("CODIGO FUNCIONÁRIO");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 140, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("DESCRIÇÃO");
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("DATA SERVIÇO");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, -1, -1));

        txt_numero_ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_numero_ordemActionPerformed(evt);
            }
        });
        jPanel3.add(txt_numero_ordem, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, 30));

        txt_servico_mdeobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_servico_mdeobraActionPerformed(evt);
            }
        });
        jPanel3.add(txt_servico_mdeobra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 320, 30));

        txt_servico_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_servico_funcActionPerformed(evt);
            }
        });
        jPanel3.add(txt_servico_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 80, 30));

        txt_servico_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_servico_dataActionPerformed(evt);
            }
        });
        jPanel3.add(txt_servico_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 80, 30));
        jPanel3.add(txt_servico_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 210, 30));

        txtarea_servico_desc.setColumns(20);
        txtarea_servico_desc.setRows(5);
        jScrollPane4.setViewportView(txtarea_servico_desc);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 480, 120));

        txt_servico_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_servico_cpfActionPerformed(evt);
            }
        });
        jPanel3.add(txt_servico_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 300, 30));

        btn_cad_ordemservico.setBackground(new java.awt.Color(102, 102, 102));
        btn_cad_ordemservico.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_cad_ordemservico.setText("CADASTRAR");
        btn_cad_ordemservico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cad_ordemservicoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_cad_ordemservico, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 140, 80));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("VALOR TOTAL");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txt_servico_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_servico_valorActionPerformed(evt);
            }
        });
        jPanel3.add(txt_servico_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 320, 30));

        jTabbedPane2.addTab("Emitir", jPanel3);

        jPanel2.setBackground(new java.awt.Color(190, 190, 190));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel19.setText("ItCars");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 131, -1));

        jLabel20.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel20.setText("consultar servico");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 46, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("ESTADO DA ORDEM");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        txt_consultar_nordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultar_nordemActionPerformed(evt);
            }
        });
        jPanel2.add(txt_consultar_nordem, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 100, 30));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setText("CPF");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txt_consultar_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultar_cpfActionPerformed(evt);
            }
        });
        jPanel2.add(txt_consultar_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("CODIGO FUNCIONÁRIO");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 140, -1));

        txt_consultar_func.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultar_funcActionPerformed(evt);
            }
        });
        jPanel2.add(txt_consultar_func, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 90, 30));

        txt_consultar_data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultar_dataActionPerformed(evt);
            }
        });
        jPanel2.add(txt_consultar_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, 90, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("DATA SERVIÇO");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));
        jPanel2.add(txt_consultar_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 210, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("PLACA CARRO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("DESCRIÇÃO");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtarea_consultar_desc.setColumns(20);
        txtarea_consultar_desc.setRows(5);
        jScrollPane5.setViewportView(txtarea_consultar_desc);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 490, 120));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("MÃO DE OBRA");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, 20));

        txt_consultar_mobra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultar_mobraActionPerformed(evt);
            }
        });
        jPanel2.add(txt_consultar_mobra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 190, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("VALOR TOTAL");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        txt_consultar_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_consultar_valorActionPerformed(evt);
            }
        });
        jPanel2.add(txt_consultar_valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 180, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NUMERO ORDEM");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        btn_atualizar_servicos.setBackground(new java.awt.Color(102, 102, 102));
        btn_atualizar_servicos.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_atualizar_servicos.setText("ATUALIZAR");
        btn_atualizar_servicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizar_servicosActionPerformed(evt);
            }
        });
        jPanel2.add(btn_atualizar_servicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 120, 60));

        cmbbox_estado_ordem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Aberto", "Fechado" }));
        jPanel2.add(cmbbox_estado_ordem, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 210, 30));

        btn_buscar_ordem.setBackground(new java.awt.Color(102, 102, 102));
        btn_buscar_ordem.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_buscar_ordem.setText("GO");
        btn_buscar_ordem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_ordemActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar_ordem, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 50, 30));

        btn_consultar_editar.setBackground(new java.awt.Color(102, 102, 102));
        btn_consultar_editar.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_consultar_editar.setText("EDITAR");
        btn_consultar_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_editarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_consultar_editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 120, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Consultar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_servico_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_servico_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_servico_cpfActionPerformed

    private void txt_servico_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_servico_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_servico_dataActionPerformed

    private void txt_servico_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_servico_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_servico_funcActionPerformed

    private void txt_servico_mdeobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_servico_mdeobraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_servico_mdeobraActionPerformed

    private void txt_numero_ordemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_numero_ordemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_numero_ordemActionPerformed

    private void btn_cad_ordemservicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cad_ordemservicoActionPerformed

        
        Servicos ordem = new Servicos();
        
        int numero;
        numero = Integer.parseInt(txt_numero_ordem.getText());
        ordem.setNumeroOrdem(numero);
        ordem.setCpf(txt_servico_cpf.getText());
        int codigo;
        codigo = Integer.parseInt(txt_servico_func.getText());
        ordem.setCodigoFuncionario(codigo);
        ordem.setPlacaCarro(txt_servico_placa.getText());
        ordem.setDescricao(txtarea_servico_desc.getText());
        ordem.setDataServico(txt_servico_data.getText());
        ordem.setEstado("Em Aberto");
        double maodeobra;
        maodeobra = Double.parseDouble(txt_servico_mdeobra.getText());
        ordem.setMaoDeObra(maodeobra);
        double valortotal;
        valortotal = Double.parseDouble(txt_servico_valor.getText());
        ordem.setValorTotal(valortotal);
        
        
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itcars", "postgres", "root");
            con.setAutoCommit(false);
            try {
                String query = "INSERT INTO servicos VALUES (?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setInt(1, ordem.getNumeroOrdem());
                ps.setString(2, ordem.getCpf());
                ps.setInt(3, ordem.getCodigoFuncionario());
                ps.setString(4, ordem.getPlacaCarro());
                ps.setString(5, ordem.getEstado());
                ps.setString(6, ordem.getDescricao());
                ps.setString(7, ordem.getDataServico());
                ps.setDouble(8, ordem.getMaoDeObra());
                ps.setDouble(9, ordem.getValorTotal());
                
                ps.executeUpdate();
                con.commit();
            } catch (SQLException ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Erro ao inserir");
            }
            JOptionPane.showMessageDialog(null, "Registro Adicionado");
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparTelaCadastro();
    }//GEN-LAST:event_btn_cad_ordemservicoActionPerformed

    private void txt_servico_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_servico_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_servico_valorActionPerformed

    private void txt_consultar_nordemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultar_nordemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultar_nordemActionPerformed

    private void txt_consultar_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultar_cpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultar_cpfActionPerformed

    private void txt_consultar_funcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultar_funcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultar_funcActionPerformed

    private void txt_consultar_dataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultar_dataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultar_dataActionPerformed

    private void txt_consultar_mobraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultar_mobraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultar_mobraActionPerformed

    private void txt_consultar_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_consultar_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_consultar_valorActionPerformed

    private void btn_atualizar_servicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizar_servicosActionPerformed
        // TODO add your handling code here:
        
        
        acessobanco.conecta();
        
        int numeroordem = Integer.parseInt(txt_consultar_nordem.getText());
        String estado = cmbbox_estado_ordem.getSelectedItem().toString();
        String descricao = txtarea_consultar_desc.getText();
        String data = txt_consultar_data.getText();
        Double maoDeObra = Double.parseDouble(txt_consultar_mobra.getText());
        Double valorTotal = Double.parseDouble(txt_consultar_valor.getText());
        
        acessobanco.updateOrdemServico(numeroordem, estado, descricao, data, maoDeObra, valorTotal);
        acessobanco.fechaConexao();
        travarTelaConsuta();
        
        
    }//GEN-LAST:event_btn_atualizar_servicosActionPerformed

    private void btn_buscar_ordemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_ordemActionPerformed
        // TODO add your handling code here:

         try {
            acessobanco.conecta();

            String sql;
            int ordem = Integer.parseInt(txt_consultar_nordem.getText());
            
            
            sql = "SELECT * FROM servicos WHERE ordemnumero = " + ordem + "";
            ResultSet resultados = acessobanco.consulta(sql);

            destravarTelaConsulta();

            // ta pulando essa parte do codigo não sei porque
            while (resultados.next()) {
                
                txt_consultar_cpf.setText(resultados.getString("cpf_cliente").toUpperCase());
                txt_consultar_func.setText(String.valueOf(resultados.getInt("cod_func")));
                txt_consultar_placa.setText(resultados.getString("placa_carro"));
                cmbbox_estado_ordem.setSelectedItem(resultados.getString("estado"));
                txtarea_consultar_desc.setText(resultados.getString("descricao"));
                txt_consultar_data.setText(resultados.getString("data_servico"));
                txt_consultar_mobra.setText(String.valueOf(resultados.getDouble("maodeobra")));
                txt_consultar_valor.setText(String.valueOf(resultados.getDouble("valortotal")));
            }

        } catch (SQLException sqle) {
            sqle.getMessage();
        } finally {
            acessobanco.fechaConexao();
            travarTelaConsuta();
        }
    }//GEN-LAST:event_btn_buscar_ordemActionPerformed

    private void btn_consultar_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_editarActionPerformed
        // TODO add your handling code here:
        destravarTelaConsulta();
    }//GEN-LAST:event_btn_consultar_editarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaOrdemDeServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizar_servicos;
    private javax.swing.JButton btn_buscar_ordem;
    private javax.swing.JButton btn_cad_ordemservico;
    private javax.swing.JButton btn_consultar_editar;
    private javax.swing.JComboBox<String> cmbbox_estado_ordem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField txt_consultar_cpf;
    private javax.swing.JTextField txt_consultar_data;
    private javax.swing.JTextField txt_consultar_func;
    private javax.swing.JTextField txt_consultar_mobra;
    private javax.swing.JTextField txt_consultar_nordem;
    private javax.swing.JTextField txt_consultar_placa;
    private javax.swing.JTextField txt_consultar_valor;
    private javax.swing.JTextField txt_numero_ordem;
    private javax.swing.JTextField txt_servico_cpf;
    private javax.swing.JTextField txt_servico_data;
    private javax.swing.JTextField txt_servico_func;
    private javax.swing.JTextField txt_servico_mdeobra;
    private javax.swing.JTextField txt_servico_placa;
    private javax.swing.JTextField txt_servico_valor;
    private javax.swing.JTextArea txtarea_consultar_desc;
    private javax.swing.JTextArea txtarea_servico_desc;
    // End of variables declaration//GEN-END:variables
}

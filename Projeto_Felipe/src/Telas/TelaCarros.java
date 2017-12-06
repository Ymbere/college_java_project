/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Carros;
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
 * @author caue
 */
public class TelaCarros extends javax.swing.JFrame {

    /**
     * Creates new form TelaCarros
     */
    DataBase acessobanco = new DataBase();
    
    public TelaCarros() {
        initComponents();
    }
    
    public void destravaTxtfieldConsulta(){
        
        txtfield_carros_getano.setEnabled(true);
        txtfield_carros_getmodelo.setEnabled(true);
        txtfield_carros_getmarca.setEnabled(true);
        txtfield_carros_getcor.setEnabled(true);
        txtfield_carros_getcombust.setEnabled(true);
        txtarea_carros_gethistory.setEnabled(true);
        txtfield_carro_getrenavan.setEnabled(true);       
                
               
    }

    public void travarTxtfieldConsulta(){
        
        txtfield_carros_getano.setEnabled(false);
        txtfield_carros_getmodelo.setEnabled(false);
        txtfield_carros_getmarca.setEnabled(false);
        txtfield_carros_getcor.setEnabled(false);
        txtfield_carros_getcombust.setEnabled(false);
        txtarea_carros_gethistory.setEnabled(false);
        txtfield_carro_getrenavan.setEnabled(false); 
    }
    public void limparTxtfieldCarro(){
        txtfield_carros_cadplaca.setText("");
        txtarea_carros_cadhistory.setText("");
        txtfield_carro_cadrenavan.setText("");
        txtfield_carros_cadano.setText("");
        txtfield_carros_cadcombust.setText("");
        txtfield_carros_cadcor.setText("");
        txtfield_carros_cadmodelo.setText("");
        cmbbox_carros_cadmarca.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtarea_carros_cadhistory = new javax.swing.JTextArea();
        txtfield_carros_cadmodelo = new javax.swing.JTextField();
        txtfield_carros_cadano = new javax.swing.JTextField();
        txtfield_carros_cadcor = new javax.swing.JTextField();
        txtfield_carros_cadcombust = new javax.swing.JTextField();
        txtfield_carro_cadrenavan = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtfield_carros_cadplaca = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter placa= new javax.swing.text.MaskFormatter("UUU-####");
            txtfield_carros_cadplaca = new javax.swing.JFormattedTextField(placa);
        }
        catch (Exception e){
        }
        cmbbox_carros_cadmarca = new javax.swing.JComboBox<>();
        btn_cadastrarCarro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtfield_carros_getplaca = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter placa= new javax.swing.text.MaskFormatter("UUU-####");
            txtfield_carros_getplaca = new javax.swing.JFormattedTextField(placa);
        }
        catch (Exception e){
        }
        jLabel36 = new javax.swing.JLabel();
        txtfield_carros_getmodelo = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtfield_carros_getmarca = new javax.swing.JTextField();
        txtfield_carro_getrenavan = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txtfield_carros_getcor = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtfield_carros_getano = new javax.swing.JTextField();
        txtfield_carros_getcombust = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtarea_carros_gethistory = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        btn_editarCarro = new javax.swing.JButton();
        btn_atualizarCarro = new javax.swing.JButton();
        btn_buscar_placa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(190, 190, 190));
        jPanel5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel5FocusGained(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel19.setText("ItCars");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 131, -1));

        jLabel20.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel20.setText("cadastrar");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel29.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel29.setText("RENAVAN");
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 70, -1));

        jLabel30.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel30.setText("MARCA");
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 67, -1));

        jLabel31.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel31.setText("MODELO");
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 67, -1));

        jLabel32.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel32.setText("COR");
        jPanel5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 67, -1));

        jLabel33.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel33.setText("ANO");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 67, -1));

        jLabel34.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel34.setText("COMBUSTIVEL");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, -1, -1));

        jLabel35.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel35.setText("HISTÓRICO");
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txtarea_carros_cadhistory.setColumns(20);
        txtarea_carros_cadhistory.setRows(5);
        jScrollPane2.setViewportView(txtarea_carros_cadhistory);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 276, 650, 130));

        txtfield_carros_cadmodelo.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jPanel5.add(txtfield_carros_cadmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 430, 30));

        txtfield_carros_cadano.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_cadano.setToolTipText("2017");
        jPanel5.add(txtfield_carros_cadano, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 170, 30));

        txtfield_carros_cadcor.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jPanel5.add(txtfield_carros_cadcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 220, 30));

        txtfield_carros_cadcombust.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jPanel5.add(txtfield_carros_cadcombust, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 180, 30));

        txtfield_carro_cadrenavan.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jPanel5.add(txtfield_carro_cadrenavan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 180, 30));

        jLabel44.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel44.setText("PLACA");
        jPanel5.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 67, -1));

        txtfield_carros_cadplaca.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_cadplaca.setToolTipText("AAA-1234");
        jPanel5.add(txtfield_carros_cadplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 170, 30));

        cmbbox_carros_cadmarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi", "Bentley", "BMW", "Chery", "Chevrolet", "Ferrari", "Fiat", "Ford", "Honda", "Hyundai", "Jaguar", "Jeep", "Kia", "Lamborghini", "Land Rover", "Lexus", "Lifan", "Mercedes-Benz", "Mini", "Nissan", "Peugeot", "Porsche", "Renault", "Suzuki", "Toyota", "VolksWagen", "Volvo" }));
        jPanel5.add(cmbbox_carros_cadmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 180, 30));

        btn_cadastrarCarro.setBackground(new java.awt.Color(102, 102, 102));
        btn_cadastrarCarro.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_cadastrarCarro.setText("CADASTRAR");
        btn_cadastrarCarro.setToolTipText("");
        btn_cadastrarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarCarroActionPerformed(evt);
            }
        });
        jPanel5.add(btn_cadastrarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 110, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CADASTRAR", jPanel1);

        jPanel2.setBackground(new java.awt.Color(190, 190, 190));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Thumbs Down", 1, 10)); // NOI18N
        jLabel21.setText("CONSULTAR");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel22.setFont(new java.awt.Font("Thumbs Down", 1, 24)); // NOI18N
        jLabel22.setText("ItCars");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 131, -1));

        jLabel45.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("DIGITE A PLACA");
        jPanel2.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 130, -1));

        txtfield_carros_getplaca.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_getplaca.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfield_carros_getplaca.setToolTipText("AAA-1234");
        txtfield_carros_getplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_carros_getplacaActionPerformed(evt);
            }
        });
        jPanel2.add(txtfield_carros_getplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 260, 30));

        jLabel36.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel36.setText("MODELO");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 67, -1));

        txtfield_carros_getmodelo.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_getmodelo.setEnabled(false);
        jPanel2.add(txtfield_carros_getmodelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 359, 30));

        jLabel37.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel37.setText("MARCA");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 67, -1));

        txtfield_carros_getmarca.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_getmarca.setEnabled(false);
        jPanel2.add(txtfield_carros_getmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 260, 30));

        txtfield_carro_getrenavan.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carro_getrenavan.setEnabled(false);
        jPanel2.add(txtfield_carro_getrenavan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 360, 30));

        jLabel38.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel38.setText("RENAVAN");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        txtfield_carros_getcor.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_getcor.setEnabled(false);
        jPanel2.add(txtfield_carros_getcor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 260, 30));

        jLabel39.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel39.setText("COR");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 67, -1));

        jLabel40.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel40.setText("ANO");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 67, -1));

        txtfield_carros_getano.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_getano.setToolTipText("2017");
        txtfield_carros_getano.setEnabled(false);
        jPanel2.add(txtfield_carros_getano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 170, 30));

        txtfield_carros_getcombust.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        txtfield_carros_getcombust.setEnabled(false);
        jPanel2.add(txtfield_carros_getcombust, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 170, 30));

        jLabel41.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel41.setText("COMBUSTIVEL");
        jPanel2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 230, -1));

        txtarea_carros_gethistory.setColumns(20);
        txtarea_carros_gethistory.setLineWrap(true);
        txtarea_carros_gethistory.setRows(5);
        txtarea_carros_gethistory.setEnabled(false);
        jScrollPane3.setViewportView(txtarea_carros_gethistory);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 430, 110));

        jLabel42.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        jLabel42.setText("HISTÓRICO");
        jPanel2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        btn_editarCarro.setBackground(new java.awt.Color(102, 102, 102));
        btn_editarCarro.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_editarCarro.setText("EDITAR");
        btn_editarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarCarroActionPerformed(evt);
            }
        });
        jPanel2.add(btn_editarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, 50));

        btn_atualizarCarro.setBackground(new java.awt.Color(102, 102, 102));
        btn_atualizarCarro.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_atualizarCarro.setText("ATUALIZAR");
        btn_atualizarCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atualizarCarroActionPerformed(evt);
            }
        });
        jPanel2.add(btn_atualizarCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 110, 50));

        btn_buscar_placa.setBackground(new java.awt.Color(102, 102, 102));
        btn_buscar_placa.setFont(new java.awt.Font("Andale Mono", 1, 12)); // NOI18N
        btn_buscar_placa.setText("GO");
        btn_buscar_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_placaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_buscar_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 50, 30));

        jTabbedPane1.addTab("CONSULTAR", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel5FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel5FocusGained

    private void btn_cadastrarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarCarroActionPerformed

        Carros cadcarro = new Carros();
        
        cadcarro.setPlaca(txtfield_carros_cadplaca.getText().toUpperCase());
        cadcarro.setRenavan(txtfield_carro_cadrenavan.getText().toUpperCase());
        cadcarro.setModelo(txtfield_carros_cadmodelo.getText().toUpperCase());
        cadcarro.setMarca(cmbbox_carros_cadmarca.getSelectedItem().toString().toUpperCase());
        cadcarro.setCor(txtfield_carros_cadcor.getText().toUpperCase());
        int ano;
        ano = Integer.parseInt(txtfield_carros_cadano.getText());
        cadcarro.setAno(ano);
        cadcarro.setCombustivel(txtfield_carros_cadcombust.getText().toUpperCase());
        cadcarro.setHistorico(txtarea_carros_cadhistory.getText().toUpperCase());
        
        // inserindo no banco
        
        try {
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itcars", "postgres", "1650424");
            con.setAutoCommit(false);
            try {
                String query = "INSERT INTO carros VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(query);
                ps.setString(1, cadcarro.getPlaca());
                ps.setString(2, cadcarro.getRenavan());
                ps.setString(3, cadcarro.getModelo());
                ps.setString(4, cadcarro.getMarca());
                ps.setString(5, cadcarro.getCor());
                ps.setInt(6, cadcarro.getAno());
                ps.setString(7, cadcarro.getCombustivel());
                ps.setString(8, cadcarro.getHistorico());                
                
                ps.executeUpdate();
                con.commit();
            } catch (SQLException ex) {
                Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Registro Adicionado");
        } catch (SQLException ex) {
            Logger.getLogger(TelaClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        limparTxtfieldCarro();

    }//GEN-LAST:event_btn_cadastrarCarroActionPerformed

    private void btn_editarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarCarroActionPerformed
        // TODO add your handling code here:
        destravaTxtfieldConsulta();
        
    }//GEN-LAST:event_btn_editarCarroActionPerformed

    private void btn_atualizarCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atualizarCarroActionPerformed
        // TODO add your handling code here:

        acessobanco.conecta();
        String placa = txtfield_carros_getplaca.getText().toUpperCase();
        String novo_renavan = txtfield_carro_getrenavan.getText().toUpperCase();
        String novo_modelo = txtfield_carros_getmodelo.getText().toUpperCase();
        String novo_marca = txtfield_carros_getmarca.getText().toUpperCase();
        String novo_cor = txtfield_carros_getcor.getText().toUpperCase();
        int novo_ano = Integer.parseInt(txtfield_carros_getano.getText());
        String novo_combustivel = txtfield_carros_getcombust.getText().toUpperCase();
        String novo_historico = txtarea_carros_gethistory.getText().toUpperCase();
        

        acessobanco.updateCarro(placa,novo_renavan,novo_modelo,novo_marca,
                novo_cor,novo_ano,novo_combustivel,novo_historico);
        
        acessobanco.fechaConexao();
        travarTxtfieldConsulta();
    }//GEN-LAST:event_btn_atualizarCarroActionPerformed

    private void btn_buscar_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_placaActionPerformed
        // TODO add your handling code here:

        try {
            acessobanco.conecta();

            String sql;
            sql = "SELECT * FROM carros WHERE placa = '" 
                    + txtfield_carros_getplaca.getText().toUpperCase() + "'";
            ResultSet resultados = acessobanco.consulta(sql);

            destravaTxtfieldConsulta();
            // ta pulando essa parte do codigo não sei porque
            while (resultados.next()) {
                txtfield_carros_getmodelo.setText(resultados.getString("modelocarro").toUpperCase());
                txtfield_carros_getmarca.setText(resultados.getString("marca").toUpperCase());
                txtfield_carros_getcor.setText(resultados.getString("cor").toUpperCase());
                txtfield_carros_getcombust.setText(resultados.getString("combustivel").toUpperCase());
                txtfield_carro_getrenavan.setText(resultados.getString("renavan"));
                int ano = resultados.getInt("ano");
                txtfield_carros_getano.setText(String.valueOf(ano));
                txtarea_carros_gethistory.setText(resultados.getString("historico"));   
            }

        } catch (SQLException sqle) {
            sqle.getMessage();
        } finally {
            acessobanco.fechaConexao();
            travarTxtfieldConsulta();
        }
    }//GEN-LAST:event_btn_buscar_placaActionPerformed

    private void txtfield_carros_getplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_carros_getplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_carros_getplacaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        new Menu().setVisible(true);
        System.out.println("Fechando");
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atualizarCarro;
    private javax.swing.JButton btn_buscar_placa;
    private javax.swing.JButton btn_cadastrarCarro;
    private javax.swing.JButton btn_editarCarro;
    private javax.swing.JComboBox<String> cmbbox_carros_cadmarca;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtarea_carros_cadhistory;
    private javax.swing.JTextArea txtarea_carros_gethistory;
    private javax.swing.JTextField txtfield_carro_cadrenavan;
    private javax.swing.JTextField txtfield_carro_getrenavan;
    private javax.swing.JTextField txtfield_carros_cadano;
    private javax.swing.JTextField txtfield_carros_cadcombust;
    private javax.swing.JTextField txtfield_carros_cadcor;
    private javax.swing.JTextField txtfield_carros_cadmodelo;
    private javax.swing.JTextField txtfield_carros_cadplaca;
    private javax.swing.JTextField txtfield_carros_getano;
    private javax.swing.JTextField txtfield_carros_getcombust;
    private javax.swing.JTextField txtfield_carros_getcor;
    private javax.swing.JTextField txtfield_carros_getmarca;
    private javax.swing.JTextField txtfield_carros_getmodelo;
    private javax.swing.JTextField txtfield_carros_getplaca;
    // End of variables declaration//GEN-END:variables
}

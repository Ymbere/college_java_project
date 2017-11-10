/*
﻿/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import Telas.*;


/**
 *
 * @author ymber
 */
public class DataBase {

    private Connection con;
    private Statement stm;
    private String logText;

    public DataBase() {
        con = null;
        stm = null;
    }

    public void conecta() {
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itcars", "postgres", "1650424");
            System.out.println("Conexão bem sucedida!");
            stm = con.createStatement();
        } catch (ClassNotFoundException cnf) {
            System.out.println("Exceção: " + cnf.toString());
        } catch (SQLException se) {
            System.out.println("Exceção: " + se.toString());
        }
    }

    public int inserir(String pedido) {
        int retorno = 0;
        try {
            stm.executeUpdate(pedido);
            System.out.println("Execução de Pedido Completada!");
            System.out.println(pedido);
            String dado = "Execução de Pedido Completada!  " + pedido + "\n";
            JOptionPane.showMessageDialog(null, "Sucesso!");
        } catch (SQLException e) {
            System.out.println("Exceção: " + e.toString() + " ERROR CODE" + e.getErrorCode());
            retorno = e.getErrorCode();

        } catch (NullPointerException npe) {
            System.out.println("Exceção: " + npe.toString());
        } finally {
            return retorno;
        }
    }

    public int logar(String usuario, String senha) {
        int retorno = 0;
        try {
            String sql = "SELECT usuario, senha FROM login WHERE ((usuario = " + usuario + ")"
                    + "AND (senha = " + senha + "));";
            stm.execute(sql);
            retorno = 1;
        } catch (SQLException e) {
            System.out.println("Exceção: " + e.toString() + " ERROR CODE" + e.getErrorCode());
        } finally {
            return retorno;
        }
    }

    public ResultSet consulta(String consulta) {
        ResultSet rs = null;
        try {
            rs = stm.executeQuery(consulta);
        } catch (SQLException e) {
            System.out.println("Exceção: " + e.toString());
        } catch (NullPointerException npe) {
            System.out.println(npe.toString());
        }
        return rs;
    }

    public void fechaConexao() {
        try {
            stm.close();
            con.close();
            System.out.println("Fechou o Banco");
        } catch (SQLException e) {
            System.out.println("Exceção: " + e.toString());
        }
    }

    public DefaultComboBoxModel popularcmbox() {
        
        DefaultComboBoxModel dcm = new DefaultComboBoxModel();
        try{
        List<String> carrolist = new ArrayList<>();
        String query = "SELECT * FROM carros;";
        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            carrolist.add(rs.getString("modelocarro"));
        }
        
        dcm.addElement(carrolist.toArray());    
       
        
        ps.close();
        
        return dcm;  
        
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return dcm;
        }
    }
}

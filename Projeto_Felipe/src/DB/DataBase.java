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
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/itcars", "postgres", "root");
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
        String dado ="Vazio";
        try {
            rs = stm.executeQuery(consulta);
            //JOptionPane.showMessageDialog(null, "Consulta realizada com sucesso!");
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

    public void updateCliente(String cpfbusca, String cpfnovo, String nome, String telefone,
            String email, String endereco){
        
        try{
        String sql = "UPDATE clientes SET " +
                "cpf = '" + cpfnovo + "'," +
                "nome = '" + nome + "'," +
                "telefone = '" + telefone + "'," +
                "email = '" + email + "'," +
                "endereco = '" + endereco + "'" +
                "WHERE cpf = '" + cpfbusca + "';";
                
        stm.executeUpdate(sql);
        
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
        
        } catch (SQLException sqle){
            sqle.getMessage();
        }
        
    }
    
    public void updateCarro(String placabusca, String renavan, String modelocarro,
            String marca, String cor, int ano, String combustivel, String historico){
        
        try{
            String sql = "UPDATE carros SET " +
                    "renavan = '" + renavan + "'," +
                    "modelocarro = '" + modelocarro + "'," +
                    "marca = '" + marca + "'," +
                    "cor = '" + cor + "'," + 
                    "ano = " + ano + "," +
                    "combustivel = '" + combustivel + "'," +
                    "historico = '" + historico + "'" +
                    "WHERE placa = '" + placabusca + "'";
            
            stm.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
        }
        
        catch (SQLException sqle){
            sqle.getMessage();
        }
    }
    
    public void updateOrdemServico(int numeroOrdem, String estado, String descricao,
            String data_servico, Double maoDeObra, Double valorTotal){
        
        try{
            String sql = "UPDATE servicos SET " +
                    "estado = '" + estado + "'," +
                    "descricao = '" + descricao + "'," +
                    "data_servico = '" + data_servico + "'," +
                    "maodeobra = " + maoDeObra + "," +
                    "valortotal = " + valorTotal +
                    "WHERE ordemnumero = " + numeroOrdem + ";";
            
            stm.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null, "Alteração feita com sucesso!");
        } 
        catch (SQLException sqle){
            sqle.getMessage();
        }
        
    }      
     
}

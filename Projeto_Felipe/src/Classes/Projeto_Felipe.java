/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Telas.Login;
import DB.DataBase;

/**
 *
 * @author ymber
 */
public class Projeto_Felipe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Login login = new Login();
        login.setVisible(true);
        login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);       
    }    
}

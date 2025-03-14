
package biblioMVC.model;

/**
 *
 * @author JEANDERSONLEDUR
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




import java.sql.DriverManager;
import java.sql.SQLException;



import java.sql.Connection;

/**
 *
 * @author Lenovo
 */
public class ConexaoSQLite {
   
    public static Connection conectar(){
        
        Connection conexao = null;
        String url = "jdbc:sqlite:biblioteca.db";
                
        try {
            conexao= DriverManager.getConnection(url);
            System.out.println ("Conexao com o banco estabelecida");
        }catch (SQLException e){
            System.out.println (" erro ao conectar ao banco" + e.getMessage());
    }
    return conexao;

}

}
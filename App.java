/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package biblioMVC;

import biblioMVC.model.ConexaoSQLite;
import biblioMVC.model.CriarTabela;
import biblioMVC.view.FrmLivro;
import java.sql.Connection;




public class App {
  
 

    public static void main(String[] args) {
        
        
        Connection conexao = ConexaoSQLite.conectar();
        
        
        CriarTabela.criarTabelaLivros(conexao);
              
        new FrmLivro().setVisible(true);
    }
}

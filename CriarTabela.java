
package biblioMVC.model ;

import biblioMVC.connection;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Lenovo
 */
public class CriarTabela {
    // Método que cria a tabela 'usuarios' no banco de dados
    public static void criarTabela(Connection conexao) {
        // Cria uma string contendo o comando SQL para criar a tabela, se não existir
        String sql = "CREATE TABLE IF NOT EXISTS livros (" 
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT, " // Coluna 'id' como chave primária com autoincremento
                   + "titulo TEXT NOT NULL, " // Coluna 'nome' do tipo TEXT, obrigatório (NOT NULL)
                   + "autor TEXT NOT NULL," // Coluna 'email' do tipo TEXT, obrigatório (NOT NULL)
                   + "ano TEXT NOT NULL" +
                           "),";
                   
        // Bloco try and catch para garantir o fechamento do Statement após a execução
        /*Create Statement cria um objeto do tipo Statement, que permite executar comandos 
        SQL no banco de dados.*/
        try (Statement stmt = conexao.createStatement()) { 
            stmt.execute(sql); // Executa o comando SQL para criar a tabela
            System.out.println("Tabela 'usuarios' criada ou já existente."); // Exibe mensagem de sucesso
        } catch (Exception e) { // Captura exceções que possam ocorrer durante a execução
            System.out.println("Erro ao criar tabela: " + e.getMessage()); // Exibe mensagem de erro
        }
    }

    public static void criarTabelaLivros(connection conexao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

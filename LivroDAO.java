/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

/**
 *
 * @author JEANDERSONLEDUR
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LivroDAO {
    private final Connection conexao;

    public LivroDAO() {
        this.conexao = ConexaoSQLite.conectar();
    }

    public void adicionarLivro(Livro livro) {
        String sql = "INSERT INTO livros (titulo, autor, anoPublicacao) VALUES (?, ?, ?)";
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
        stmt.setString(1, livro.getTitulo());
        stmt.setString(2, livro.getAutor());
        stmt.setInt(3, livro.getAnoPublicacao());
        stmt.executeUpdate();//executa atualizacao no banco de dados
        stmt.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        }
        
    }
}

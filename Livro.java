/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.model;

/**
 *
 * @author JEANDERSONLEDUR
 */


public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor que inicializa um objeto livro com id, titulo, autor, ano publicado
    public Livro(String titulo, String autor, int anoPublicacao) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Métodos Getters e Setters para acessar os atributos
    public int getId() {  // pega o ID
        return id;
    }

    public void setId(int id) { // Seta ID
        this.id = id;
    }

    public String getTitulo() { 
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
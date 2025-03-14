/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioMVC.controller;
import biblioMVC.model.Livro;
import biblioMVC.model.LivroDAO;




    
    public class LivroController {
        private LivroDAO livroDAO; // atributo privado que faz a interação com Banco
        
        public LivroController (){
         this.livroDAO = new LivroDAO();//cria uma isntancia de livro DAO para acessar o bnaco
        }
         
         public String adicionarLivro (String titulo, String autor, String anoTexto){
                 try{
             
             int ano = Integer.parseInt( anoTexto);
             Livro livro = new Livro (titulo, autor, ano);
             livroDAO.adicionarLivro (livro);
             
             return "Livro adicionar com sucesso!";
             
                     
         }  catch (NumberFormatException e){
            return "erro" + e.getMessage();
    }
        }
    
}
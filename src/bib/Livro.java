
package bib;

// comentario
public class Livro {
    int codigo;
    String titulo; 
    String editora;
    int ano;
    Autor autor;
    
    public Livro(){
        codigo = 0;
        titulo = "";
        editora = "";
        ano = 0;
        autor = new Autor();
    }
    
}

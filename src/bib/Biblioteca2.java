
package bib;

import java.util.ArrayList;


public class Biblioteca2 {
    ArrayList<Livro> acervo;
    
    public Biblioteca2(){
        acervo = new ArrayList();
    }
    
    public void adicionar(Livro l){
        acervo.add(l);
    }
    
    public boolean remover(Livro l){
        for(Livro aux : acervo){
            if (aux.codigo == l.codigo){
                acervo.remove(aux);
                return true;
            }
        }
        return false; 
    }
    
    public void listar(){
        for (Livro l : acervo){
            System.out.println("Codigo: " + l.codigo);
            System.out.println("Titulo: " + l.titulo);
            System.out.println("");
        }           
    }
    
    
}

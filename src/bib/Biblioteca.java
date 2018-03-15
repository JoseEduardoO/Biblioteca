
package bib;


public class Biblioteca {
    final int MAXIMO=3; 
    Livro acervo[];
    
    public Biblioteca(){
        acervo = new Livro[MAXIMO];
    }
    
    public void adicionar(Livro l){
        //procurar a posição livre
        boolean temLugar = false;
        for(int i=0; i < MAXIMO; i++){
            if (acervo[i] == null){
                acervo[i] = l;
                temLugar = true;
                break;
            }
        }
        if (!temLugar){
            System.out.println("Acervo lotado");
        }
        
    }
    
    public void listar(){
        for (Livro l : acervo){
            if (l != null){
                System.out.println("Código: " + l.codigo);
                System.out.println("Título: " + l.titulo);
            }         
        }
    }
    
    public boolean remover(Livro l){
        boolean removeu = false;
        for (int i=0; i < MAXIMO; i++){
            if (acervo[i].codigo == l.codigo){
               acervo[i] = null;
               removeu = true;
               return removeu;
            }
        }
        return removeu;
    }
    
}

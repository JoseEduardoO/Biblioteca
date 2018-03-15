/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bib;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José
 */
public class BibliotecaTest {
    
    public BibliotecaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAdicionar() {
        Biblioteca2 bib = new Biblioteca2();
        Livro livro = new Livro();
        livro.codigo = 1;
        livro.titulo = "Java";        
        bib.adicionar(livro);
        
        Livro livro2 = new Livro();
        livro2.codigo = 2;
        livro2.titulo = "Python";        
        bib.adicionar(livro2);
        
        Livro livro3 = new Livro();
        livro3.codigo = 3;
        livro3.titulo = "Assembly";        
        bib.adicionar(livro3);
        
        bib.listar();
        
//        bib.remover(livro2);
//        
//        bib.listar();
    }
    
}

package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Teclado {    
//    public static void main(String[] args) throws IOException {
//        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
//        int i = 0;
//        try {
//            i = Integer.parseInt(r.readLine());
//        } catch (IOException ex) {
//            System.out.println("Erro ao ler do teclado: " + ex.toString());
//        }
//        System.out.println(i * 2);
//    }

    public static int lerInteiro() throws IOException {
        int i = 0;
        i = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
        return i;
    }

}

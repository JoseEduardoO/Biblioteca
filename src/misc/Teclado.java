package misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = 0;
        try {
            i = Integer.parseInt(r.readLine());
        } catch (IOException ex) {
            System.out.println("Erro ao ler do teclado: "+ ex.toString());
        }
        System.out.println(i*2);
    }

}

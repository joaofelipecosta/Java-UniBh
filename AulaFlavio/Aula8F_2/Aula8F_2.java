package aula8f_2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author joaofelipe
 */
public class Aula8F_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String comida;
        Pessoa teste = new Pessoa();
        Sergio teste3 = new Sergio();
        System.out.println("Qual comida você dará a pessoa convidada e Sérgio? ");
        
        comida = ler.nextLine();
        teste.comer(comida);
        
        teste3.comer(comida);
    }
    
}

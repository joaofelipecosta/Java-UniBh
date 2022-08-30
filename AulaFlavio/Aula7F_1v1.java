package aula7f_1;

import java.util.Scanner;

/**
 *
 *  @author joaofelipecosta
 * github.com/joaofelipecosta
 */
public class Aula7F_1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner(System.in);
        int Valor1, Valor2;
        
        System.out.println("Digite o valor 1: ");
        Valor1 = ler.nextInt();
        System.out.println("Digite o valor 2: ");
        Valor2 = ler.nextInt();
        PrimeiraClasse nome = new PrimeiraClasse(Valor1, Valor2);
        
        int soma=nome.Soma();
        System.out.println("Soma: " +soma);
        
        int subt = nome.Subt();
        System.out.println("Subtração: " +subt);
        
        int mult=nome.Mult();
        System.out.println("Multiplicação: " + mult);
        
        int div=nome.Divs();
        System.out.println("Divisão: " +div);
    }
    
}

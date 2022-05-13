package aula5f_1v1;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;
/**
 *
 * @author joaofelipecosta
 * github.com/joaofelipecosta
 * replit.com/@joaofelipecosta
 */
public class Aula5F_1v1 {

    /**
     * Exercicio função java 
     * oque entra e como
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Declara variaveis
        double salario,imposto;
        Scanner ler = new Scanner (System.in);
        //Declara formato decimal
        DecimalFormat deci = new DecimalFormat("0.00");
        //Entrada de dado
        System.out.println("Digite seu salario:");
        salario = ler.nextDouble();
        // Definição de função
        imposto=CalculaImposto(salario);
        //saída
        System.out.println("Voce pagara em imposto: R$"+deci.format(imposto));
    }
    //Função
    public static double CalculaImposto (Double x){
        double desconto;
        desconto=x*0.14;
        //Retorno de dado
        return desconto;
    }
}

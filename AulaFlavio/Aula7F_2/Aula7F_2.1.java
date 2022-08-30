package aula7f_2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author joaofelipecosta
 */
public class Aula7F_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String x,y,z,w;
        int dias;
        System.out.println("Digite o nome: ");
        x = ler.nextLine();
        System.out.println("Digite o cargo: ");
        y = ler.nextLine();
        System.out.println("Digite o celular: ");
        z = ler.nextLine();
        System.out.println("Digite o endereço: ");
        w = ler.nextLine();
        
        System.out.println("Digite os dias trabalhados: ");
        dias = ler.nextInt();
        
        Pessoa nome = new Pessoa(x,y,z,w);
        
        Double salario = nome.Comissao(dias);
        Double desc=nome.Descontos(salario);
        System.out.println("Salario: " +salario);
        System.out.println("Decontos: " +desc);
        System.out.println("Nome: " +nome.nome);
    }
}

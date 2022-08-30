
package mypackage.aula5f_1v2;
import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author joaofelipecosta
 * github.com/joaofelipecosta
 * replit.com/@joaofelipecosta
 */
public class Aula5F_1v2 {

    /**
     * Desenvolver um sistema de contabilidade. Você identificou que há um processo
     * que se repete diversas vezes, no caso o calculo de um imposto, dada uma alíquota. 
     * E isso te deixa meio #xatiado por que são vários impostos e a avaliação
     * é de 12 meses (para cada mês, já o cálculo de INSS, simples, CREA, ICMS, ISS, e cada 
     * um deles deve ser descrito quando descontado). Porém você programa pra caramba...
     * Então faça um código que receba 12 faturamentos, e que calcule (e demonstre na tela)
     * o valor descontado de cada imposto para o respectivo mês, com um código enxuto e com
     * os cálculos automatizados de impostos.
     * 
     * Seguem as aliquotas:
     * INSS: 3%
     * Simples: 2,5%
     * CREA: 1,45%
     * ICMS: 2%
     * ISS: 1,67%
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0");        
        double faturamento, inss, simples, crea, icms, iss;
        
        // ---- i++ ---- Antes do Código rodar ---- //
        for(int i=0;i<12;i++){
        System.out.println("Digite seu faturamento no mês: " +(i+1));
        faturamento = input.nextDouble();
        
        // ---- Variável --- Função (x,y) ---- //
        inss=CalculaImposto(faturamento,0.03);
        System.out.println("Você pagará de INSS no mês "+(i+1)+": R$"+ deci.format(inss));
        simples=CalculaImposto(faturamento,0.025);
        System.out.println("Você pagará de Simples no mês "+(i+1)+": R$"+ deci.format(simples));
        crea=CalculaImposto(faturamento,0.0145);
        System.out.println("Você pagará de CREA no mês "+(i+1)+": R$" + deci.format(crea));
        icms=CalculaImposto(faturamento,0.02);
        System.out.println("Você pagará de ICMS no mês "+(i+1)+": R$"+deci.format(icms)); // ---- icms retorna (função) ---- //
        iss=CalculaImposto(faturamento,0.0167);
        System.out.println("Você pagará de ISS no mês "+(i+1)+": R$"+deci.format(iss));
        }
    }
    
    // ---- ex: Função (faturamento,0.03) ---- //
    public static double CalculaImposto(Double x, Double y){
        double desconto;
        desconto=x*y;
        return desconto;
    }
}

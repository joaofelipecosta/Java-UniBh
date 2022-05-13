/*
 *Em um campeonato por pontos corridos do Jogo Capcom VS SNK 2, a lógica do jogo
é a seguinte: é inserido um participante pelo usuário. São exatamente 30 lutas, onde
o software pergunta ao usuário, a cada luta o número do resultado, onde: vitórias
de perfect-1, vitórias-2, empates-3 e derrotas-4, onde:.

Se ele ele teve vitória de PERFECT, sua pontuação é somada em 100 pontos;

Se ele ele teve vitória, sua pontuação é somada em 50 pontos;

Se ele ele teve Double KO, sua pontuação é somada em 20 pontos;

Se ele ele perdeu, sua pontuação é subtraída em 10 pontos;
 */
package aula4f_1v2;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author joaofelipecosta
 * github.com/joaofelipecosta
 * replit.com/@joaofelipecosta
 */
public class Aula4F_1v2 {

    
    public static void main(String[] args) {
        double pontos=0, resultado=0;
        int luta;
        String participante;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Insira o nome do participante: ");
        participante = ler.next();
        
        for(int i = 1; i <30; i++){    
        System.out.println("Digite o resultado da luta: vitória de perfect-1, vitórias-2, empates-3 e derrotas-4,: " +i);
        luta = ler.nextInt();
        switch (luta){
            case 4:
                System.out.println("Derrota");
                pontos = -10;
                break;
            case 3:
                System.out.println("Double KO");
                pontos = 20;
                break;
            case 2:
                System.out.println("Vitoria");
                pontos = 50;
                break;
            case 1:
                System.out.println("Perfect");
                pontos = 100;
                break;
        }
        resultado = resultado+pontos;
        }
        System.out.println("Campeonato:" +resultado);
    }
    
}

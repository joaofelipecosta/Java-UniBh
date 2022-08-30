package aula6f_1v1;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author joaofelipecosta
 * github.com/joaofelipecosta
 * replit.com/@joaofelipecosta
 */
public class Aula6F_1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ArrayList<String> perfil = new ArrayList();
        
        perfil.add("Darkseid;DC;Vilão pouco apresentado nos filmes");
        perfil.add("Thanos;Marvel;Vilão Nerfado nos filmes");
        perfil.add("Doomsday;DC;Vilão Desperdiçado");
        perfil.add("Batman;DC;Herói mais P$#%¨$ das galáxias e minha opinião é que importa");
        
        int i;
        
        System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
        int n = perfil.size();
        for (i=0; i<n; i++) {
            System.out.printf("Posição %d- %s\n", i, perfil.get(i));
        }
        System.out.printf("\nInforme a posição a ser excluída: \n");
        i = ler.nextInt();
        
        try {
            perfil.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.printf("\nErro: posição inválida (%s).",
                e.getMessage());
        }
        System.out.printf("\nPercorrendo o ArrayList (usada for-each)\n");
        i = 0;
        for (String contato: perfil) {
            System.out.printf("Posição %d- %s\n", i, contato);
            i++;
        }
        System.out.printf("\nPercorrendo o ArrayList (usando iterator)\n");
        i = 0;
        Iterator<String> iterator = perfil.iterator();
        while (iterator.hasNext()){
            System.out.printf("Posição %d- %s\n", i, iterator.next());
        }
    }
    
}

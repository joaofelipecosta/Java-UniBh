/*
 * Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado deve contar (que é contabilizado pelo jogo), 
o número de kills, deaths e assists. Se o número de kills for menor ou igual a 5, ele mostra a mensagem "noob", se chegar a 20 ou mais "master".
Se o número de deaths chegar a 20 ou mais, ele mostra a mensagem "Houston, we heave a problem". Se o número de assists chegar a 20 ou mais, é mostrada
a mensagem: "team work". Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
 */
package mypackage.aula4f_1v3;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author joaofelipecosta
 * github.com/joaofelipecosta
 */
public class Aula4F_1v3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String vencedor; double pontos=0, resultado=0;int kills=0, deaths=0, assists=0,killstotal=0, deathstotal=0, assiststotal=0;
        Scanner ler = new Scanner(System.in);
        vencedor="n";
        
        while (vencedor.equals("n")) {
            
            System.out.println("Numero de kills: ");
            kills = ler.nextInt(); 
            killstotal=killstotal+kills;
            
            System.out.println("Numero de Deaths: ");
            deaths = ler.nextInt();
            deathstotal=deathstotal+deaths;
            
            System.out.println("Numero de assists: ");
            assists = ler.nextInt();
            assiststotal=assiststotal+assists;
           
            
            if(killstotal<=5){System.out.println("Noob");}
            if(kills>=20){System.out.println("Master");}
            if(deathstotal>=20){System.out.println("Houston, we have a problem");}
            if(assists>=20){System.out.println("Team work");}
            
            System.out.println("Há um vencedor???");
            vencedor = ler.next();
        }       
    }
}

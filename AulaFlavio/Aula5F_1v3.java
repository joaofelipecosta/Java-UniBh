package mypackage.aula5f_1v3;
import java.util.Scanner;
import java.io.*;

/**
 * @author joaofelipecosta
 * github.com/joaofelipecosta
 * replit.com/@joaofelipecosta
 */
public class Aula5F_1v3 {

    /**
     *Em uma empresa de logística há o processo de embarque de cargas. O software pergunta ao seu motorista
     * qual a carga máxima de seu caminhão. Respondida a carga, o software pergunta se ele gostaria de cadas-
     * trar seu caminhão para serviços. Caso ele diga "s", de sim, o sistema executa um processo de conexão 
     * com banco de dados e registro do caminhão que ele demonstra através de mensagens "Conectando ao Banco
     * de Dados", "Caminhão Cadastrado". Depois, ele realiza um cálculo de transbordo, onde ele calcula a carga
     * máxima que o caminhão poderá transportar, retirando uma margem de 5% de segurança. Essa carga efetiva de
     * transporte deve ser multiplicada por uma taxa de R$120,54, que é o preço por tonelada transbordada
     * (imprima o valor a ser pago). Caso ele digite "n", de não, o sistema deve agradecer e finalizar.
     */
    public static void ConectaBanco(){
        System.out.println("Conectando ao Banco de Dados");
        System.out.println("Caminhão cadastrado"); 
    }
    
    // https://pt.linkedin.com/pulse/qual-diferen%C3%A7a-entre-par%C3%A2metro-e-argumento-numa-fun%C3%A7%C3%A3o-milena-lara 
  
    public static double Calcula(Double x){
        double seguranca;
        seguranca=x*0.95;
        return seguranca;
    }
    // ---- (double x) --- Parâmetro ---- //
    
    public static void main(String[] args){
        double carga, transporte, carga2;
        String servico;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite sua carga máxima: ");
        carga = input.nextDouble();
        
        System.out.println("Gotaria de Cadastrar seu Caminhão?");
        servico = input.next();
        
        if(servico.equals("s")){
            ConectaBanco();
            carga2=Calcula(carga);
            
            // ---- calcula(carga) --- Argumento ---- //
            
            transporte=carga2*120.54;
            System.out.println("Total do frete: " + transporte);
        }else{
            System.out.println("Finalizando");
        }
    }
}

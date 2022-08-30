package aula7f_3;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author joaofelipe
 */
public class Aula7f_3 {

    public static void main(String[] args) { 
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner ler = new Scanner(System.in);
        Date data = null;
        String x,y,z,u,l,k;
        String a,b,c;
        double w,m,taxa;
        int pr;
        
        System.out.println("Sobre o médico... ");
        
        System.out.println("Digite o nome: ");
        a = ler.nextLine();
        System.out.println("Digite o crm: ");
        b = ler.nextLine(); 
        System.out.println("Digite o telefone de contato: ");
        c = ler.nextLine();
        
        System.out.println("Sobre o Paciente: ");
        System.out.println("Digite o nome: ");
        x = ler.nextLine();
        System.out.println("Digite o endereco: ");
        y = ler.nextLine();
        System.out.println("Digite o cpf: ");
        z = ler.nextLine();
        System.out.println("Digite a identidade: ");
        u = ler.nextLine();
        System.out.println("Digite o peso: ");
        w = ler.nextDouble();
        System.out.println("Digite o Procedimento... ");
        System.out.println("Digite a descrição.. ");
        l = ler.nextLine();
        System.out.println("Digite a Data: ");
        k = ler.next();
        
        try{
            data = sdf.parse(k);
        }catch (java.text.ParseException e){ return;
        }
        System.out.println("Digite o valor: ");
        m = ler.nextDouble();
        
        Paciente pac  =new Paciente(x,y,z,w,u);
        Medico Med = new Medico(a,b,c);
        Procedimentos proc= new Procedimentos(data,l,m);
        
        System.out.println("Digite o numero de procedimentos: ");
        pr = ler.nextInt();
        taxa=proc.Taxa(pr);
        System.out.println("Taxa: R$ "+taxa);
    }
}

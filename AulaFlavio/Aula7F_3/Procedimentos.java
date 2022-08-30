package aula7f_3;
import java.util.Scanner;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author joaofelipe
 */
    public class Procedimentos {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;
        String descricao;
        double valor;
        double pagar;
        public Procedimentos(Date a, String b, Double c){ 
            data = a;
            descricao = b;
            valor = c;
        }
        public double Taxa(int quant){
            this.pagar = valor*quant;
            return pagar;
        }
    }

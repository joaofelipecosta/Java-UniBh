package aula8f_1;

/**
 *
 * @author joaofelipe
 */
public class Aula8F_1 {

    public static int quadrado(int num){
        int quadrado;
        quadrado = num * num;
        return quadrado;
    }
    
    public static double quadrado(double num){
        double quadrado;
        quadrado = num * num;
        return quadrado;
    }
    
    public static void main(String[] args) {
        System.out.println("Inteiro 2 ao quadrado: " + quadrado(2));
        System.out.println("Double PI ao quadrado: " + quadrado(Math.PI));
    }
    
}

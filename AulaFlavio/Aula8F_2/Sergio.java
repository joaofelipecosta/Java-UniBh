package aula8f_2;

/**
 *
 * @author joaofelipe
 */
public class Sergio extends Pessoa {
    @Override
    public void comer (String alimento)
    {
    if(alimento.equals("peixe") || alimento.equals("Peixe")) {
    System.out.println("Sérgio não gosta de peixe. Não vai comer.");
    }else{
    System.out.println("Bora comer " + alimento);
        }
    }
}

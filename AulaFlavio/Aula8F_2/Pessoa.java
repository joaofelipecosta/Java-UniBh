package aula8f_2;

/**
 *
 * @author joaofelipe
 */
public class Pessoa {
    String nome;
    int idade;
    public void setNome(String nome){ this.nome=nome;}
    public String getNome(){ return nome;}
    
    public void setIdade(int idade) { this.idade=idade;}
    public int getIdade() { return idade;}
    
    public Pessoa(){
    }
    public void comer (String alimento){
        System.out.println("Pessoa comendo " + alimento);
    }
}

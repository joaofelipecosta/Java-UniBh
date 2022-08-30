package aula7f_2;

/**
 *
 * @author joaofelipe
 */
public class Pessoa {
    
    public String nome;
    public String celular;
    public String endereco;
    public String cargo;
    public Double salario;
    public Double desc;
    
    public Pessoa(String a, String b, String c, String d)
    { nome = a;
    celular = b;
    endereco = c;
    cargo = d;
    }
    
public double Comissao(int dias){
    this.salario = dias*1000.00;
    return salario;
    }
    public double Descontos(double sal){ 
    this.desc=sal*0.12;
    return desc;
}  
}

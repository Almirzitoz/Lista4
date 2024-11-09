package questao2;

public class Empregado {
    public String nome;
    protected double salario;

    public void setNome_Salario(String nome,double salario){
        this.salario = salario;
        this.nome = nome;
    }

    public String getNome(){
        return(nome);
    }

    public double getSalarioDouble(){
        return(salario);
    }
    @Override
    public String toString(){
        return("Nome: "+nome+"\nSalário: "+salario);
    }

    
}

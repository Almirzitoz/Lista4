package questao6;

public class Empregado {
    protected String nome;
    protected double salario;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(Double salario){
        this.salario = salario;
    }

    public String getNome(){
        return(nome);
    }

    public double getSalario(){
        return(salario);
    }
}

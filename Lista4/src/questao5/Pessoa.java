package questao5;

public class Pessoa {
    protected String nome;
    protected int idade;
    
    public void setValores(String nome,int idade){
        this.idade = idade;
        this.nome = nome;
    }

    public String getNome(){
        return(nome);
    }
    public int getIdade(){
        return(idade);
    }
}

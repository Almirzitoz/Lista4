package questao1;

public class ingressos{
    protected double valor = 22.5;
    protected String nome;

    public String getValor(){
        return(Double.toString(valor));
    }
    public double getValorNumero(){
        return(valor);
    }
    public String getNome(){
        return(nome);
    }
    public void setIngresso(String nome){
        
        this.nome = nome;
    }
}


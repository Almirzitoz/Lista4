package questao1;

public class ingressosVip extends ingressos{
    double valorAdicional = 22.5;
    public double valorVipCalculo(){
        this.valor = this.valor + valorAdicional;
        return(this.valor);
    }


    public String getValor(){
        return(Double.toString(valor));
    }
}

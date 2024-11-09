package questao6;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public void setValoresProducao(double valorDeProducao,double comissao){
        this.valorProducao = valorDeProducao;
        this.comissao = comissao;
    }

    public double getValorDeProducao(){
        return(valorProducao);
    }

    public double getComissao(){
        return(comissao);
    }

    private void calcularSalario(){
        double comissaoPorcetagem = comissao/100;
        double comissaoGanha = valorProducao*comissaoPorcetagem;
        this.salario = this.salario+comissaoGanha;
    }

    @Override
    public double getSalario(){
        calcularSalario();
        return(salario);
    }
}

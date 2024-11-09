package questao2;

public class Vendendor extends Empregado{
    private int vendas;
    private double comissao;
    private double salarioComissao;

    public void setValores(int vendas,double comissao){
        this.vendas =vendas;
        this.comissao =comissao;
    }

    public double getComissao(){
        return(comissao);
    }

    public double calcularSalario(){
         double s1 = comissao/100;
         double s2 = vendas*s1; 
         double s3 = salario*s2;
         salarioComissao = salario+s3;
         return(salarioComissao);
    }

    @Override
    public String toString(){
        return(super.toString()+"\nComissão: "+comissao+"%"+"\nSalario com comissão: "+calcularSalario());
    }
}

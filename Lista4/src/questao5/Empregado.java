package questao5;

public class Empregado extends Pessoa{
    private int codigoSetor;
    private double salarioBase;
    private double salarioComImposto;
    private double imposto;

    public void setValores(String nome,int idade,int codigo,double salario,double imposto){
        super.setValores(nome, idade);
        this.codigoSetor = codigo;
        this.salarioBase = salario;
        this.imposto = imposto;
    }

    public int getSetor(){
        return(codigoSetor);
    }
    public double getSalarioBase(){
        return(salarioBase);
    }
    public double getSalarioComImposto(){
        if (salarioComImposto == 0) {
            calcularSalario();
            return(salarioComImposto);
        }else{
            return(salarioComImposto);
        }
    }
    public double getImposto(){
        return(imposto);
    }

    public void calcularSalario(){
        double porcentagem = imposto/100;
        double valorCobrado = salarioBase*porcentagem;
        salarioComImposto = salarioBase - valorCobrado;
    }

}

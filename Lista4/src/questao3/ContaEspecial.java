package questao3;

public class ContaEspecial extends ContaCorrente{
    private double limite;

    public void setSaldo(double valor, double limite){
        this.saldo = valor;
        this.limite =limite;
    }

    @Override
    public void sacar(double valor){
        if (valor > saldo+limite) {
            System.out.println("Valor acima do limite!");
        }else if (valor < saldo+limite) {
            saldo -= valor;
            System.out.println("Saque no valor de "+valor+"$ foi realizado sem o uso do limite extra");
        }else{
            saldo -= valor;
            System.out.println("Saque no valor de "+valor+"$ foi realizado com uso do limite extra");
        }
    }
}

package questao3;

public class ContaCorrente {
    protected double saldo;

    public void setSaldo(double valor){
        this.saldo = valor;
    }
    public void sacar(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficente!");
        }else{
            saldo = saldo - valor;
            System.out.println("Saque no valor de "+valor+"$ foi realizado");
        }
    }

    public void depositar(double valor){
        saldo = saldo+valor;
        System.out.println("Foi depositado o valor de "+valor+"$");
    }

    public void verSaldo(){
        System.out.println("Saldo atual: "+saldo+"$");
    }
}

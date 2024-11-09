package questao3;

public class Principal {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        ContaEspecial contaEspecial = new ContaEspecial();
        conta.setSaldo(5000);
        contaEspecial.setSaldo(5000,2000);
        System.out.println("_____-Conta Corrente-_____");
        conta.verSaldo();
        conta.sacar(5001);
        conta.verSaldo();
        conta.sacar(2000);
        conta.verSaldo();

        System.out.println("_____-Conta Especial-_____");
        contaEspecial.verSaldo();
        contaEspecial.sacar(7001);
        contaEspecial.verSaldo();
        contaEspecial.sacar(2000);
        contaEspecial.verSaldo();
        contaEspecial.depositar(2000);
        contaEspecial.verSaldo();
        contaEspecial.sacar(6000);
        contaEspecial.verSaldo();


    }
}

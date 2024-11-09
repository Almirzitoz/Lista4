package questao7;
class Empregado {
    private String nome;
    private double salarioBase;

    public Empregado(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}

class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, double salarioBase, double valorVendas, double comissao) {
        super(nome, salarioBase);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (valorVendas * (comissao / 100));
    }
}
public class Main {
public static void main(String[] args) {
        Vendedor vendedor = new Vendedor("João Silva", 3000.0, 50000.0, 10.0);
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salário Base: R$ " + vendedor.getSalarioBase());
        System.out.println("Salário Total com Comissão: R$ " + vendedor.calcularSalario());
}
}
package questao10;
import java.util.Scanner;

class Produto {
    private String nome;
    private double precoCusto, precoVenda, despesas;

    public Produto(String nome, double precoCusto, double precoVenda, double despesas) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.despesas = despesas;
    }

    public double calcularMargemLucro() {
        return ((precoVenda - (precoCusto + despesas)) / precoVenda) * 100;
    }
}

public class Main {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o preço de custo: ");
        double precoCusto = scanner.nextDouble();

        System.out.print("Informe o preço de venda: ");
        double precoVenda = scanner.nextDouble();

        System.out.print("Informe as despesas: ");
        double despesas = scanner.nextDouble();

        Produto produto = new Produto(nome, precoCusto, precoVenda, despesas);
        System.out.println("Margem de lucro: " + produto.calcularMargemLucro() + "%");

        scanner.close();
    }
}

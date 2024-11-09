package questao2;

public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        Gerente gerente = new Gerente();
        Vendendor vendedor = new Vendendor();

        empregado.setNome_Salario("Abner", 1500);

        gerente.setNome_Salario("Almir", 9750);
        gerente.setDepartamento("Vendas");

        vendedor.setNome_Salario("Ana", 2520);
        vendedor.setValores(38, 20);

        System.out.println("Classe empregado:\n"+empregado.toString());
        System.out.println("Classe gerente:\n"+gerente.toString());
        System.out.println("Classe vendedor:\n"+vendedor.toString());

    }
}

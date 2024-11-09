package questao5;

public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();

        empregado.setValores("Abner", 18, 007, 10000, 15);
        System.out.println("Nome: "+empregado.getNome());
        System.out.println("Idade: "+empregado.getIdade());
        System.out.println("Codigo do setor: "+ empregado.getSetor());
        System.out.println("Imposto descontado: "+empregado.getImposto()+"%");
        System.out.println("Salario base: "+empregado.getSalarioBase());
        System.out.println("Salrio com imposto descontado: "+empregado.getSalarioComImposto());
    }
}

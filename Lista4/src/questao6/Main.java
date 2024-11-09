package questao6;

public class Main {
public static void main(String[] args) {
    Empregado empregado = new Empregado();
    Operario operario = new Operario();

    empregado.setNome("Almir");
    empregado.setSalario(1560.00);
    operario.setNome("Abner");
    operario.setSalario(1200.00);
    operario.setValoresProducao(1000, 10);
    System.out.println("-----Empregado-----"+"\nNome: "+empregado.getNome()+"\nSalário: "+empregado.getSalario()+"$");
    System.out.println("-----Operário-----"+"\nNome: "+operario.getNome()+"\nValor de produção: "+operario
    .getValorDeProducao()+"\nComissão: "+operario.getComissao()+"\nSalário com comissão: "+operario.getSalario());
}
}

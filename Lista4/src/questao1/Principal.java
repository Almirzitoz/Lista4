package questao1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        ingressos um = new ingressos();
        ingressos dois = new ingressos();
        ingressos tres = new ingressos();
        ingressos quatro = new ingressos();
        ingressos cinco = new ingressos();

        ingressosVip vip1 = new ingressosVip();
        ingressosVip vip2 = new ingressosVip();
        ingressosVip vip3 = new ingressosVip();

        evento evento = new evento();
        um.setIngresso("1");
        dois.setIngresso("2");
        tres.setIngresso("3");
        quatro.setIngresso("4");
        cinco.setIngresso("5");

        vip1.setIngresso("Vip 1");
        vip2.setIngresso("Vip 2");
        vip3.setIngresso("Vip 3");

        evento.addIngresso(um.getNome());
        evento.addIngresso(dois.getNome());
        evento.addIngresso(tres.getNome());
        evento.addIngresso(quatro.getNome());
        evento.addIngresso(cinco.getNome());

        evento.addIngressoVip(vip1.getNome());
        evento.addIngressoVip(vip2.getNome());
        evento.addIngressoVip(vip3.getNome());

        boolean fim = false;

        while (!fim) {
            System.out.println("Digite: \n1- Para comprar ingressos normais\n2- Para comprar ingressos VIP\n3- Para finalizar");
            String escolha1 = imput.nextLine();

            if (escolha1.equals("1")) {
                System.out.println("Ingressos: " + evento.ingressos);
                System.out.println("Digite a quantidade de ingressos: ");
                int escolha2 = imput.nextInt();
                imput.nextLine();
                
                if (escolha2 > evento.ingressos.size()) {
                    System.out.println("Número maior que a quantidade, tente novamente!");
                } else {
                    for (int i = 0; i < escolha2; i++) {
                        System.out.println("Digite o número do ingresso:");
                        String ingressoescolhido = imput.nextLine();
                        if (evento.ingressos.contains(ingressoescolhido)) {
                            evento.venderIngressos(ingressoescolhido);
                            System.out.println("Ingressos: " + evento.ingressos);
                        } else {
                            System.out.println("Ingresso inválido, tente novamente!");
                            escolha2++;
                        }
                    }
                }
            } else if (escolha1.equals("2")) {
                System.out.println("Ingressos VIP: " + evento.ingressosvip);
                System.out.println("Digite a quantidade de ingressos VIP: ");
                int escolha2 = imput.nextInt();
                imput.nextLine();
                
                if (escolha2 > evento.ingressosvip.size()) {
                    System.out.println("Número maior que a quantidade de ingressos VIP. Tente novamente!");
                } else {
                    for (int i = 0; i < escolha2; i++) {
                        System.out.println("Digite o número do ingresso VIP (de 1 ao último ingresso):");
                        int ingressoescolhido = imput.nextInt();
                        imput.nextLine();
                        if (ingressoescolhido > evento.ingressosvip.size()) {
                            System.out.println("Ingresso inválido!");
                            escolha2++;
                        } else {
                            evento.venderIngressosVip(Integer.toString(ingressoescolhido));
                            System.out.println("Ingressos VIP: " + evento.ingressosvip);
                        }
                    }
                }
            } else if (escolha1.equals("3")) {
                System.out.println("Deseja finalizar (sim/não):");
                String escolha3 = imput.nextLine();
                if (escolha3.equals("sim")) {
                    int vendidos = evento.verificarVendidos();
                    int vendidosVip = evento.verificarVendidosVip();
                    int naoVendidos = evento.verificarNaovendidos();
                    int naoVendidosVip = evento.verificarNaovendidosVip();

                    double valorArrecadado = um.getValorNumero() * vendidos;
                    double valorArrecadadovip = vip1.valorVipCalculo() * vendidosVip;

                    System.out.println("Ingressos normais:");
                    System.out.println("Vendidos: " + vendidos);
                    System.out.println("Não vendidos: " + naoVendidos);
                    System.out.println("Valor arrecadado: " + valorArrecadado);
                    System.out.println();
                    System.out.println("Ingressos VIP:");
                    System.out.println("Vendidos: " + vendidosVip);
                    System.out.println("Não vendidos: " + naoVendidosVip);
                    System.out.println("Valor arrecadado: " + valorArrecadadovip);
                    fim = true;
                }
            } else {
                System.out.println("Escolha inválida!");
            }
        }

        imput.close();
    }
}

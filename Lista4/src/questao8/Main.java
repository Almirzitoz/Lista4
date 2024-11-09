package questao8;
class ControleRemoto {
    private boolean ligada = false;
    private int volume = 10;
    private int canal = 1;
    private boolean mute = false;

    public void ligarDesligar() {
        ligada = !ligada;
        System.out.println(ligada ? "TV ligada" : "TV desligada");
    }

    public void aumentarVolume() {
        if (ligada && !mute) {
            volume++;
            System.out.println("Volume: " + volume);
        }
    }

    public void diminuirVolume() {
        if (ligada && !mute) {
            volume--;
            System.out.println("Volume: " + volume);
        }
    }

    public void aumentarCanal() {
        if (ligada) {
            canal++;
            System.out.println("Canal: " + canal);
        }
    }

    public void diminuirCanal() {
        if (ligada) {
            canal--;
            System.out.println("Canal: " + canal);
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligada) {
            canal = novoCanal;
            System.out.println("Canal trocado para: " + canal);
        }
    }

    public void mute() {
        mute = !mute;
        System.out.println(mute ? "TV no modo Mute" : "TV com som");
    }

    public void consultarStatus() {
        System.out.println("TV ligada: " + ligada);
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
    }
}
public class Main {
public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligarDesligar();
        controle.aumentarVolume();
        controle.trocarCanal(5);
        controle.mute();
        controle.consultarStatus();
    }
}

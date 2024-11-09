package questao4;

public class Retangulo extends Forma {
    private int altura;
    private int base;

    public void setValores(int altura,int base){
        this.altura = altura;
        this.base = base;
    }

    public void calcularArea(){
        
        this.area = base*altura;
        System.out.println("Area do "+mostrarNome()+": "+this.area);
    }
}

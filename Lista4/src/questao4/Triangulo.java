package questao4;

public class Triangulo extends Forma {
    private int altura;
    private int base;

    public void setValores(int altura,int base){
        this.altura = altura;
        this.base = base;
    }
    public void calcularArea(){
        int a1 = base*altura;
        this.area = a1/2;
        System.out.println("Area do "+mostrarNome()+": "+this.area);
    }
    
}


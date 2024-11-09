package questao4;

public class Circulo extends Forma{
    private int raio;
    private double pi = 3.14;

    public void setRaio(int raio){
        this.raio= raio;
    }

    public void calcularArea(){
        int raioAoQuadrado = raio*raio;
        this.area = pi*raioAoQuadrado;
        System.out.println("Area do "+mostrarNome()+": "+this.area);
    }
}

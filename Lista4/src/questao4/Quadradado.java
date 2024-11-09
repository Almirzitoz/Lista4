package questao4;

public class Quadradado extends Forma{
    private double extencao;
    
    public void setExtecao(int exetncao){
        this.extencao = exetncao;
    }
    public void calcularArea(){
        this.area = extencao*extencao;
        System.out.println("Area do "+mostrarNome()+": "+this.area);
    }
}

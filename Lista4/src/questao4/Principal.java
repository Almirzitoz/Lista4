package questao4;

public class Principal {
    public static void main(String[] args) {
        Quadradado quadradado = new Quadradado();
        Triangulo triangulo = new Triangulo();
        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        quadradado.setNome("quadrado");
        circulo.setNome("circulo");
        triangulo.setNome("triangulo");
        retangulo.setNome("retangulo");

        quadradado.setExtecao(5);
        triangulo.setValores(5, 2);
        retangulo.setValores(4, 5);
        circulo.setRaio(2);

        quadradado.calcularArea();
        triangulo.calcularArea();
        retangulo.calcularArea();
        circulo.calcularArea();
    }
}

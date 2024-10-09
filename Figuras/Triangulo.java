package Figuras;

public class Triangulo extends Figura implements iMovible, iDibujable {

    private double base;
    private double altura;

    public Triangulo(String color, double x, double y, double altura, double base) {
        super(color, x, y);
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public void moverHorizontalmente(int distancia) {
        this.x += distancia;
    }

    public void moverVerticalmente(int distancia) {
        this.y += distancia;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo de base " + base);
    }

    @Override
    public void rotar() {
        System.out.println("Rotando el triángulo");
    }




}

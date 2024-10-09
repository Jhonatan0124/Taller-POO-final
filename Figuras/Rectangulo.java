package Figuras;

public class Rectangulo extends Figura implements iMovible, iDibujable {

    private double base;
    private double altura;

    public Rectangulo(String color, double x, double y, double altura, double base) {
        super(color, x, y);
        this.altura = altura;
        this.base = base;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
    }

    public void rotar() {
        System.out.println("Rotando el círculo");
    }
}

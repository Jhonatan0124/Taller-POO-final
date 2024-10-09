package Figuras;

public class Circulo extends Figura implements iMovible, iDibujable {
    private double radio;

    public Circulo(String color, double x, double y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void moverHorizontalmente(double distancia) {
        x += distancia;
    }

    public void moverVerticalmente(double distancia) {
        this.y += distancia;
    }

    public void dibujar() {
        System.out.println("Dibujando un círculo de radio " + radio);
    }

    public void rotar() {
        System.out.println("Rotando el círculo");
    }
}

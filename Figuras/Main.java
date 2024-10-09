import Figuras.*;

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo("Rojo", 0, 0, 5);
        Rectangulo rectangulo = new Rectangulo("Azul", 0, 0, 4, 7);
        Triangulo triangulo = new Triangulo("Verde", 0, 0, 3, 6);


        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo);
    }
}
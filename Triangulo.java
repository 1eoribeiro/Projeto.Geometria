import java.util.Scanner;

public class CalculoTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o comprimento do primeiro lado do triângulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o comprimento do segundo lado do triângulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado do triângulo:");
        double lado3 = scanner.nextDouble();

        if (ehTriangulo(lado1, lado2, lado3)) {
            System.out.println("Os lados informados formam um triângulo.");
            calcularTipoTriangulo(lado1, lado2, lado3);
        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }

        scanner.close();
    }

    public static boolean ehTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    public static void calcularTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é equilátero.");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("O triângulo é isósceles.");
        } else {
            System.out.println("O triângulo é escaleno.");
        }
    }
}

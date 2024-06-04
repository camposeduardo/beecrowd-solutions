package bee1012;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String[] valores = scanner.nextLine().split(" ");
        double areaDoTriangulo = (Double.parseDouble(valores[0]) * Double.parseDouble(valores[2])) / 2 ;
        double areaDoCirculo = 3.14159 * Math.pow(Double.parseDouble(valores[2]), 2);
        double areaDoTrapezio= (Double.parseDouble(valores[0]) +  Double.parseDouble(valores[1])) *
                                Double.parseDouble(valores[2]) / 2;
        double areaDoQuadrado = Math.pow(Double.parseDouble(valores[1]), 2);
        double areaDoRetangulo = Double.parseDouble(valores[0]) * Double.parseDouble(valores[1]);

        System.out.printf("TRIANGULO: %.3f\n", areaDoTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);

        scanner.close();
    }
}

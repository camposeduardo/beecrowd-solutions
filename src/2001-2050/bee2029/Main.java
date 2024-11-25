package bee2029;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        while (scanner.hasNextDouble()) {
            double volume = scanner.nextDouble();

            if (!scanner.hasNextDouble()) {
                break;
            }

            double diametro = scanner.nextDouble();

            double raio = diametro / 2;

            double altura = volume / (3.14 * Math.pow(raio, 2));

            double area = (3.14 * Math.pow(raio, 2));

            System.out.println("ALTURA = " + df.format(altura));
            System.out.println("AREA = " + df.format(area));
        }

    }
}

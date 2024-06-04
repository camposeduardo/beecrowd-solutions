package bee1002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double PI = 3.14159;
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        double area = PI * Math.pow(raio, 2);
        System.out.printf("A=%.4f\n", (area) );
        scanner.close();
    }
}

package bee3146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double circunferencia = r * (3.14 * 2);
        System.out.printf("%.2f\n", circunferencia);
        scanner.close();
    }
}

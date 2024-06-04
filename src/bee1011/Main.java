package bee1011;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double FORMULA = (4.0/3) * 3.14159;
        int raio = scanner.nextInt();
        double volume = FORMULA * Math.pow(raio, 3);
        System.out.printf("VOLUME = %.3f\n", volume);
        scanner.close();
    }
}

package bee1017;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas = scanner.nextInt();
        int vm = scanner.nextInt();
        double gasolinaNecessaria = (double) (vm * horas) / 12;

        System.out.printf("%.3f\n", gasolinaNecessaria);
        scanner.close();
    }
}

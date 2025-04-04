package bee3170;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bolinhas = scanner.nextInt();
        int galhos = scanner.nextInt();

        int total = (galhos / 2) - bolinhas;
        if (total <= 0) {
            System.out.println("Amelia tem todas bolinhas!");
        } else {
            System.out.printf("Faltam %d bolinha(s)\n", total);
        }
        scanner.close();
    }
}

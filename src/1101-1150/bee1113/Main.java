package bee1113;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;
        while (!finish) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if (a == b) {
                finish = true;
            } else if (a > b) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
        scanner.close();
    }
}

package bee2146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int senha = scanner.nextInt();
            System.out.println(senha - 1);
        }

        scanner.close();
    }
}

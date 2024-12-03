package bee2483;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();

        String frase = "Feliz nat" + "a".repeat(i) + "l!";
        System.out.println(frase);

        scanner.close();
    }
}

package bee2581;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroDeTestes = scanner.nextInt();

        for (int i = 0; i < numeroDeTestes; i++) {
            String pergunta = scanner.next();
            System.out.println("I am Toorg!");
        }

        scanner.close();
    }
}

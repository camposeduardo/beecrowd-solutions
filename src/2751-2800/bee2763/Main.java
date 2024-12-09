package bee2763;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numeros = scanner.next().split("[.-]");
        for (String numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}

package bee1933;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();

        int maior = Math.max(carta1, carta2);

        System.out.println(maior);

        scanner.close();
    }
}

package bee1957;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        System.out.println(Integer.toHexString(numero).toUpperCase());

        scanner.close();
    }
}

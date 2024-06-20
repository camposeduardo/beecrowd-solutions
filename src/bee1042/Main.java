package bee1042;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] numeros = {a, b, c};

        Arrays.sort(numeros);
        for (int n : numeros) {
            System.out.println(n);
        }
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scanner.close();
    }
}

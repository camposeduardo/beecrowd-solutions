package bee1151;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        for (int i = 0; i < x ; i++) {
            if (i == x-1) {
                System.out.println(fibonacci(i));
            } else {
                System.out.print(fibonacci(i) + " ");
            }

        }

        scanner.close();
    }

    public static int fibonacci(int x) {
        return (x < 2) ? x : fibonacci(x - 1) + fibonacci(x - 2);
    }
}

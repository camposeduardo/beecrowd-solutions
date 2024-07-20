package bee1153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 1;

        int x = scanner.nextInt();

        for (int i = x; i >= 1 ; i--) {
            total *= i;
        }

        System.out.println(total);

        scanner.close();
    }
}

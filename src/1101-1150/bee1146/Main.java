package bee1146;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            StringBuilder numeros = new StringBuilder();

            for (int i = 1; i <= num ; i++) {
                numeros.append(i);
                if (i < num) {
                    numeros.append(" ");
                }
            }
            System.out.print(numeros);
            System.out.println();
        }
        scanner.close();
    }
}

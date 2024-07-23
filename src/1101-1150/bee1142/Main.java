package bee1142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas * 4 ; i+=4) {
            for (int j = i; j < i + 3 ; j++) {
                System.out.print(j + " ");
            }
            System.out.println("PUM");
        }

        scanner.close();
    }
}

package bee1070;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int valor = scanner.nextInt();
        int imparesConsecutivos = 0;

        while (imparesConsecutivos != 6) {
            if (valor % 2 != 0) {
                System.out.println(valor);
                imparesConsecutivos++;
            }
            valor++;
        }

        scanner.close();
    }
}

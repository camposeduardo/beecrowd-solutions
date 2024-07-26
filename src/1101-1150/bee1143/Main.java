package bee1143;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int linhas = scanner.nextInt();

        for (int i = 1; i <= linhas; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }

        scanner.close();
    }
}

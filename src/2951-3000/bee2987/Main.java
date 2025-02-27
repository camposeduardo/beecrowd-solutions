package bee2987;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra = scanner.next().charAt(0);
        int indexTabelaASCII = letra;
        System.out.println(indexTabelaASCII - 64);

        scanner.close();
    }
}

package bee1238;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < casos ; i++) {

            String linha = scanner.nextLine();
            String[] palavraCompleta = linha.split(" ");
            String palavra1 = palavraCompleta[0];
            String palavra2 = palavraCompleta[1];
            StringBuilder palavraFinal = new StringBuilder();

            if (palavra1.length() > palavra2.length()) {
                for (int j = 0; j < palavra2.length(); j++) {
                    palavraFinal.append(palavra1.charAt(j)).append(palavra2.charAt(j));
                }
                palavraFinal.append(palavra1.substring(palavra2.length()));
            }

            if (palavra1.length() == palavra2.length()) {
                for (int j = 0; j < palavra1.length() ; j++) {
                    palavraFinal.append(palavra1.charAt(j)).append(palavra2.charAt(j));
                }
            }

            if (palavra1.length() < palavra2.length()) {
                for (int j = 0; j < palavra1.length(); j++) {
                    palavraFinal.append(palavra1.charAt(j)).append(palavra2.charAt(j));
                }
                palavraFinal.append(palavra2.substring(palavra1.length()));
            }
            System.out.println(palavraFinal);
        }
        scanner.close();
    }
}

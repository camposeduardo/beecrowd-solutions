package bee1253;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < casos ; i++) {
            String palavra = scanner.next();
            int deslocamento = scanner.nextInt();
            StringBuilder palavraCodificada = new StringBuilder();

            for (char c : palavra.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    c -= deslocamento;
                    if (c < 'A') {
                        c += 26;
                    }
                }
                palavraCodificada.append(c);
            }

            System.out.println(palavraCodificada.toString());
        }

        scanner.close();
    }
}

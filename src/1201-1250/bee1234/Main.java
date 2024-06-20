package bee1234;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String palavra = scanner.nextLine();
            System.out.printf("%s\n", stringDancante(palavra));
        }
        scanner.close();
    }

    public static String stringDancante(String palavraParaDancar) {
        boolean maiuscula = true;
        StringBuilder palavraFinal = new StringBuilder();
        for (int i = 0; i < palavraParaDancar.length(); i++) {
            char ch = palavraParaDancar.charAt(i);
            if (Character.isLetter(ch)) {
                if (maiuscula) {
                    palavraFinal.append(Character.toUpperCase(ch));
                } else {
                    palavraFinal.append(Character.toLowerCase(ch));
                }
                maiuscula = !maiuscula;
            } else {
                palavraFinal.append(ch);
            }
        }
        return palavraFinal.toString();
    }
}

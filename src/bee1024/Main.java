package bee1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < casos; i++) {
            String palavra = scanner.nextLine();
            StringBuilder palavraModificada = new StringBuilder();

            for (char c: palavra.toCharArray()) {
                if (Character.isLetter(c)) {
                    c += 3;
                }
                palavraModificada.append(c);
            }

            char[] pmArray = palavraModificada.reverse().toString().toCharArray();

            for (int j = pmArray.length / 2; j < pmArray.length; j++) {
                pmArray[j] -= 1;
            }
            String novaPalavra = new String(pmArray);
            System.out.println(novaPalavra);

        }
        scanner.close();
    }

}

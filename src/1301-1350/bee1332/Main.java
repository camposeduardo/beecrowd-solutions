package bee1332;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < casos ; i++) {
            String palavra = scanner.nextLine();

            if (palavra.length() == 3) {
               if ((palavra.startsWith("o") || palavra.endsWith("e")) && (palavra.contains("o") || palavra.contains("n") ||
                       palavra.contains("e"))) {
                   System.out.println(1);
               }
               if ((palavra.startsWith("t") || palavra.endsWith("o")) && (palavra.contains("t") || palavra.contains("w") ||
                        palavra.contains("o"))) {
                    System.out.println(2);
               }
            } else {
                System.out.println(3);
            }
        }
        scanner.close();
    }
}

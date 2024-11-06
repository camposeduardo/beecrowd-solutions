package bee1397;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        while (!finish) {
            int casos = scanner.nextInt();
            int pontuacaoA = 0;
            int pontuacaoB = 0;

            if (casos != 0) {
                for (int i = 0; i < casos ; i++) {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();

                    if (a > b) {
                        pontuacaoA++;
                    }

                    if (a < b) {
                        pontuacaoB++;
                    }
                }

                System.out.println(pontuacaoA + " " + pontuacaoB);
            } else {
                finish = true;
            }


        }

        scanner.close();
    }
}

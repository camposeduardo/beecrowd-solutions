package bee2717;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoRestante = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();

        if (t1 + t2 > tempoRestante) {
            System.out.println("Deixa para amanha!");
        } else {
            System.out.println("Farei hoje!");
        }
        scanner.close();
    }
}

package bee2375;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diametro = scanner.nextInt();
        int altura = scanner.nextInt();
        int largura = scanner.nextInt();
        int profundidade = scanner.nextInt();

        if (diametro <= largura && diametro <= altura && diametro <= profundidade) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        scanner.close();
    }
}

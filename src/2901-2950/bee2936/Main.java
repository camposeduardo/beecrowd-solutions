package bee2936;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] quantidadeEmGramas = {300, 1500, 600, 1000, 150};
        int total = 0;

        for (int i = 0; i < 5 ; i++) {
            int unidade = scanner.nextInt();
            total += quantidadeEmGramas[i] * unidade;
        }

        total += 225;
        System.out.println(total);

        scanner.close();
    }
}

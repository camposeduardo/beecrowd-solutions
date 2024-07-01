package bee1080;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> valores = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            int valor = scanner.nextInt();
            valores.add(valor);
        }
        int valorMaximo = Collections.max(valores);
        System.out.println(valorMaximo);
        System.out.println(valores.indexOf(valorMaximo) + 1);

        scanner.close();
    }
}

package bee1259;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();
        List<Integer> valoresImpares = new ArrayList<>();
        List<Integer> valoresPares = new ArrayList<>();

        for (int i = 0; i < casos ; i++) {
            int caso = scanner.nextInt();

            if (caso % 2 == 0) {
                valoresPares.add(caso);
            } else {
                valoresImpares.add(caso);
            }
        }

        Collections.sort(valoresPares);
        valoresImpares.sort(Collections.reverseOrder());

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(valoresPares);
        finalList.addAll(valoresImpares);

        finalList.forEach(System.out::println);

        scanner.close();
    }
}

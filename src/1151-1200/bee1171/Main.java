package bee1171;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();

        SortedMap<Integer, Integer> valores = new TreeMap<>();

        for (int i = 0; i < casos ; i++) {
            int num = scanner.nextInt();

            if (!valores.containsKey(num)) {
                valores.put(num, 1);
            } else {
                Integer valor = valores.get(num);
                valores.put(num, (valor + 1));
            }
        }

        valores.forEach((chave, valor) -> {
            System.out.println(chave + " aparece " + valor + " vez(es)");
        });
        scanner.close();
    }
}

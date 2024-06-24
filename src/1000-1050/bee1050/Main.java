package bee1050;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> ddd =  Map.of(
                61, "Brasilia",
                71, "Salvador",
                11, "Sao Paulo",
                21, "Rio de Janeiro",
                32, "Juiz de Fora",
                19, "Campinas",
                27, "Vitoria",
                31, "Belo Horizonte"
        );

        int estado =  scanner.nextInt();

        if (ddd.containsKey(estado)) {
            System.out.println(ddd.get(estado));
        } else {
            System.out.println("DDD nao cadastrado");
        }
        scanner.close();
    }
}

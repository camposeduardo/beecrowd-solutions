package bee1045;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> lados = new ArrayList<>();

        for (int i = 0; i < 3 ; i++) {
            lados.add(scanner.nextDouble());
        }

        lados.sort(Collections.reverseOrder());

        if (lados.get(0) >= lados.get(1) + lados.get(2)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (Math.pow(lados.get(0),2) == Math.pow(lados.get(1),2) + Math.pow(lados.get(2),2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (Math.pow(lados.get(0),2) > Math.pow(lados.get(1),2) + Math.pow(lados.get(2),2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (Math.pow(lados.get(0),2) < Math.pow(lados.get(1),2) + Math.pow(lados.get(2),2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (Objects.equals(lados.get(0), lados.get(1)) && Objects.equals(lados.get(1), lados.get(2))) {
                System.out.println("TRIANGULO EQUILATERO");
            }
            if ((Objects.equals(lados.get(0), lados.get(1)) && !Objects.equals(lados.get(1), lados.get(2)))
            || (Objects.equals(lados.get(1), lados.get(2)) && !Objects.equals(lados.get(2), lados.get(0)))
            || (Objects.equals(lados.get(0), lados.get(2)) & !Objects.equals(lados.get(0), lados.get(1)))) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}

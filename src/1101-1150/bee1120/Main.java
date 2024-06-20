package bee1120;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String digitoFalho = scanner.next();
            String numeroDoContrato = scanner.next();
            if (!digitoFalho.equals("0") && !numeroDoContrato.equals("0")) {
                String numeroDoContratoCorrigido = numeroDoContrato.replace(digitoFalho,
                        "");
                if ("0".repeat(numeroDoContratoCorrigido.length()).equals(numeroDoContratoCorrigido)) {
                    System.out.println(0);
                } else {
                    System.out.println(numeroDoContratoCorrigido.replaceFirst("^0+(?!$)", ""));
                }
            } else {
                break;

            }
            scanner.close();
        }
    }
}

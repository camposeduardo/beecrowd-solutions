package bee1114;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean finish = false;

        while (!finish) {
            int valor = scanner.nextInt();

            if (valor == 2002) {
                System.out.println("Acesso Permitido");
                finish = true;
            } else {
                System.out.println("Senha Invalida");
            }
        }

        scanner.close();
    }
}

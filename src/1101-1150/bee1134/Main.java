package bee1134;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        boolean finish = false;

        while (!finish) {
            int codigo = scanner.nextInt();
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else if (codigo == 4) {
                finish = true;
                System.out.println("MUITO OBRIGADO");
            }
        }

        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        scanner.close();
    }
}

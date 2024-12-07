package bee2708;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalJipes = 0;
        int totalTuristas = 0;

        while (true) {
            String x = scanner.next();
            if (x.equals("ABEND")) {
                break;
            }
            int turistas = scanner.nextInt();

            if (x.equals("SALIDA")) {
                totalJipes++;
                totalTuristas += turistas;
            } else {
                totalJipes--;
                totalTuristas -= turistas;
            }
        }
        System.out.println(totalTuristas);
        System.out.println(totalJipes);

        scanner.close();
    }
}

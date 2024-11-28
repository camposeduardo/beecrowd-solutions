package bee2152;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeDeTestes = scanner.nextInt();

        DecimalFormat df = new DecimalFormat("00");

        for (int i = 0; i < quantidadeDeTestes; i++) {
            int hora = scanner.nextInt();
            int minuto = scanner.nextInt();
            int codigo = scanner.nextInt();

            StringBuilder horario = new StringBuilder(df.format(hora) + ":" + df.format(minuto) + " - A porta ");

            if (codigo == 1) {
                horario.append("abriu!");
            } else {
                horario.append("fechou!");
            }
            System.out.println(horario.toString());
        }

        scanner.close();
    }
}

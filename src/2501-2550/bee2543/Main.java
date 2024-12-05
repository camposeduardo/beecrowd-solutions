package bee2543;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int numeroDeGameplays = scanner.nextInt();
            int identificador = scanner.nextInt();

            int gameplaysCS = 0;

            for (int i = 0; i < numeroDeGameplays; i++) {
                int identificadorTemp = scanner.nextInt();
                int gameplay = scanner.nextInt();

                if (identificador == identificadorTemp && gameplay == 0) {
                    gameplaysCS++;
                }
            }
            System.out.println(gameplaysCS);
        }


        scanner.close();
    }
}

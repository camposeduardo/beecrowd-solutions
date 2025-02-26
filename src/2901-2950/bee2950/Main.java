package bee2950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distanciaPalantir = scanner.nextInt();
        int diametroPalantirSauron = scanner.nextInt();
        int diametroPalantirSaruman = scanner.nextInt();

        double icm = (double) distanciaPalantir / (diametroPalantirSaruman + diametroPalantirSauron);
        System.out.printf("%.2f\n",icm);

        scanner.close();
    }
}

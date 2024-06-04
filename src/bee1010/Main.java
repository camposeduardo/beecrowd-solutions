package bee1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String[] x = scanner.nextLine().split(" ");
        String[] y = scanner.nextLine().split(" ");
        
        double totalAPagar = (Integer.parseInt(x[1]) * Double.parseDouble(x[2])) +
                (Integer.parseInt(y[1]) * Double.parseDouble(y[2]));
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalAPagar);

        scanner.close();
    }
}

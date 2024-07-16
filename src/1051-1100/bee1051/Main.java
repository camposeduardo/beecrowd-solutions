package bee1051;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        double imposto = 0;

        if (salary < 2000) {
            System.out.println("Isento");
        } else {
            if (salary < 3000) {
                imposto = (salary - 2000) * 8 / 100;
            } else if (salary < 4500) {
                imposto = 80 + (salary - 3000) * 18 / 100;
            } else  {
                imposto = 80 + 270 + (salary - 4500) * 28 / 100;
            }
            System.out.printf("R$ %.2f\n", (imposto));
        }


        scanner.close();
    }
}

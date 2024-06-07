package bee1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int horas = valor / 3600;
        int minutos = (valor - (horas * 3600))  / 60;
        int segundos = valor % 60;

        System.out.println((horas) + ":" + (minutos) + ":" + (segundos));
        scanner.close();
    }
}

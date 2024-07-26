package bee1018;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();

        int cem = (valor / 100);
        int cinquenta = (valor % 100);
        int vinte = (cinquenta % 50);
        int dez = (vinte % 20);
        int cinco = (dez % 10);
        int dois = (cinco % 5);
        int um = (dois % 2);

        System.out.println(valor);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta / 50 + " nota(s) de R$ 50,00");
        System.out.println(vinte / 20 + " nota(s) de R$ 20,00");
        System.out.println(dez / 10 + " nota(s) de R$ 10,00");
        System.out.println(cinco / 5 + " nota(s) de R$ 5,00");
        System.out.println(dois / 2 + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");

        scanner.close();
    }
}

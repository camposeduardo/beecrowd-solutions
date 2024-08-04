package bee1021;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        int cem = (int) (valor /  100);
        valor = valor % 100;
        int cinquenta = (int) (valor / 50);
        valor = valor % 50;
        int vinte = (int) (valor / 20);
        valor = valor % 20;
        int dez = (int) (valor / 10);
        valor = valor % 10;
        int cinco = (int) (valor / 5);
        valor = valor % 5;
        int dois = (int) (valor / 2);
        valor = valor % 2;
        int umReal = (int) valor;
        valor = valor % 1;

        int centavos = (int) Math.round(valor * 100);

        int cinquentaCentavos = centavos / 50;
        centavos = centavos % 50;
        int vinteCincoCentavos = centavos / 25;
        centavos = centavos % 25;
        int dezCentavos = centavos / 10;
        centavos = centavos % 10;
        int cincoCentavos = centavos / 5;
        centavos = centavos % 5;
        int umCentavo = centavos;

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println( cinquenta + " nota(s) de R$ 50.00");
        System.out.println( vinte + " nota(s) de R$ 20.00");
        System.out.println( dez + " nota(s) de R$ 10.00") ;
        System.out.println( cinco + " nota(s) de R$ 5.00");
        System.out.println( dois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println( umReal + " moeda(s) de R$ 1.00");
        System.out.println( cinquentaCentavos + " moeda(s) de R$ 0.50");
        System.out.println( vinteCincoCentavos + " moeda(s) de R$ 0.25");
        System.out.println( dezCentavos + " moeda(s) de R$ 0.10");
        System.out.println( cincoCentavos + " moeda(s) de R$ 0.05");
        System.out.println( umCentavo + " moeda(s) de R$ 0.01");

        scanner.close();
    }
}
;
package bee1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorEmDias = scanner.nextInt();
        int ano = valorEmDias / 365;
        int mes = (valorEmDias - (ano * 365)) / 30;
        int dias = valorEmDias - (ano * 365) - (mes * 30);

        System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n" + dias + " dia(s)");

        scanner.close();
    }
}

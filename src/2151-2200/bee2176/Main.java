package bee2176;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mensagem = scanner.nextLine();
        int contadorDeUm = 0;

        for (int i = 0; i < mensagem.length() ; i++) {
            char letra = mensagem.charAt(i);
            if (letra == '1') {
                contadorDeUm++;
            }
        }

        if (contadorDeUm % 2 == 0) {
            mensagem += "0";
        } else {
            mensagem += "1";
        }

        System.out.println(mensagem);
    }
}

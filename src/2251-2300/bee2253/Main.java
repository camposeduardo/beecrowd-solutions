package bee2253;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String palavra = scanner.nextLine();
            System.out.println(validarSenha(palavra));
        }
        scanner.close();
    }

    public static String validarSenha(String senha) {
        if (senha.length() < 6 || senha.length() > 32) {
            return "Senha invalida.";
        }

        boolean maiuscula = false;
        boolean minuscula = false;
        boolean numero = false;
        boolean caractereInvalido = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                maiuscula = true;
            } else if (Character.isLowerCase(c)) {
                minuscula = true;
            } else if (Character.isDigit(c)) {
                numero = true;
            } else {
                caractereInvalido = true;
                break;
            }
        }

        if (maiuscula && minuscula && numero && !caractereInvalido) {
            return "Senha valida.";
        } else {
            return "Senha invalida.";
        }
    }
}


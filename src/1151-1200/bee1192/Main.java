package bee1192;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int casos = scanner.nextInt();
        for (int i = 0; i < casos ; i++) {
            String x = scanner.next();
            
            int n1 = Integer.parseInt(String.valueOf(x.charAt(0)));
            char letra = x.charAt(1);
            int n2 = Integer.parseInt(String.valueOf(x.charAt(2)));
            
            int result = 0;

            if (n1 == n2) {
                result = n1 * n2;
            } else if (Character.isLowerCase(letra)) {
                result = n1 + n2;
            } else if (Character.isUpperCase(letra)) {
                result = n2 - n1;
            }

            System.out.println(result);
        }


        scanner.close();
    }
}

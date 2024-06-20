package bee1168;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int casos = scanner.nextInt();

        for (int i = 0; i < casos; i++) {
            String numeros = scanner.next();
            String[] ledsString = numeros.split("");
            int[] leds = new int[ledsString.length];
            int totalDeLeds = 0;
            for (int j = 0; j < ledsString.length; j++) {
                leds[j] = Integer.parseInt(ledsString[j]);
                if (leds[j] == 2 || leds[j] == 3) {
                    totalDeLeds += 5;
                }
                if (leds[j] == 6 || leds[j] == 0 || leds[j] == 9) {
                    totalDeLeds += 6;
                }

                if (leds[j] == 4 || leds[j] == 5) {
                    totalDeLeds += leds[j];
                }

                if (leds[j] == 1) {
                    totalDeLeds += 2;
                }

                if (leds[j] == 7) {
                    totalDeLeds += 3;
                }

                if (leds[j] == 8) {
                    totalDeLeds += 7;
                }
            }
            System.out.println(totalDeLeds + " leds");
        }
        scanner.close();
    }
}


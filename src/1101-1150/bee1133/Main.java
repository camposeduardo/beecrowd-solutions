package bee1133;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        
        int min = Math.min(x,y);
        int max = Math.max(x, y);

        for (int i = min + 1; i < max ; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

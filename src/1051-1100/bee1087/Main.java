package bee1087;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean finish = false;

        while (!finish) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            if (x1 == 0 && x2 == 0 && y1 == 0 && y2 == 0) {
                finish = true;
            } else if (x1 == x2 && y1 == y2) {
                System.out.println(0);
            } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2) || (x1 + y1 == x2 + y2) || x1 == x2 || y1 == y2){
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        scanner.close();
    }
}

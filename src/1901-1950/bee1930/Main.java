package bee1930;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        int t4 = scanner.nextInt();

        int totalDeAparelhos = (t1 + t2 + t3) - 3 + t4;
        System.out.println(totalDeAparelhos);

        scanner.close();
    }
}

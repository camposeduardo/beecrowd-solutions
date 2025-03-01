package bee3055;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();
        int media = scanner.nextByte();

        int b = (media * 2) - a;
        System.out.println(b);

        scanner.close();
    }
}

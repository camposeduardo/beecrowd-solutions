package bee3046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = ((n+1)*(n+2))/2;
        System.out.println(result);
        scanner.close();
    }
}

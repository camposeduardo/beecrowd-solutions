package bee1329;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            int casos = scanner.nextInt();

            if (casos == 0) {
                break;
            }

            Map<String, Integer> map = new HashMap<>();
            map.put("Mary", 0);
            map.put("John", 0);

            for (int i = 0; i < casos; i++) {
                int num = scanner.nextInt();

                if (num == 0) {
                    map.put("Mary", map.get("Mary") + 1);
                } else {
                    map.put("John", map.get("John") + 1);
                }
            }

            System.out.println("Mary won " + map.get("Mary") + " times and John won " + map.get("John") + " times");
        }

        scanner.close();


    }
}

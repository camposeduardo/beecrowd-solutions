package bee1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = reader.readLine()) != null) {
            String[] inputs = line.split(" ");
            long a = Long.parseLong(inputs[0]);
            long b = Long.parseLong(inputs[1]);
            System.out.println(a ^ b);
        }

        reader.close();
    }
}

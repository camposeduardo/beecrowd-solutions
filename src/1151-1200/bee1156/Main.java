package bee1156;

public class Main {
    public static void main(String[] args) {
        double s = 1;
        int divisor = 2;

        for (int i = 3; i <= 39 ; i+=2) {
            s += (double) i / divisor;
            divisor *= 2;
        }
        System.out.printf("%.2f\n", s);
    }
}

package bee1098;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 2 ; i++) {
            System.out.println("I=" + i + " J=" + (i + 1));
            System.out.println("I=" + i + " J=" + (i + 2));
            System.out.println("I=" + i +  " J=" + (i + 3));
            if (i != 2) {
                for (double j = i + 0.2; j <= i + 0.8 ; j+=0.2) {
                    System.out.printf("I=%.1f J=%.1f\n", j, (j+1));
                    System.out.printf("I=%.1f J=%.1f\n", j, (j+2));
                    System.out.printf("I=%.1f J=%.1f\n", j, (j+3));
                }
            }
        }

    }
}

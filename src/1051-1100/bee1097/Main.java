package bee1097;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i+=2) {
            for (int j = 6 + i; j >= 4 + i; j--) {
                System.out.println("I="+ i + " J=" + j);
            }
        }
    }
}

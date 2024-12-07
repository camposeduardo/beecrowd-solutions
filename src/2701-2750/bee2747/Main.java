package bee2747;

public class Main {
    public static void main(String[] args) {

        StringBuilder n = new StringBuilder();

        for (int i = 0; i < 7 ; i++) {
            for (int j = 0; j < 39; j++) {
                if (i == 0 || i == 6) {
                    n.append("-");
                } else {
                    if (j == 0 || j == 38) {
                        n.append("|");
                    } else {
                        n.append(" ");
                    }
                }
            }
            n.append("\n");
        }
        System.out.print(n.toString());
    }
}

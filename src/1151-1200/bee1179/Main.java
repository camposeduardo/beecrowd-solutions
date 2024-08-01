package bee1179;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetorPar = new int[5];
        int[] vetorImpar = new int[5];

        int contadorVetorPar = 0;
        int contadorVetorImpar = 0;

        for (int i = 0; i < 15 ; i++) {

            int num = scanner.nextInt();

            if (contadorVetorPar == 5) {
                mostrarVetor(vetorPar, "par");
                contadorVetorPar = 0;
                vetorPar = esvaziaVetor();
            }

            if (contadorVetorImpar == 5) {
                mostrarVetor(vetorImpar, "impar");
                contadorVetorImpar = 0;
                vetorImpar = esvaziaVetor();
            }


            if (num % 2 == 0) {
                vetorPar[contadorVetorPar] = num;
                contadorVetorPar++;
            } else {
                vetorImpar[contadorVetorImpar] = num;
                contadorVetorImpar++;
            }
        }
        mostrarVetor(vetorImpar, "impar");
        mostrarVetor(vetorPar, "par");
        scanner.close();
    }


    public static int[] esvaziaVetor() {
        return new int[5];
    }

    public static void mostrarVetor(int[] vetor, String tipo) {
        for (int i = 0; i < 5 ; i++) {
            if (vetor[i] == 0) {
                break;
            }
            System.out.println(tipo + "[" + i + "] = " + vetor[i]);
        }
    }
}

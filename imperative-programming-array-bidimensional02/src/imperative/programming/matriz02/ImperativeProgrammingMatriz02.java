package imperative.programming.matriz02;

import java.util.Scanner;

public class ImperativeProgrammingMatriz02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrizM = new int[2][2];
        int[][] matrizR = new int[2][2];
        int maior = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                matrizM[i][j] = input.nextInt();
                if (maior < matrizM[i][j]) {
                    maior = matrizM[i][j];
                }
            }

        }

        for (int i = 0; i < matrizR.length; i++) {
            for (int j = 0; j < matrizR[i].length; j++) {
                matrizR[i][j] = maior * matrizM[i][j];
            }
        }
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM[i].length; j++) {
                System.out.println(matrizR[i][j]);
            }
        }
    }

}

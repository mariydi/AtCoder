package Beginner_Contest.ABC370;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int A[][] = new int[N][N];
        for (int a = 0; a < N; a++) {
            for (int b = 0; b <= a; b++) {
                A[a][b] = InputBasicLine.IntValue(scn);
            }
        }
        int gensoA = 1;
        for (int i = 1; i <= N; i++) {
            if (gensoA >= i) {
                gensoA = A[gensoA - 1][i - 1];
            } else {
                gensoA = A[i - 1][gensoA - 1];
            }
        }
        System.out.println(gensoA);
    }
}


class InputBasicLine {

    static int IntValue(Scanner Scanner) {
        return Scanner.nextInt();
    }

    static String StringValue(Scanner Scanner) {
        return Scanner.next();
    }
}

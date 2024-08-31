package Beginner_Contest.ABC369;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int A[] = new int[N];
        String S[] = new String[N];
        for (int a = 0; a < N; a++) {
            A[a] = InputBasicLine.IntValue(scn);
            S[a] = InputBasicLine.StringValue(scn);
        }
        int L = 0;
        int R = 0;
        int[] tmp = new int[] {0, 0}; // L,R
        for (int i = 0; i < N; i++) {
            if (S[i].equals("L")) {
                if (tmp[0] != 0) {
                    L += Math.abs(tmp[0] - A[i]);
                }
                tmp[0] = A[i];

            } else {
                if (tmp[1] != 0) {
                    R += Math.abs(tmp[1] - A[i]);
                }
                tmp[1] = A[i];
            }
        }
        System.out.println((L + R));
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

package Beginner_Contest.ABC367;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int M = InputBasicLine.IntValue(scn);
        int A[] = new int[N * 2];
        for (int a = 0; a < N; a++) {
            A[a] = InputBasicLine.IntValue(scn);
            A[a + N] = A[a];
        }
        int total = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j - i < N; j++) {
                if (i != j) {
                    total += A[j];
                    // System.out.println(j + ":" + A[j]);
                    if (total % M == 0) {
                        // System.out.println(total);
                        ans++;
                    }
                }
            }
            total = 0;
        }
        System.out.println(ans);
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

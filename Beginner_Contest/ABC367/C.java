package Beginner_Contest.ABC367;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int K = InputBasicLine.IntValue(scn);
        int R[] = new int[N];
        for (int a = 0; a < N; a++) {
            R[a] = InputBasicLine.IntValue(scn);
        }
        int A[] = new int[N];
        for (int a = 0; a < N; a++) {
            A[a] = 1;
        }
        if (totalA(A) % K == 0) {
            print(A);
        }
        while (totalA(R) > totalA(A)) {

            A[A.length - 1]++;
            for (int i = A.length - 1; i > 0; i--) {
                if (R[i] < A[i]) {
                    A[i] = 1;
                    A[i - 1]++;
                }
            }
            if (totalA(A) % K == 0) {
                print(A);
            }
        }
    }

    private static int totalA(int[] a) {
        int ans = 0;
        for (int b : a) {
            ans += b;
        }

        return ans;
    }

    private static void print(int[] A) {
        String ansSentence = "";
        for (int a : A) {
            ansSentence += Integer.valueOf(a).toString() + " ";
        }
        System.out.println(ansSentence);
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

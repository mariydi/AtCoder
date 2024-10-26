package Beginner_Contest.ABC377;

import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int M = InputBasicLine.IntValue(scn);

        int a[] = new int[M];
        int b[] = new int[M];
        long cnt = N * N;
        StringBuilder corrector[] = new StringBuilder[(N+1) * (N+1)];
        for (int i = 0; i < M; i++) {
            a[i] = InputBasicLine.IntValue(scn);
            b[i] = InputBasicLine.IntValue(scn);
        }
        for (int j = 0; j < M; j++) {
            if(Arrays.asList(a).contains(a[j]+3))
        }
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

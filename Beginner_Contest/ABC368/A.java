package Beginner_Contest.ABC368;

import java.util.Arrays;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn); // 叫ぶ時間
        int K = InputBasicLine.IntValue(scn); // 寝る時間
        int A[] = new int[N];
        for (int a = 0; a < N; a++) {
            A[a] = InputBasicLine.IntValue(scn);
        }
        StringBuffer ans = new StringBuffer();
        for (int i = N - K; i < N; i++) {
            ans.append(A[i] + " ");
        }
        for (int i = 0; i < N - K; i++) {
            ans.append(A[i] + " ");
        }
        System.out.println(ans.toString());
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

package Beginner_Contest.ABC369;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int A[] = new int[N];
        for (int a = 0; a < N; a++) {
            A[a] = InputBasicLine.IntValue(scn);
        }
        long ans = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if ((cnt + 1) % 2 == 0 && i < N - 1) {
                if (2 * A[i] < A[i + 1]) {
                    continue;
                }
                ans += 2 * A[i];
            } else if ((cnt + 1) % 2 == 0) {
                ans += 2 * A[i];
            } else {
                ans += A[i];
            }
            cnt++;
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

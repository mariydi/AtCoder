package Beginner_Contest.ABC369;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int A[] = new int[N];
        for (int a = 0; a < N; a++) {
            A[a] = InputBasicLine.IntValue(scn);
        }
        int saA[] = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            saA[i] = A[i] - A[i + 1];
        }
        int ans = 1;
        int cnt = 2;
        for (int i = 0; i < N - 2; i++) {
            if (saA[i] == saA[i + 1]) {
                ans += cnt;
                cnt++;
            } else {
                ans++;
                cnt = 2;
            }
        }
        ans += N;
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

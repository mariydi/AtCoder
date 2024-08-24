package Beginner_Contest.ABC368;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int A[] = new int[N];
        for (int a = 0; a < N; a++) {
            A[a] = InputBasicLine.IntValue(scn);
        }
        int ans = 0;
        while (true) {
            Arrays.sort(A);
            for (int f = 0, l = A.length - 1; f < l; f++, l--) {
                int temp = A[f];
                A[f] = A[l];
                A[l] = temp;
            }
            // System.out.println(Arrays.toString(A));
            // decriment
            A[0]--;
            A[1]--;
            // check
            int cnt = 0;
            for (int a : A) {
                if (a > 0) {
                    cnt++;
                }
            }
            ans++;
            if (cnt < 2) {
                System.out.println(ans);
                break;
            }

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

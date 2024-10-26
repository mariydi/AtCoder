package Beginner_Contest.ABC376;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int C = InputBasicLine.IntValue(scn);
        int T[] = new int[N];//InputBasicLine.IntValue(scn);
        int cntSec = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            T[i] = InputBasicLine.IntValue(scn);
            if ( T[i] - cntSec >=0) {
                cntSec = C + T[i];
                ans++;
            }
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

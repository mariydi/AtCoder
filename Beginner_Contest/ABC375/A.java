package Beginner_Contest.ABC375;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        StringBuilder S = new StringBuilder(InputBasicLine.StringValue(scn));
        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            if (S.charAt(i) == '#' && S.charAt(i+1)=='.' && S.charAt(i+2)=='#') {
                cnt++;
            }
        }
        System.out.println(cnt);

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

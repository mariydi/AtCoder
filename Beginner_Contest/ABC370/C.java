package Beginner_Contest.ABC370;

import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder S = new StringBuilder();
        S.append(InputBasicLine.StringValue(scn));
        StringBuilder T = new StringBuilder();
        T.append(InputBasicLine.StringValue(scn));

        int wrongCnt = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != T.charAt(i)) {
                wrongCnt++;
            }
        }
        System.out.println(wrongCnt);

        for (int i = 0; i < S.length(); i++) {
            if ((int) S.charAt(i) > (int) T.charAt(i)) {
                S.setCharAt(i, T.charAt(i));
                System.out.println(S);
            }
        }
        for (int i = S.length() - 1; i >= 0; i--) {
            if ((int) S.charAt(i) < (int) T.charAt(i)) {
                S.setCharAt(i, T.charAt(i));
                System.out.println(S);
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

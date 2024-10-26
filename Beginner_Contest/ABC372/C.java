package Beginner_Contest.ABC372;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int Q = InputBasicLine.IntValue(scn);
        StringBuilder S = new StringBuilder();
        S.append(InputBasicLine.StringValue(scn));
        int X[] = new int[Q];
        String C[] = new String[Q];
        String ABC = "ABC";
        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.indexOf(ABC, i) != -1) {
                cnt++;
                i += 3;
            }
        }
        String tmp = "";

        for (int i = 0; i < Q; i++) {
            X[i] = InputBasicLine.IntValue(scn);
            C[i] = InputBasicLine.StringValue(scn);
            tmp = ".." + S.toString() + "..";
            for (int j = 0; j < 3; j++) {
                cnt -= tmp.substring(X[i] - 1 + j, X[i] - 1 + 3 + j).equals(ABC) ? 1 : 0;
            }
            S.setCharAt(X[i] - 1, C[i].toCharArray()[0]);
            tmp = ".." + S.toString() + "..";
            for (int j = 0; j < 3; j++) {
                cnt += tmp.substring(X[i] - 1 + j, X[i] - 1 + 3 + j).equals(ABC) ? 1 : 0;
            }
            System.out.println(cnt);
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

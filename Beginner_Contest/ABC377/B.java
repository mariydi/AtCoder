package Beginner_Contest.ABC377;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S[] = new String[8];
        for (int i = 0; i < 8; i++) {
            S[i] = InputBasicLine.StringValue(scn);
        }
        int cnt = 8;
        int row[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < 8; i++) {
            if (S[i].indexOf('#') > -1) {
                cnt--;
                if (S[i].indexOf('#') == S[i].lastIndexOf('#')) {
                    row[S[i].indexOf('#')] = 0;
                } else {
                    for (int j = 0; j < 8; j++) {
                        if (S[i].indexOf('#', j) > -1) {
                            row[S[i].indexOf('#', j)] = 0;
                            j = S[i].indexOf('#', j);
                        }
                    }
                }
                continue;
            }
        }
        int rowA = 0;
        for (int i = 0; i < row.length; i++) {
            if (row[i] != 0) {
                rowA++;
            }
        }
        System.out.println(cnt*rowA);
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

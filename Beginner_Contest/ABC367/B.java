package Beginner_Contest.ABC367;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String X = InputBasicLine.StringValue(scn);
        boolean zeroFlag = false;

        while (true) {
            if (X.charAt(X.length() - 1) == '0') {
                X = X.substring(0, X.length() - 1);
            } else {
                zeroFlag = true;
                if (X.charAt(X.length() - 1) == '.') {
                    X = X.substring(0, X.length() - 1);
                }
            }
            if (zeroFlag) {
                break;
            }
        }
        System.out.println(X);
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

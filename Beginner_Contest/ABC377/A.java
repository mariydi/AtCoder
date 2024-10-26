package Beginner_Contest.ABC377;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = InputBasicLine.StringValue(scn);
        if (S.indexOf('A') != -1) {
            if (S.indexOf('B') != -1) {
                if (S.indexOf('C') != -1) {
                    System.out.println("Yes");
                    System.exit(0);
                }
            }
        }
        System.out.println("No");
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

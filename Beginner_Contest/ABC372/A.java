package Beginner_Contest.ABC372;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = InputBasicLine.StringValue(scn);
        System.out.println(S.replace(".", ""));
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

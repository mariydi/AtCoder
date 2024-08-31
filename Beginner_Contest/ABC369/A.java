package Beginner_Contest.ABC369;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = InputBasicLine.IntValue(scn);
        int B = InputBasicLine.IntValue(scn);
        if (A == B) {
            System.out.println(1);
        } else if ((A - B) % 2 == 0) {
            System.out.println(3);
        } else {
            System.out.println(2);
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

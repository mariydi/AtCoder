package Beginner_Contest.ABC370;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int L = InputBasicLine.IntValue(scn);
        int R = InputBasicLine.IntValue(scn);
        if (L == 1 && R == 0) {
            System.out.println("Yes");
        } else if (L == 0 && R == 1) {
            System.out.println("No");
        } else {
            System.out.println("Invalid");
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

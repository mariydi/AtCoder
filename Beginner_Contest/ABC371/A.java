package Beginner_Contest.ABC371;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String SAB = InputBasicLine.StringValue(scn);
        String SAC = InputBasicLine.StringValue(scn);
        String SBC = InputBasicLine.StringValue(scn);

        if (SAB == SAC && SAC == SBC) {
            System.out.println("B");
            System.exit(0);
        }
        if (SAB.equals("<")) { // A < B
            if (SAC.equals("<")) { // A < C
                if (SBC.equals("<")) { // B < C
                    System.out.println("B");
                } else {
                    System.out.println("C");
                }
            } else { // C < A
                System.out.println("A");
            }
        } else { // B < A
            if (SAC.equals("<")) { // A < C
                System.out.println("A");
            } else { // C < A
                if (SBC.equals("<")) { // B < C
                    System.out.println("C");
                } else {
                    System.out.println("B");
                }
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

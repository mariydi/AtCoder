package Beginner_Contest.ABC095;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = InputBasicLine.IntValue(scn);
        int B = InputBasicLine.IntValue(scn);
        int C = InputBasicLine.IntValue(scn);
        int X = InputBasicLine.IntValue(scn);
        int Y = InputBasicLine.IntValue(scn);
        int ans = 0;

        if (A + B < 2 * C) {
            if (X > Y) { // Aピザ、Bピザを個別で買う
                ans = A * Y + B * Y;
                if (A > 2 * C) {
                    ans = ans + 2 * C * Math.abs(X - Y);
                } else {
                    ans = ans + A * Math.abs(X - Y);
                }
            } else {
                ans = A * X + B * X;
                if (B > 2 * C) {
                    ans = ans + 2 * C * Math.abs(X - Y);
                } else {
                    ans = ans + B * Math.abs(X - Y);
                }
            }
        } else { // ABピザ爆買い
            if (X > Y) {
                ans = 2 * C * Y;
                if (A > 2 * C) {
                    ans = ans + 2 * C * Math.abs(X - Y);
                } else {
                    ans = ans + A * Math.abs(X - Y);
                }
            } else {
                ans = 2 * C * X;
                if (B > 2 * C) {
                    ans = ans + 2 * C * Math.abs(X - Y);
                } else {
                    ans = ans + B * Math.abs(X - Y);
                }
            }
        }
        System.out.println(ans);

    }
}


class InputBasicLine {
    static int IntValue(Scanner Scanner) {
        return Scanner.nextInt();
    }
}

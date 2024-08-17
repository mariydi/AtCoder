package Beginner_Contest.ABC367;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = InputBasicLine.IntValue(scn); // 叫ぶ時間
        int B = InputBasicLine.IntValue(scn); // 寝る時間
        int C = InputBasicLine.IntValue(scn); // 起きる時間
        boolean canShout;
        if (B < C) {
            // 就寝時間 B が起床時間 C より早い（例えば B = 22, C = 7 の場合）
            canShout = (A >= C) || (A < B);
        } else {
            // 就寝時間 B が起床時間 C より遅い（例えば B = 22, C = 5 の場合）
            canShout = (A >= C) && (A < B);
        }

        // 結果を出力
        if (canShout) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
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

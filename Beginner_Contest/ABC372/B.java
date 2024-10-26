package Beginner_Contest.ABC372;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M = InputBasicLine.IntValue(scn);
        int A[] = new int[11];
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) Math.pow(3, i);
        }
        for (int i = 10; i >= 0; i--) {
            if ((M - A[i]) >= 0) {
                ans.append(i);
                M -= A[i];
                i = 10;
                if (M == 0) {
                    if ((ans.length() + 1) / 2 <= 20) {
                        System.out.println((ans.length() + 1) / 2);
                        System.out.println(ans.toString());
                        // ans.delete(0, ans.length());
                    }
                    System.exit(0);
                    // break;
                } else {
                    ans.append(" ");
                }
            }
        }
        ans.delete(0, ans.length());
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

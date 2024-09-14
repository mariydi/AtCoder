package Beginner_Contest.ABC371;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int M = InputBasicLine.IntValue(scn);
        boolean flag[] = new boolean[N];
        for (int i = 0; i < flag.length; i++) {
            flag[i] = false;
        }
        int A[] = new int[M];
        String B[] = new String[M];
        for (int i = 0; i < M; i++) {
            A[i] = InputBasicLine.IntValue(scn);
            B[i] = InputBasicLine.StringValue(scn);
        }

        for (int i = 0; i < M; i++) {
            if (B[i].equals("M")) {
                if (flag[A[i] - 1]) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                    flag[A[i] - 1] = true;
                }
            } else {
                System.out.println("No");
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

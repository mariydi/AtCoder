package Beginner_Contest.ABC375;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        StringBuilder A[] = new StringBuilder[N+1];
        StringBuilder copyA[] = new StringBuilder[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = new StringBuilder();
            A[i].append("!"+InputBasicLine.StringValue(scn));
            copyA[i] = A[i];
        }
        for (int i = 1; i <= N / 2; i++) {
            for (int x = i; x <= N + 1 - i; x++) {
                for (int y = i; y <= N + 1 - i; y++) {

                    A[y].setCharAt(N + 1 - x, copyA[x].charAt(y));
                }
            }
            copyA = A;
        }
        for (int i = 1; i < N + 1; i++) {
            A[i].delete(0, 1);
            System.out.println(A[i].toString());
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

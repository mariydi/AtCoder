package Beginner_Contest.ABC375;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int X[] = new int[N];
        int Y[] = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = InputBasicLine.IntValue(scn);
            Y[i] = InputBasicLine.IntValue(scn);
        }

        int initX = 0;
        int initY = 0;
        double cost = 0.0;

        for (int i = 0; i < N; i++) {
            cost += Math.sqrt(Math.pow(initX - X[i], 2) + Math.pow(initY - Y[i], 2));
            initX = X[i];
            initY = Y[i];
        }

        cost += Math.sqrt(Math.pow(initX, 2) + Math.pow(initY, 2));
        System.out.println(cost);
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

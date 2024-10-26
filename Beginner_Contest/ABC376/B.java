package Beginner_Contest.ABC376;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        String Cercle = "";
        for (int i = 1; i <= N; i++) {
            Cercle += i;
        }
        Cercle += Cercle;
        int Q = InputBasicLine.IntValue(scn);
        String H[] = new String[Q];
        int T[] = new int[Q];
        int L = 1;
        int R = 2;
        int dist = 0;
        for (int i = 0; i < Q; i++) {
            H[i] = InputBasicLine.StringValue(scn);
            T[i] = InputBasicLine.IntValue(scn);
            if (H[i].equals("R")) {
                if (Cercle.indexOf(T[i]) > Cercle.lastIndexOf(Integer.valueOf(T[i]).toString())) {
                    dist += Math.abs(R - Cercle.lastIndexOf(Integer.valueOf(T[i]).toString()) + 1);
                    R = Cercle.lastIndexOf(Integer.valueOf(T[i]).toString()) + 1;
                    System.out.println( Cercle.lastIndexOf(Integer.valueOf(T[i]).toString()) + 1);
                } else {
                    dist = Math.abs(R - Cercle.indexOf(Integer.valueOf(T[i]).toString()) + 1);
                    R = Cercle.indexOf(Integer.valueOf(T[i]).toString()) + 1;
                    System.out.println(Math.abs(R - Cercle.indexOf(Integer.valueOf(T[i]).toString()) + 1));
                }
                System.out.println(dist);
            }

            if (H[i].equals("L")) {
                dist += T[i] - L;
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

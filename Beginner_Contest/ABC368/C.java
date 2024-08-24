package Beginner_Contest.ABC368;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn); // 叫ぶ時間
        int H[] = new int[N];
        for (int a = 0; a < N; a++) {
            H[a] = InputBasicLine.IntValue(scn);
        }
        long T = 0;
        for (int h : H) {
            int num = (h / 5);
            T += num * 3;
            h -= num * 5;
            while (h > 0) {
                T++;
                if (T % 3 == 0) {
                    h -= 3;
                } else {
                    h--;
                }
            }
        }

        System.out.println(T);

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

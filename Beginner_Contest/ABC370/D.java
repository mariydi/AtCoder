package Beginner_Contest.ABC370;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int H = InputBasicLine.IntValue(scn);
        int W = InputBasicLine.IntValue(scn);
        int map[][] = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                map[i][j] = 1;
            }
        }
        int Q = InputBasicLine.IntValue(scn);
        int R[] = new int[Q];
        int C[] = new int[Q];
        for (int a = 0; a < Q; a++) {
            R[a] = InputBasicLine.IntValue(scn);
            C[a] = InputBasicLine.IntValue(scn);
        }
        for (int i = 0; i < Q; i++) {
            if (map[R[i] - 1][C[i] - 1] == 1) {
                map[R[i] - 1][C[i] - 1] = 0;
            } else {
                for (int j = R[i] - 1; j < H; j++) { // ↓
                    if (map[j][C[i] - 1] == 1) {
                        map[j][C[i] - 1] = 0;
                        break;
                    }
                }
                for (int j = R[i] - 1; j >= 0; j--) { // ↑
                    if (map[j][C[i] - 1] == 1) {
                        map[j][C[i] - 1] = 0;
                        break;
                    }
                }
                for (int j = C[i] - 1; j < W; j++) { // →
                    if (map[R[i] - 1][j] == 1) {
                        map[R[i] - 1][j] = 0;
                        break;
                    }
                }
                for (int j = C[i] - 1; j >= 0; j--) { // ←
                    if (map[R[i] - 1][j] == 1) {
                        map[R[i] - 1][j] = 0;
                        break;
                    }
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                ans += map[i][j];
            }
        }
        System.out.println(ans);
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

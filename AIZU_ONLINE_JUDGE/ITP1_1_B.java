package AIZU_ONLINE_JUDGE;

import java.util.Scanner;

public class ITP1_1_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int R = InputBasicLine.IntValue(scn);
        System.out.println(R*R*R);
    }
}

class InputBasicLine {

    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }

    static String StringValue(Scanner Scanner){
        return Scanner.next();
    }
}

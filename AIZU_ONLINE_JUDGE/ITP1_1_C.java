package AIZU_ONLINE_JUDGE;

import java.util.Scanner;

public class ITP1_1_C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = InputBasicLine.IntValue(scn);
        int b = InputBasicLine.IntValue(scn);
        System.out.println(a*b +" "+(a*2+b*2));
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

package AIZU_ONLINE_JUDGE;

import java.util.Scanner;

public class ITP1_2_B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = InputBasicLine.IntValue(scn);
        int b = InputBasicLine.IntValue(scn);
        int c = InputBasicLine.IntValue(scn);
        if(a<b && b<c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
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

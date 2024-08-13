package AIZU_ONLINE_JUDGE;

import java.util.Scanner;

public class ITP1_2_A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = InputBasicLine.IntValue(scn);
        int b = InputBasicLine.IntValue(scn);
        if(a>b){
            System.out.println("a > b");
        }else if(a<b){
            System.out.println("a < b");
        }else{
            System.out.println("a == b");
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

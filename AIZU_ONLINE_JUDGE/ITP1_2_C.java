package AIZU_ONLINE_JUDGE;

import java.util.Scanner;

public class ITP1_2_C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = InputBasicLine.IntValue(scn);
        int b = InputBasicLine.IntValue(scn);
        int c = InputBasicLine.IntValue(scn);
        if(a<b){ // a < b
            if(b<c){
                System.out.println(a+" "+b+" "+c);
            }else if(a<c){ // a < c < b
                System.out.println(a+" "+c+" "+b);
            }else{
                System.out.println(c+" "+a+" "+b);
            }
        }else{ // b < a
            if(a<c){
                System.out.println(b+" "+a+" "+c);
            }else if(b<c){
                System.out.println(b+" "+c+" "+a);
            }else{ // c < b
                System.out.println(c+" "+b+" "+a);
            }
        }
    }
}
class InputBasicLine {

    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }
}

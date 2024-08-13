package Beginner_Contest.ABC150;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        String S = InputBasicLine.StringValue(scn);
        String abc = "ABC";
        int ans =0;
        for(int i=0;i<N;i++){
            if(i+3>N){break;}
            if(abc.equals(S.substring(i,i+3))){
                ans++;
            }
        }
        System.out.println(ans);
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

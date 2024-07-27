package Beginner_Contest.ABC364;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int cnt = 0;
        String S[] = new String[N];
        for(int a=0;a<N;a++){
            S[a] = InputBasicLine.StringValue(scn);
            if(S[a].equals("sweet") ){
                cnt++;
            }else{
                cnt = 0;
            }
            if(cnt > 1 && a+1 < N){
                System.out.println("No");
                System.exit(0);
            }

        }
        System.out.println("Yes");
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

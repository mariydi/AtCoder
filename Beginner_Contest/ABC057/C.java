package Beginner_Contest.ABC057;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String n = InputBasicLine.IntValue(scn);
        long N = Long.parseLong(n);
        int cnt = 99999999;
        int A =0;
        int B =0;
        for(int i=1;i<=Math.sqrt(N);i++){
            if(N%i==0){
                A = String.valueOf(i).length();
                B = String.valueOf(N/i).length();
                if(A>B){
                    if(cnt > A){
                        cnt = A;
                    }
                }else{
                    if(cnt > B){
                        cnt = B;
                    }
                }
            }
            if(A>B){
                break;
            }
        }

        System.out.println(cnt);

    }
}

class InputBasicLine {
    static String IntValue(Scanner Scanner){
        return Scanner.next();
    }
}

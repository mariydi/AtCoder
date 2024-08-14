package Beginner_Contest.ABC120;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = InputBasicLine.IntValue(scn);
        int B = InputBasicLine.IntValue(scn);
        int K = InputBasicLine.IntValue(scn);
        int cnt = 0;
        for(int i=A;i>0;i--){
            if(A%i==0 && B%i==0){
                cnt++;
            }
            if(cnt == K){
                System.out.println(i);
                break;
            }
        }



    }
}

class InputBasicLine {
    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }
}

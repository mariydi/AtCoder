package Beginner_Contest.ABC106;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int cnt = 0;
        int yakusuu = 0;
        for(int i=1;i<=N;i++){
            if(i%2==0){continue;}
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    yakusuu++;
                }
            }
            if(yakusuu == 8){
                cnt++;
            }
            yakusuu =0;
        }

        System.out.println(cnt);

    }
}

class InputBasicLine {
    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }
}

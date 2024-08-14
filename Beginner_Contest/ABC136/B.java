package Beginner_Contest.ABC136;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int cnt = 0;
        for(int i=1;i<=N;i++){
            if(String.valueOf(i).length()%2==1){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}

class InputBasicLine {
    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }
}

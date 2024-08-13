package AIZU_ONLINE_JUDGE;

import java.util.Scanner;

public class ITP1_1_D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int S = InputBasicLine.IntValue(scn);
        int h = 0;
        int m = 0;
        for(int i=0;i<S;i++){
            if(S-(3600*i)<0){
                S=S-((i-1)*3600);
                h=i-1;
                break;
            }
        }
        for(int i=0;i<S;i++){
            if(S-(60*i)<0){
                S=S-((i-1)*60);
                m=i-1;
                break;
            }
        }
        System.out.println(h+":"+m+":"+S);
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

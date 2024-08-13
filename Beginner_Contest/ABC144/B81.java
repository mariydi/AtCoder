package Beginner_Contest.ABC144;

import java.util.Scanner;

public class B81 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        if(N<10){System.out.println("Yes");System.exit(0);}
        for(int i=2;i<10;i++){
            if(N%i==0 && N/i<10){
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");
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

package Beginner_Contest.ABC364;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int H = InputBasicLine.IntValue(scn);
        int W = InputBasicLine.IntValue(scn);
        int Si = InputBasicLine.IntValue(scn);
        Si--;
        int Sj = InputBasicLine.IntValue(scn);
        Sj--;
        String C[] = new String[H];
        for(int a=0; a<H;a++){
            C[a] = InputBasicLine.StringValue(scn);
        }
        String X = InputBasicLine.StringValue(scn);
        H--;
        W--;
        /*
        System.out.println("C0 : "+C[0]);
        System.out.println("C1 : "+C[1]);
        System.out.println("X : "+X);
        */

        for(int a=0;a<X.length();a++){
            //System.out.println(X.charAt(a));
            if(X.charAt(a) == 'L'){
                if(Sj-1 >= 0 ){
                    if(C[Si].charAt(Sj-1) == '.'){
                        Sj--;
                    }
                }
            }
            if(X.charAt(a) == 'R'){
                if(Sj+1 <= W ){
                    if(C[Si].charAt(Sj+1) == '.'){
                        Sj++;
                    }
                }
            }
            if(X.charAt(a) == 'U'){
                if(Si-1 >= 0 ){
                    if(C[Si-1].charAt(Sj) == '.'){
                        Si--;
                    }
                }
            }
            if(X.charAt(a) == 'D'){
                if(Si+1 <= H ){
                    if(C[Si+1].charAt(Sj) == '.'){
                        Si++;
                    }
                }
            }
        }
        System.out.println((Si+1)+" "+(Sj+1));
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

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = InputBasicLine.StringValue(scn);
        if(S.indexOf('R') < S.indexOf('M')){
            Showcase.print("Yes");
        }else{
            Showcase.print("No");
        }

    }
}

class Showcase{
    static void print(String A){
        System.out.println(A);
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

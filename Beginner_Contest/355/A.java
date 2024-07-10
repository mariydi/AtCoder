import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = InputBasicLine.IntValue(scn);
        int b = InputBasicLine.IntValue(scn);

        if(a==b){
            System.out.println(-1);
        }else{
            System.out.println(6-(a+b));
        }
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

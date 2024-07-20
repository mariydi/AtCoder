import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int R = InputBasicLine.IntValue(scn);
        if(R < 100){
            System.out.println(100-R);
        }else if(R < 200){
            System.out.println(200-R);
        }else{
            System.out.println(300-R);
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

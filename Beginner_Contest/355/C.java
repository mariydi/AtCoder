import java.util.Arrays;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int T = InputBasicLine.IntValue(scn);
        int[] a =new int[T];
        for(int b = 0; b<T;b++){
            a[b] = InputBasicLine.IntValue(scn);
        }
        for(int cnt=0;cnt<T;cnt++){

            System.out.println(YokoChecker(a, N, T));
        }
    }
}

class ArithmeticSequenceByN{

    static Boolean N1(int[] list){

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


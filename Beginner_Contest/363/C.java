import java.util.Scanner;
import java.util.Arrays;

public class C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int K = InputBasicLine.IntValue(scn);
        String S = InputBasicLine.StringValue(scn);

        // N!/p!q!r!
        String partS[] = S.split("");

        for(String s: partS){

        }
    }

    static boolean isPalindrome (String s) {
        int n = s.length();
        for (int i=0; i<n/2; i++) {
            if (s.charAt(i)!=s.charAt(n-i-1)) {return false;}
        }
        return true;
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

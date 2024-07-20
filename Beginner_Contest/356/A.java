import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = InputBasicLine.IntValue(scn);
        int L = InputBasicLine.IntValue(scn);
        int R = InputBasicLine.IntValue(scn);

        int[] a = new int[N];
        int cnt = R;

        for(int n = 0;n<N;n++){
            if(n+1 >= L && n+1 <= R){
                a[n] = cnt;
                cnt--;
            }else{
                a[n] = n+1;
            }
        }
        for(int i=0; i<a.length; i++){
            Showcase.print(a[i]+" ");
        }
    }
}

class Showcase{
    static void print(String a){
        System.out.print(a);
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

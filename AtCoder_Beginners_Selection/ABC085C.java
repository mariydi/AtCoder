import java.util.Scanner;

public class ABC085C {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int Y = InputBasicLine.IntValue(scn);

        for(int a=0;a<=N;a++){
            for(int b=0;b<=(N-a);b++){
                for(int c=0;c<=(N-(a+b));c++){
                    int result = 10000*a + 5000*b + 1000*c;
                    if(result == Y && (a+b+c) == N){
                        System.out.println(a+" "+b+" "+c);
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}

class InputBasicLine {
    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }
}

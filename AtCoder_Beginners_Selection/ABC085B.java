import java.util.Scanner;
import java.util.Arrays;

public class ABC085B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int d[] = new int[N];
        for(int a=0;a<N;a++){
            d[a] = InputBasicLine.IntValue(scn);
        }
        int result[] = Arrays.stream(d).distinct().toArray();

        System.out.println(result.length);

    }
}

class InputBasicLine {
    static int IntValue(Scanner Scanner){
        return Scanner.nextInt();
    }
}

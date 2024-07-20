import java.util.Scanner;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int T = InputBasicLine.IntValue(scn);
        int P = InputBasicLine.IntValue(scn);
        int L[] = new int[N];
        for(int a=0;a<N;a++){
            L[a] = InputBasicLine.IntValue(scn);
        }
        Arrays.sort(L);
        for (int f = 0, l = L.length - 1; f < l; f++, l--){
            int temp = L[f];
            L[f]  = L[l];
            L[l] = temp;
        }
        //System.out.println(Arrays.toString(L));

        int cnt =0;
        for(int a=0;a>N;a++){
            if(L[a] > P){
                cnt++;
            }
        }
        int Pcnt = P-cnt;
        //System.out.println(Pcnt);

        if(L[Pcnt-1] >= T){
            System.out.println(0);
        }else{
            System.out.println(T-L[Pcnt-1]);
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

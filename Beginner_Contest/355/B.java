import java.util.Arrays;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int M = InputBasicLine.IntValue(scn);

        int[] A = new int[N];
        int[] B = new int[M];

        for(int a = 0;a<N;a++){
            A[a] = InputBasicLine.IntValue(scn);
        }
        for(int a = 0;a<M;a++){
            B[a] = InputBasicLine.IntValue(scn);
        }
        int[] C = new int[N+M];
        System.arraycopy(A, 0, C, 0, N);
        System.arraycopy(B, 0, C, N, M);
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);

        int tmp = -2;
        for(int a=0; a<(N+M); a++){
            for(int b=0; b<N; b++){

                if(C[a]==A[b]){
                    if(a-tmp==1){
                        System.out.println("Yes");
                        System.exit(0);
                    }else{
                        tmp = a;
                        break;
                    }

                }
            }
        }
        System.out.println("No");
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

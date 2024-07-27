package Beginner_Contest.ABC364;
import java.util.Scanner;
import java.util.Arrays;

public class C {

    static int N = 0;
    static long X = 0;
    static long Y = 0;
    static int ans =0;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        N = InputBasicLine.IntValue(scn);
        X = scn.nextLong();
        Y = scn.nextLong();
        int A[] = new int[N];
        int B[] = new int[N];
        int All[] = new int[N];

        for(int a=0; a<N;a++){
            A[a] = InputBasicLine.IntValue(scn);
        }
        for(int b=0; b<N;b++){
            B[b] = InputBasicLine.IntValue(scn);
        }
        for(int all=0; all<N;all++){
            All[all] = all;
        }

        permutation.permutation(All,A,B);
        System.out.println(ans);
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


class permutation {
    static void permutation(int[] seed, int[] A, int[] B) {
        int[] perm = new int[seed.length];
        boolean[] used = new boolean[seed.length];
        buildPerm(seed, perm, used, 0,A,B);
    }

    static void buildPerm(int[] seed, int[] perm, boolean[] used, int index,int[]A,int[]B) {
        if (index == seed.length) {
            procPerm(perm,A,B);
            return;
        }

        for (int i = 0; i < seed.length; i++) {
            if (used[i])
                continue;
            perm[index] = seed[i];
            used[i] = true;
            buildPerm(seed, perm, used, index + 1,A,B);
            used[i] = false;
        }
    }

    private static void procPerm(int[] perm,int[]A,int[]B) {
        //System.out.println(Arrays.toString(perm));
        int cntX =0;
        int cntY =0;
        int cnt =0;
        for(int i: perm){
            cntX += A[i];
            cntY += B[i];
            if(cntX<C.X && cntY<C.Y){
                cnt++;
                if(cnt>C.ans){
                    C.ans = cnt;
                }
            }else{
                return;
            }
        }

    }

}

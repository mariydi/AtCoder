import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = InputBasicLine.IntValue(scn);
        int M = InputBasicLine.IntValue(scn);

        int[] A = new int[M];
        for(int a=0;a<M;a++){
            A[a] = InputBasicLine.IntValue(scn);
        }
        int[][] X = new int[N][M];
        for(int n =0;n<N;n++){
            for(int m=0;m<M;m++){
                X[n][m] = InputBasicLine.IntValue(scn);
            }
        }
        boolean answerflag = true;
        for(int m = 0;m<M;m++){
            int totalXij = 0;
            for(int n = 0;n<N;n++){
                totalXij += X[n][m];
            }
            if(A[m] > totalXij){
                answerflag = false;
            }

        }
        if(answerflag == true){
            Showcase.print("Yes");
        }else{
            Showcase.print("No");
        }
    }
}



class Showcase{
    static void print(String A){
        System.out.println(A);
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

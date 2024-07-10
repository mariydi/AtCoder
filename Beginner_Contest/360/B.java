import java.util.Scanner;
import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String S = InputBasicLine.StringValue(scn);
        String T = InputBasicLine.StringValue(scn);

        int SLength = S.length();

        boolean flag = false;

        for(int w =1; w<S.length();w++){
            //何文字区切りを宣言するｗ
            for(int c=0; c<w; c++){
                //区切ったあとの中身を探索する用のｃ
                StringBuilder sb = new StringBuilder();
                for(int a = c; a<SLength; a+=w){
                    //区切った何文字目を縦に見るかのa
                    sb.append(S.charAt(a));
                    Showcase.print(sb.toString());
                }
                if(sb.toString().equals(T)){
                    flag = true;
                    Showcase.print("通った！！！");
                }
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}

class Showcase{
    static void print(String A){
        //System.out.println(A);
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

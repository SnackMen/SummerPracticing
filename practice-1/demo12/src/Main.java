import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int n=scanner.nextInt();
        long sum=0;
        String str = String.valueOf(a);
        for(int i=0;i<n;i++){
            sum+=Integer.valueOf(str);
            str = String.valueOf(a);
            for(int j=0;j<i+1;j++){
                str += String.valueOf(a);
            }
        }
        System.out.print(sum);
    }
}

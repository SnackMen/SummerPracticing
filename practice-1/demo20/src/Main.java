import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String string=null;
        int N = Integer.valueOf(scanner.nextLine());
        string = scanner.nextLine();
        char chars[] = string.toCharArray();
        long times[] = new long[N];
        for(int i=0;i<N;i++){
            times[i]=0;
        }
        for(int i=0;i<chars.length;i++){
            for(int j=i;j<chars.length;j++){
                if(chars[i]==chars[j]){
                    times[i]++;
                }
            }
        }
        long mul = Factorial(N);
        for(int i=0;i<N;i++){
            times[i]=Factorial(times[i]);
        }
        long sum=1;
        for(int i=0;i<N;i++){
            sum=sum*times[i];
        }
        System.out.print(mul/sum);
    }
    public static long Factorial(long number){
        long fact = 1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }
}

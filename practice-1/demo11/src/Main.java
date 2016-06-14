import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        long sum=0;
        for(int i=1;i<=N;i++){
            sum+=Factorial(i);
        }
        System.out.print(sum);
    }
    public static long Factorial(int number){
        long fact = 1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }
}

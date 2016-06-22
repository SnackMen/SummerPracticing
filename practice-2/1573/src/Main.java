import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/16.
 */
public class Main {
    public static void main(String srgs[]){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.valueOf(scanner.nextLine());
        for(int i=0;i<N;i++){
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            long number[] = new long[2];
            for(int j=0;j<2;j++){
                 number[j]=Long.valueOf(strings[j]);
            }
             sum(number[0],number[1]);
        }
    }
    public static void sum(long N,long M){
        BigInteger sum=new BigInteger(String.valueOf(0));
        for(int i=1;i<=N;i++){
            sum=sum.add((BigInteger)(new BigInteger(String.valueOf(M)).pow(Integer.valueOf((new BigInteger(String.valueOf(N)).gcd(new BigInteger(String.valueOf(i)))).toString()))));
        }
        System.out.println(sum);
    }
}

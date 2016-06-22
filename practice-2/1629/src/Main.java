import java.math.BigInteger;
import java.util.Scanner;
/**
 * Created by Administrator on 2016/6/16.
 */
public class Main {
    public static BigInteger sum=BigInteger.valueOf(0);
    public static BigInteger aLong=BigInteger.valueOf(0);
    public static BigInteger bLong=BigInteger.valueOf(0);
    public static long AX=0;
    public static long AY=0;
    public static long BX=0;
    public static long BY=0;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            long N=Long.valueOf(scanner.nextLine());
            String string1=scanner.nextLine();
            String strings1[] = string1.split(" ");
            String string2=scanner.nextLine();
            String strings2[] = string2.split(" ");
            long numberA[] = new long[3];
            long numberB[] = new long[3];
            for(int i=0;i<3;i++){
                numberA[i]=Integer.valueOf(strings1[i]);
                numberB[i]=Integer.valueOf(strings2[i]);
            }
            aLong=BigInteger.valueOf(numberA[0]);
            bLong=BigInteger.valueOf(numberB[0]);
            AX=numberA[1];
            AY=numberA[2];
            BX=numberB[1];
            BY=numberB[2];
            System.out.println(sum(N));
        }
    }
    public static BigInteger sum(long N){
        if(N==0){
            return sum;
        }else{
            return sum.add(sum(N-1).add(aVoid(N).multiply(bVoid(N))));
        }
    }
    public static BigInteger aVoid(long N){
        if(N==0){
            return aLong;
        }else{
            return (aVoid(N-1).multiply(BigInteger.valueOf(AX))).add(BigInteger.valueOf(AY));
        }
    }
    public static BigInteger bVoid(long N){
        if(N==0){
            return bLong;
        }else{
            return (bVoid(N-1).multiply(BigInteger.valueOf(BX))).add(BigInteger.valueOf(BY));
        }
    }
}
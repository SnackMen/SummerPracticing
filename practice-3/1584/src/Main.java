import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by laowang on 2016/6/23.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N=scanner.nextInt();
            polya(N);
        }
    }

    public static void polya(int N){
        BigInteger number1 = new BigInteger(String.valueOf(N)).pow(10);
        BigInteger number2= new BigInteger(String.valueOf(N)).pow(2).multiply(new BigInteger(String.valueOf(4)));
        BigInteger number3=new BigInteger(String.valueOf(N)).pow(6).multiply(new BigInteger(String.valueOf(5)));
        number1=number1.add(number2);
        number3=number1.add(number3);
        BigInteger number4=number3.divide(new BigInteger(String.valueOf(10)));
        System.out.println(number4);
    }
}

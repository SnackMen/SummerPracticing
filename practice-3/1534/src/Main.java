import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by laowang on 2016/6/24.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            int num[] = new int[2];
            for(int i=0;i<2;i++){
                num[i]=Integer.valueOf(strings[i]);
            }
            BigInteger bigInteger = new BigInteger(strings[0]);
            BigInteger bigInteger1 = new BigInteger(strings[1]);
            BigInteger bigInteger2 = bigInteger1.pow(num[1]);
            BigInteger bigInteger3=bigInteger.gcd(bigInteger2);
            System.out.println(bigInteger3);
        }
    }
}

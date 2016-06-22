import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by laowang on 2016/6/22.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        while (!string.equals("0")){
            String lastStringNumber = string.substring(string.length()-1);
            String firstStringNumber = string.substring(0,string.length()-1);
            BigInteger bigInteger = new BigInteger(string);
            BigInteger bigIntegerFirst = new BigInteger(firstStringNumber);
            BigInteger bigIntegerLast = new BigInteger(lastStringNumber);
            if(bigInteger.remainder(BigInteger.valueOf(17)).toString().equals("0")){
                BigInteger bigIntegerResult=bigIntegerFirst.subtract(bigIntegerLast.multiply(BigInteger.valueOf(5)));
                if(bigIntegerResult.remainder(BigInteger.valueOf(17)).toString().equals("0")){
                    System.out.println(1);
                }
            }else {
                System.out.println(0);
            }
           string = scanner.nextLine();

        }
    }
}

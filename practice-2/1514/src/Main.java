import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/15.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            BigInteger number1=new BigInteger(strings[0]);
            BigInteger number2=new BigInteger(strings[1]);
            System.out.println(strings[0]+"*"+strings[1]+"="+number1.multiply(number2));
        }
    }

}

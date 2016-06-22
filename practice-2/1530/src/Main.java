import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by laowang on 2016/6/21.
 */
public class Main {
    static int height=10000;
    static int low=1;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int k=0;
            String string = scanner.nextLine();
            BigInteger bigInteger = new BigInteger(string);
            int N = string.length();
            height=10000;
            low=1;
            while (low < height) {
                int mid = (low + height) / 2;
                if ((N - mid * Math.log10(mid)) > 1) {
                    low = mid + 1;
                } else if ((N - mid * Math.log10(mid)) < -1) {
                    height = mid - 1;
                } else {
                    if (new BigInteger(String.valueOf(mid)).pow(mid).equals(bigInteger)) {
                        System.out.println(mid);
                        k=1;
                        break;
                    }else if((N - mid * Math.log10(mid)) >0){
                        if (new BigInteger(String.valueOf(mid+1)).pow(mid+1).equals(bigInteger)) {
                            System.out.println(mid+1);
                            k=1;
                            break;
                        }else{
                            low=mid+1;
                        }
                    }else if((N - mid * Math.log10(mid)) <0){
                        if (new BigInteger(String.valueOf(mid-1)).pow(mid-1).equals(bigInteger)) {
                            System.out.println(mid-1);
                            k=1;
                            break;
                        }else{
                            height=mid-1;
                        }
                    }
                }
                //System.out.print(mid+" ");
            }
            if(k==0){
                System.out.println("NO");
            }
        }
    }
}

import java.math.BigInteger;
import java.util.*;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String strings[] = string.split(" ");
        long k=Integer.valueOf(strings[2]);
        long M=Integer.valueOf(strings[1]);
        long N=Integer.valueOf(strings[0]);
        List<String> listString = new ArrayList<String>();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                listString.add(String.valueOf(2*i*j+3*i+3*j+3));
            }
        }
        Collections.sort(listString);
        Object nu[] = listString.toArray();
        for(long i=0;i<nu.length;i++){
            if(i==k-1){
                System.out.print(nu[i]);
            }
        }

    }
}

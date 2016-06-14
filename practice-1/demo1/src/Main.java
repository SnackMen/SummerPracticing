import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String args[]){
        int k=0;
        double n=1;
        double S=0;
        Scanner scanner = new Scanner(System.in);
        k=scanner.nextInt();
        for(n=1;S<=k;n++){
            S=S+(1/n);
        }
        DecimalFormat decimalFormat = new DecimalFormat("###");
        System.out.print(decimalFormat.format(n-1));
    }
}

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            double r = scanner.nextDouble();
            DecimalFormat decimalFormat = new DecimalFormat("###.000");
            double v = Math.PI * Math.pow(r,3)*4/3;
            System.out.println(decimalFormat.format(v));
        }
    }
}

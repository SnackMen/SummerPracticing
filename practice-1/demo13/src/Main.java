import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            double number[] = new double[4];
            for(int i=0;i<4;i++){
                number[i] = scanner.nextDouble();
            }
            double distance = Math.sqrt(Math.pow((number[0]-number[2]),2)+Math.pow((number[1]-number[3]),2));
            DecimalFormat decimalFormat = new DecimalFormat("###.00");
            System.out.println(decimalFormat.format(distance));
        }
    }
}

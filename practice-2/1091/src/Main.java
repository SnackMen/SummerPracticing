import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/16.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        String strings[]=string.split(" ");
        long number[] = new long[3];
        for(int i=0;i<3;i++){
            number[i]=Integer.valueOf(strings[i]);
        }
        double deta=Math.pow(number[1],2)-4*number[0]*number[2];
        if(deta>=0){
            double x1=(-number[1]+Math.sqrt(deta))/(2*number[0]);
            double x2=(-number[1]-Math.sqrt(deta))/(2*number[0]);
            DecimalFormat decimalFormat = new DecimalFormat("#.00");
            System.out.println(decimalFormat.format(x1)+" "+decimalFormat.format(x2));
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[10];
        for(int k=0;k<10;k++){
            number[k]=scanner.nextInt();
        }
        Arrays.sort(number);
        for(int k=9;k>=0;k--){
            if(k>0){
                System.out.print(number[k]+" ");
            }else{
                System.out.print(number[k]);
            }
        }
    }
}

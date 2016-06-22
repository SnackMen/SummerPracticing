import java.util.Scanner;

/**
 * Created by laowang on 2016/6/22.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        while ((number--)>0){
            int sum=0;
            int num = scanner.nextInt();
            for(int j=num;j>0;j--){
                int temp=j;
                while (temp%5==0&&temp>0){
                    sum++;
                    temp/=5;
                }
            }
            System.out.println(sum);
        }
    }
}

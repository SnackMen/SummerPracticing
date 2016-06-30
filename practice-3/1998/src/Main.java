import java.util.Scanner;

/**
 * Created by laowang on 2016/6/23.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.valueOf(scanner.nextLine());
        while ((N--)>0){
            int num=Integer.valueOf(scanner.nextLine());
            System.out.println(odd(num));
        }
    }

    public static int odd(int n){
        int count=0;
        while(n!=0){
            count+=n%2;
            n/=2;
        }
        int num=(int)Math.pow(2,count);
        return num;
    }
}

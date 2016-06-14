import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
       while(scanner.hasNext()){
            int n=scanner.nextInt();
            if(n>=0){
                System.out.println(String.format("% 11d",n)+"-->"+Integer.toBinaryString(n));
            }else {
                System.out.println(String.format("% 11d",n)+"-->"+"-"+Integer.toBinaryString(Math.abs(n)));
            }
        }
    }
}

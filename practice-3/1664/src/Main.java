import java.util.ArrayList;
        import java.util.Scanner;

/**
 * Created by laowang on 2016/6/23.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n=Integer.valueOf(scanner.nextLine());
            toThree(n);
        }
    }
    public static void toThree(int n){
        StringBuffer sb = new StringBuffer();
        int n1=1;
        sb.append(""+n%3);
        while ((n1=(n/3))!=0){
            n=n1;
            sb.append(""+n%3);
        }
        System.out.print(sb.reverse().toString());
        System.out.println();
    }
}


//方法一：直接法
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String args[]){
        String string=null;
        int k=0;
        Scanner scanner = new Scanner(System.in);
        String str[] = new String[100];
        string = scanner.nextLine();
        str = string.split(" ");
        for(int j=str.length;j>0;j--){
            char stringToChar[] = str[j-1].toCharArray();
            for(int i=stringToChar.length;i>0;i--){
                System.out.print(stringToChar[i-1]);
            }
            if(j!=1){
                System.out.print(" ");
            }
        }
//        方法二：利用已有方法
//        Scanner scanner = new Scanner(System.in);
//        StringBuffer stringBuffer = new StringBuffer(scanner.nextLine());
//        System.out.print(stringBuffer.reverse());
    }
}

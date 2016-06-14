import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(string);
        String string1 = stringBuffer.reverse().toString();
        if(string.equals(string1)){
            System.out.print("Y");
        }else{
            System.out.print("N");
        }
    }
}

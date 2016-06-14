import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            String string = scanner.nextLine();
            string=string.toUpperCase();
            System.out.println(string);
        }
    }
}

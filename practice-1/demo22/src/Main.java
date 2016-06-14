import javax.net.ssl.SSLContext;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String srgs[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            int num=0;
            for(int i=0;i<strings[1].length();i++){
                if(strings[0].charAt(num)==strings[1].charAt(i)){
                    num++;
                    if(num>=strings[0].length()) {
                        System.out.println("Yes");
                        break;
                    }
                }
            }
            if(num<strings[0].length())
                System.out.println("No");
        }
    }
}

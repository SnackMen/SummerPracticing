import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        while (scanner.hasNextLine()){
            String string = scanner.nextLine();
            String strings[] = new String[N];
            strings = string.split(" ");
            for(int i=0;i<=strings.length;i++){
                System.out.print(strings[i]+" ");
            }
        }
    }
}

import java.util.Scanner;

/**
 * Created by laowang on 2016/6/21.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.valueOf(scanner.next());
        String strings[] = new String[N+2];
        int i=0;
        N=N+2;
        while ((N--)>0){
            strings[i]=scanner.nextLine();
        }

    }
}

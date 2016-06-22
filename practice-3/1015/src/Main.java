import java.util.Scanner;

/**
 * Created by laowang on 2016/6/22.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int number[] = new int[2];
        String strings[] = string.split(" ");
        for(int i=0;i<2;i++){
            number[i]=Integer.valueOf(strings[i]);
        }
        int j=0;
        int num[] = new int[number[0]];
        while((number[0]--)>0){
            num[j]=Integer.valueOf(scanner.nextLine());
            ++j;
        }
        System.out.print(num.length);

    }
}

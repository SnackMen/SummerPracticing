import java.util.Scanner;

/**
 * Created by laowang on 2016/6/23.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            int num[] = new int[2];
            for(int i=0;i<2;i++){
                num[i]=Integer.valueOf(strings[i]);
            }
            int N=0;
            for(int i=num[0]+1;i<10000000;i++){
                if(String.valueOf(i).contains("7")||i%7==0){
                    N++;
                }
                if(N==num[1]){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}

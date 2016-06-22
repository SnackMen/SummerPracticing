import java.util.Scanner;

/**
 * Created by laowang on 2016/6/22.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        method(number);
    }
    public static void method(int num) {
        boolean flag = false;
        if (num <= 1) {
            System.out.println("N");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = true;
                }
            }
        }
        if(flag){
            System.out.println("N");
        }else{
            System.out.println("Y");
        }
    }
}

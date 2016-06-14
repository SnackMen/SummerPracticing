import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int k=0;
        char[]stringToChar = string.toCharArray();
        for(int i=0;i<string.length();i++){
            if(stringToChar[i]>='A'&&stringToChar[i]<='Z' || stringToChar[i]>'a'&&stringToChar[i]<'z'){
                k++;
            }
        }
        System.out.print(k);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        List<String> number = new ArrayList<String>();
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            if(n!=-1){
                number.add(String.valueOf(n));
            }else{
                break;
            }
        }
        int num[] = new int[number.size()];
        for(int i=0;i<number.size();i++){
            num[i]=Integer.valueOf(number.get(i));
        }
        Arrays.sort(num);
        System.out.print(num[num.length-1]);
    }
}

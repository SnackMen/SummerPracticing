import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        String sumR = null;
        StringBuffer stringBuffer=null;
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=0;i<N;i++){
            int time=0;
            int number = scanner.nextInt();
            while(time<=8){
                String isRe = String.valueOf(number);
                stringBuffer = new StringBuffer(isRe);
                int number1 = Integer.valueOf(stringBuffer.reverse().toString());
                number=number+number1;
                stringBuffer = new StringBuffer(String.valueOf(number));
                if(String.valueOf(number).equals(stringBuffer.reverse().toString())){
                    time++;
                    break;
                }else{
                    time++;
                }
            }
            if(time>8){
                System.out.println("0");
            }else{
                System.out.println(time);
            }
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int N=0;
            N=scanner.nextInt();
            int h[] = new int[N];
            for(int i=0;i<N;i++){
                h[i]=scanner.nextInt();
            }
            Arrays.sort(h);
            for(int i=0;i<N;i++){
                if(i<N-1){
                    System.out.print(h[i]+" ");
                }else{
                    System.out.println(h[i]);
                }
            }
        }
    }
}

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num[] = new int[N];
        if(N==1){
            num[0]=1;
        }else if(N==2){
            num[0]=1;
            num[1]=1;
        }else if(N>2){
            num[0]=1;
            num[1]=1;
            for(int i=2;i<N;i++){
                num[i]=num[i-1]+num[i-2];
            }
        }
        for(int i=0;i<N;i++){
            if(i<N-1){
                System.out.print(num[i]+" ");
            }else{
                System.out.print(num[i]);
            }
        }
    }
}

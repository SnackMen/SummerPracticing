import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a[] = new int[number];
        int k=0;
        for (int i = 0; i < number; i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<number;i++){
            for(int j=i+1;j<number;j++){
                if(a[i]==a[j]){
                    a[j]=0;
                }
            }
        }
        Arrays.sort(a);
        for(int i=0;i<number;i++){
            if(a[i]!=0){
                a[k]=a[i];
                k++;
            }
        }
        System.out.println(k);
        for(int i=0;i<k;i++){
            if(i<k-1){
                System.out.print(a[i]+" ");
            }else{
                System.out.print(a[i]);
            }
        }
    }
}

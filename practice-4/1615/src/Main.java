import java.util.Scanner;

/**
 * Created by laowang on 2016/6/28.
 */
public class Main {
    public static int num[][];
    public static int h=1;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int N=0;
            N=scanner.nextInt();
            int M=N;
            int m=0;
            num = new int[M][M];
            while ((N--)>0){
                for(int i=0;i<M;i++){
                    num[m][i]=scanner.nextInt();
                }
                m++;
            }
            int number[] = new int[2];
            for(int n=0;n<2;n++){
                number[n]=scanner.nextInt();
            }

            for(int i=0;i<M;i++){
                for(int j=0;j<M;j++){
                    for(int k=0;k<M;k++){
                        int temp=(num[j][i]==-1 || num[i][k]==-1)? -1:(num[j][i]+num[i][k]);
                        if((num[j][k]>temp && temp!=-1)||(temp!=-1 && num[j][k]==-1)){
                            num[j][k]=temp;
                        }
                    }
                }
            }
            System.out.println("Case "+h);
            System.out.println(num[number[0]-1][number[1]-1]);
            h++;
        }
    }
}

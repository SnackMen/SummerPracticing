import java.util.Scanner;

/**
 * Created by laowang on 2016/6/23.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.valueOf(scanner.nextLine());
        int M=N;
        String strings[];
        int number[][]=new int[M][2];
        int D[][] = new int[M][1001];
        for(int k=0;k<M;){
            String string = scanner.nextLine();
            if(string.length()!=0){
                strings = string.split(" ");
                for(int i=0;i<2;i++){
                    number[k][i]=Integer.valueOf(strings[i]);
                }
                while ((number[k][1]--)>0){
                    String string1 = scanner.nextLine();
                    int a[] = new int[2];
                    String strings1[]=string1.split(" ");
                    for(int j=0;j<2;j++){
                        a[j]=Integer.valueOf(strings1[j]);
                        D[k][a[j]]++;
                    }
                }
                if(k==M-1){
                    break;
                }
            }else{
                k++;
            }
        }
        for(int j=0;j<M;j++){
            int num=number[j][1];
            int T=number[j][0]*(number[j][0]-1)*(number[j][0]-2)/6;
            int S=0;
            int A=0;
            int Ans=0;
            for(int i=1;i<=number[j][0];i++){
                A=D[j][i]*(number[j][0]-1-D[j][i]);
                S+=A/2;
            }
            Ans=T-S;
            System.out.println(Ans);
        }
    }
}

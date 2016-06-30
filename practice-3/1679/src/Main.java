import java.util.Scanner;
//容斥原理
/**
 * Created by laowang on 2016/6/24.
 */
public class Main {
    public static final int MOD=1000007;
    public static long dp[][]=new long[405][405];
    public static void main(String args[]){
        com();
        Scanner scanner = new Scanner(System.in);
        int N=Integer.valueOf(scanner.nextLine());
        while((N--)>0){
            String string = scanner.nextLine();
            String strings[]=string.split(" ");
            int num[]=new int[3];
            for(int i=0;i<3;i++){
                num[i]=Integer.valueOf(strings[i]);
            }
            if(num[2]<2||num[2]>num[1]*num[0]){
                System.out.println(0);
                continue;
            }
            int m=num[0];
            int n=num[1];
            int k=num[2];
            long sum;
            sum = (dp[n*m][k] - 2*dp[(n-1)*m][k] - 2*dp[n*(m-1)][k]+MOD)%MOD;
            while(sum<0)sum+=MOD ;
            sum = (sum + dp[(n-2)*m][k] + dp[(m-2)*n][k] + 4 * dp[(n-1)*(m-1)][k])%MOD;
            while(sum<0)sum+=MOD;
            sum = (sum - 2*dp[(n-2)*(m-1)][k] - 2*dp[(m-2)*(n-1)][k]+MOD)%MOD;
            while(sum<0)sum+=MOD;
            sum = (sum + dp[(n-2)*(m-2)][k])%MOD;
            while(sum<0)sum+=MOD;
            System.out.println(sum);
        }
    }

    public static void com(){
        dp[0][0]=1;
        dp[1][0]=1;
        dp[1][1]=1;
        for(int i=2;i<401;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    dp[i][j]=1;
                else
                    dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%MOD;
            }
        }
    }
}

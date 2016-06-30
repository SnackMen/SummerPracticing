import java.util.Scanner;

/**
 * Created by laowang on 2016/6/24.
 */
public class Main {
    public static long f[]=new long[1005];
    public static int mod;
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=Integer.valueOf(scanner.nextLine());
        while ((N--)>0){
            int n=Integer.valueOf(scanner.nextLine());
            if(n>=6){
                System.out.println(525919);
                continue;
            }
            int i=1;
            mod=1071017;
            int x=fs(n,mod);
            System.out.println(x);
        }
    }

    public static int eular(int n)
    {
        int ret = 1,i;
        for (i = 2;i * i <= n;i++)
            if (n % i == 0)
            {
                n /= i;
                ret *= (i - 1);
                while (n % i == 0)
                {
                    n /= i;
                    ret *= i;
                }
            }
        if (n > 1)
            ret *= (n - 1);
        return ret;
    }
    public static int pow(int x,int n,int mod)
    {    int m=1;
        for(int i=1;i<=n;++i){
            m*=x;
            m=m%mod;
        }
        return m;
    }
    public static int fs(int n,int mod){
        if(n==0)return 1;
        else {
            return pow(3,fs(n-1,eular(mod)),mod);
        }
    }
}

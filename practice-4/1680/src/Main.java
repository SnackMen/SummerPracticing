import java.util.Scanner;

/**
 * Created by laowang on 2016/6/28.
 */
public class Main {
    public static boolean visit[];
    public static int dis[];
    public static int num[][];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        while (N!=0){
            num = new int[110][110];
            for(int i=1;i<=N*(N-1)/2;i++){
                int m=scanner.nextInt();
                int n=scanner.nextInt();
                int dis1 = scanner.nextInt();
                num[m][n]=num[n][m]=dis1;
            }
            Prim(N);
            N=scanner.nextInt();
        }
    }

    public static void Prim(int n){
        dis = new int[110];
        visit = new boolean[110];
        int i,j;
        for(i=1;i<=n;i++){
            dis[i] = num[1][i];
        }
        for(i=1;i<n;i++){
            int temp = 100000001;
            int k = 0;
            for(j=1;j<=n;j++){
                if(!visit[j] && dis[j]<temp){
                    temp = dis[j];
                    k = j;
                }
            }
            visit[k] = true;
            for(j=1;j<=n;j++){
                if(!visit[j] && dis[j] > num[k][j]){
                    dis[j] = num[k][j];
                }
            }
        }
        for(i=2;i<=n;i++)
            dis[1] += dis[i];
        System.out.println(dis[1]);
    }
}

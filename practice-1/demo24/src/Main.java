import java.util.Scanner;
/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = Integer.valueOf(scanner.nextLine());
        for(int i=0;i<N;i++){
            int n = Integer.valueOf(scanner.nextLine());
            int time=0;
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            for(int m=0;m<strings.length;m++){
                if(time==n-1){
                    break;
                }
                for(int j=0;j<strings.length-1;j++){
                    int a1=Integer.valueOf(strings[j]);
                    int a2=Integer.valueOf(strings[j+1]);
                    if(a2>a1){
                        int p[] = swap(a1,a2);
                        strings[j]=String.valueOf(p[0]);
                        strings[j+1]=String.valueOf(p[1]);
                    }
                    time=0;
                    for(int k=0;k<strings.length-1;k++){
                        int s1=Integer.valueOf(strings[k]);
                        int s2=Integer.valueOf(strings[k+1]);
                        if(s1>=s2){
                            time++;
                        }
                    }
                    if(time==n-1){
                        for(int k=0;k<n;k++){
                            if(k<n-1){
                                System.out.print(strings[k]+" ");
                            }else{
                                System.out.println(strings[k]);
                            }
                        }
                        break;
                    }
                }
            }
            if(time!=n-1){
                System.out.println("Impossible");
            }
        }
    }
    public static int[] swap(int m,int n){
        int temp=m+1;
        m=n-1;
        n=temp;
        return new int[]{m,n};
    }
}

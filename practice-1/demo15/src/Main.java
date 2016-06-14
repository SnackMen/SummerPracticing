import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int time[] = new int[6];
        int t[] = new int[3];
        for(int i=0;i<N;i++){
            for(int j=0;j<6;j++){
                time[j] = scanner.nextInt();
            }
            if(time[5]+time[2]>59){
                t[2]=(time[5]+time[2])%60;
                t[1]=(time[5]+time[2])/60;
                if(t[1]+time[4]+time[1]>59){
                    t[0]=(t[1]+time[4]+time[1])/60+time[0]+time[3];
                    t[1]=(t[1]+time[4]+time[1])%60;
                }else{
                    t[1]=t[1]+time[4]+time[1];
                    t[0]=time[0]+time[3];
                }
            }else{
                if(time[4]+time[1]>59){
                    t[2]=time[5]+time[2];
                    t[1]=(time[4]+time[1])%60;
                    t[0]=time[0]+time[3]+(time[4]+time[1])/60;
                }else{
                    t[2]=time[5]+time[2];
                    t[1]=time[4]+time[1];
                    t[0]=time[0]+time[3];
                }
            }
            for(int k=0;k<3;k++){
                if(k<2){
                    System.out.print(t[k]+" ");
                }else{
                    System.out.println(t[k]);
                }
            }

        }
    }
}

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/14.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){//hasnext要求下一行不能为空，而hasnextline()只要有下一行就可以，这里如果用hasnextline()会造成while为真，一直处于阻塞状态
            int m=0;
            int n=0;
            int h[]= new int[2];
            for(int i=0;i<2;i++){
                h[i]=scanner.nextInt();
            }
            m=h[0];
            n=h[1];
            long sumOfS = 0;
            long sumOfC = 0;
            for(int i=m;i<=n;i++){
                if(i%2==0){
                    sumOfS = sumOfS+(long)Math.pow((double)i,2);
                }else{
                    sumOfC = sumOfC+(long)Math.pow((double)i,3);
                }
            }
            System.out.println(sumOfS+" "+sumOfC);
        }
    }
}

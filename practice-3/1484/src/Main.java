import java.util.Scanner;

/**
 * Created by laowang on 2016/6/22.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int j=0;
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            int num[] = new int[2];
            String strings[] = string.split(" ");
            for(int i=0;i<2;i++){
                num[i]=Integer.valueOf(strings[i]);
            }
            System.out.println("Case "+(++j)+":");
            if(Math.abs(maxCommonDivisor(num[0],num[1]))>0){
                if(Math.abs(minCommonMultiple(num[0],num[1]))>0){
                    System.out.println("GCD("+num[0]+","+num[1]+") "+"= "+Math.abs(maxCommonDivisor(num[0],num[1])));
                    System.out.println("LCM("+num[0]+","+num[1]+") "+"= "+Math.abs(minCommonMultiple(num[0],num[1])));
                }else{
                    System.out.println("GCD("+num[0]+","+num[1]+") "+"= "+Math.abs(maxCommonDivisor(num[0],num[1])));
                    System.out.println("no LCM");
                }
            }else{
                if(Math.abs(minCommonMultiple(num[0],num[1]))>0){
                    System.out.println("no GCD");
                    System.out.println("LCM("+num[0]+","+num[1]+") "+"= "+Math.abs(minCommonMultiple(num[0],num[1])));
                }else{
                    System.out.println("no GCD");
                    System.out.println("no LCM");
                }
            }
            System.out.println();
        }
    }

    public static int maxCommonDivisor(int m, int n) {
        if (m < n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if(n==0 && m==0){
            return 0;
        }else if(n==0&&m!=0){
            return m;
        } else{
            while (m % n != 0) {
                int temp = m % n;
                m = n;
                n = temp;
            }
        }
        return n;
    }
    public static int minCommonMultiple(int m, int n) {
        if(maxCommonDivisor(m, n)!=0){
            return m * n / maxCommonDivisor(m, n);
        }else{
            return 0;
        }
    }
}

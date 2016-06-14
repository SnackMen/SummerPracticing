import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String args[]){
        int N=0;
        int t=0;
        int m=0;
        List<String> a = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        for(int i=2;i<=N;i++){
            a.add(String.valueOf(i));
        }
        for(int i=2;i<Math.sqrt((double)N);i++){
            for(int j=0;j<a.size();j++){
                if(Integer.valueOf(a.get(i-2))!=0&&Integer.valueOf(a.get(j))!=i){
                    if(Integer.valueOf(a.get(j))%i==0){
                        a.set(j,String.valueOf(0));
                    }
                }
            }
        }
        for(int i=0;i<a.size();i++){
            if(Integer.valueOf(a.get(i))==0){
                t++;
            }
        }
        for(int i=0;i<a.size();i++){
            if(Integer.valueOf(a.get(i))!=0){
                m++;
                if(m<a.size()-t){
                    System.out.println(a.get(i));
                }else{
                    System.out.print(a.get(i));
                }
            }
        }

    }
}

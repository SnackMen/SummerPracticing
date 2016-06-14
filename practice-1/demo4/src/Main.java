import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/12.
 */
public class Main {
    public static void main(String args[]){
        int N=0;
        int k=0;
        String strings[] = new String[101];
        String strs[] = new String[1000];
        Scanner scanner = new Scanner(System.in);
        N=Integer.valueOf(scanner.nextLine());
        while (scanner.hasNext()){
            strings[k] = scanner.nextLine();
            if(k<N&&strings[k].length()>0){
                System.out.println(strings[k]);
                System.out.println();
                k++;
            }else{
                strs = strings[k].split(" ");
                for(int i=0;i<strs.length;i++){
                    System.out.println(strs[i]);
                    System.out.println();
                }
            }
       }
    }
}

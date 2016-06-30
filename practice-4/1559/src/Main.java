import java.util.Scanner;

/**
 * Created by laowang on 2016/6/28.
 */
public class Main {
    public static boolean isVisited[]=null;
    public static int maps[][];
    public static int num[];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String strings[]=null;
        while (scanner.hasNext()){
            isVisited=new boolean[1100];
            maps = new int[1100][1100];
            num = new int[2];
            String string = scanner.nextLine();
            if(string.length()==0){
                String string2 = scanner.nextLine();
                strings = string2.split(" ");
            }else{
                strings=string.split(" ");
            }
            for(int i=0;i<2;i++){
                num[i]=Integer.valueOf(strings[i]);
            }
            for(int i=1;i<num[0]+1;i++){
                for(int j=1;j<num[0]+1;j++){
                    if(i==j){
                        maps[i][j]=1;
                    }else{
                        maps[i][j]=0;
                    }
                }
            }
            while ((num[1]--)>0){
                String str = scanner.nextLine();
                int number[] = new int[2];
                String []strs = str.split(" ");
                for(int i=0;i<2;i++){
                    number[i]=Integer.valueOf(strs[i]);
                }
                maps[number[0]][number[1]]=maps[number[1]][number[0]]=1;
            }
            int sum1=0;
            for(int i=1;i<=num[0];i++){
                if(!isVisited[i]){
                    hasVisited(i);
                    sum1++;
                }
            }
            System.out.println(sum1);
        }
    }
    public static void hasVisited(int i){
        if(isVisited[i]){
            return;
        }
        isVisited[i]=true;
        for(int j=1;j<=num[0];++j)
        {
            if(maps[i][j]==1&&!isVisited[j])
            {
                hasVisited(j);
            }
        }
    }
}

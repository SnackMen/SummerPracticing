import java.util.Scanner;
/**
 * Created by Administrator on 2016/6/16.
 */
public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String string = scanner.nextLine();
            String strings[] = string.split(" ");
            int number[] = new int[4];
            for(int i=0;i<4;i++){
                number[i]=Integer.valueOf(strings[i]);
            }
            double v2=(2*number[0]*9.81*number[2]-number[3]*Math.pow((number[2]-number[1]),2))/number[0];
            if(number[1]>number[2]){
                System.out.println("D");
            }else if(v2>0){
                double v = Math.sqrt(v2);
                    if(v>10){
                        System.out.println("D");
                    }else if(v>=0){
                        System.out.println("Y");
                    }
            }else{
                    System.out.println("S");
            }
        }
    }
}

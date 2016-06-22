import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/15.
 */
public class Main {
    static final int TIME=4;
    static final int RESULT=24;
    static int number[]=new int[TIME];
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String  string = scanner.nextLine();
        String strings[] = string.split(" ");
        number = atomDigit(strings);
        if(game(TIME)){
            System.out.print("Y");
        }else{
            System.out.print("N");
        }
    }
    public static boolean game(int n){
        if(n==1){
            return (number[0]==RESULT);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=number[i],b=number[j];
                number[j]=number[n-1];
                number[i]=a+b;
                if(game(n-1)){
                    return true;
                }
                number[i]=a-b;
                if(game(n-1)){
                    return true;
                }
                number[i]=b-a;
                if(game(n-1)){
                    return true;
                }

                number[i]=a*b;
                if(game(n-1)){
                    return true;
                }
                if(b!=0&&(a%b)==0){
                    number[i]=a/b;
                    if(game(n-1)){
                        return true;
                    }
                }
                if(a!=0&&(b%a)==0){
                    number[i]=b/a;
                    if(game(n-1)){
                        return true;
                    }
                }
                number[i]=a;
                number[j]=b;
            }
        }
        return false;
    }
    public static int []atomDigit(String []letter){
        int [] digit = new int[TIME];
        for(int i=0;i<TIME;i++){
            if(letter[i].equals("A")){
                digit[i]=1;
            }else if(letter[i].equals("J")){
                digit[i]=11;
            }else if(letter[i].equals("Q")){
                digit[i]=12;
            }else if(letter[i].equals("K")){
                digit[i]=13;
            }else{
                digit[i]=Integer.valueOf(letter[i]);
            }
        }
        return digit;
    }
}

import java.util.*;

/**
 * Created by Administrator on 2016/6/15.
 */
public class Main {
    static int FIRST=0;
    static int SECOND=0;
    static int TIME=0;
    static int TIMES=1;
    static int n1=0;
    static int n2=0;
    static int n=0;
    static Map<Integer,Integer> mapFirst = new HashMap<Integer, Integer>();
    static Map<Integer,Integer> mapSecond = new HashMap<Integer, Integer>();
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String string = scanner.nextLine();
            TIME=0;
            String []strings = string.split(" ");
            for(int i=1;i<strings.length;i+=2){
                if(Integer.valueOf(strings[i])<0&&TIME==0){
                    TIME++;
                    FIRST=i;
                }else if(Integer.valueOf(strings[i])<0&&TIME==1){
                    SECOND=i;
                }
            }
            int number[] = new int[FIRST-1];
            int number1[] = new int[SECOND-FIRST-2];
            int []coe1 = new int[number.length/2];
            int []coe2 = new int[number1.length/2];
            if(number.length>0&&number1.length>0){
                for(int i=0,k=0;i<FIRST-1;i++){
                    number[i]=Integer.valueOf(strings[i]);
                    if(i+1<FIRST-1&&(i+1)%2!=0){
                        coe1[k]=Integer.valueOf(strings[i+1]);
                        mapFirst.put(coe1[k],number[i]);
                        k++;
                    }
                }
                for(int j=0,k=0;j<SECOND-FIRST-2;j++){
                    number1[j]=Integer.valueOf(strings[FIRST+j+1]);
                    if(j+1<SECOND-FIRST-2&&(j+1)%2!=0){
                        coe2[k]=Integer.valueOf(strings[FIRST+j+2]);
                        mapSecond.put(coe2[k],number1[j]);
                        k++;
                    }
                }
                Arrays.sort(coe1);
                Arrays.sort(coe2);
                System.out.println("Case "+TIMES+":");
                for(int j=coe1.length-1;j>=0;j--){
                    if(mapFirst.get(coe1[j])!=0){
                        System.out.print("("+mapFirst.get(coe1[j])+","+coe1[j]+")");
                    }
                }
                System.out.println();
                for(int j=coe2.length-1;j>=0;j--){
                    if(mapSecond.get(coe2[j])!=0){
                        System.out.print("("+mapSecond.get(coe2[j])+","+coe2[j]+")");
                    }
                }

                System.out.println();
                sum(coe1,coe2);
                TIMES++;
            }
        }
    }
    public static void sum(int []num1,int []num2){
        n1=0;
        n2=0;
        n=0;
        if(num1[num1.length-1]>=num2[num2.length-1]) {
            for (int i = num1.length - 1; i >= 0; i--) {
                for (int j = num2.length-1; j >= 0; j--) {
                    if (num1[i] == num2[j]) {
                        if((mapFirst.get(num1[i])+mapSecond.get(num2[j])==0)){
                            n1++;
                            if(n1==num1.length)
                                System.out.print(0);
                        }else{
                            System.out.print("(" + (mapFirst.get(num1[i]) + mapSecond.get(num2[j])) + "," + num1[i] + ")");
                        }
                    }else if(num1[i]>num2[j]){
                        if(n1>n)
                            System.out.print("("+mapSecond.get(num2[j])+","+num2[j]+")");
                        else
                            System.out.print("("+mapFirst.get(num1[i])+","+num1[i]+")");
                        n=n1;
                        break;
                    }else if(num1[i]<num2[j]){
                        System.out.print("("+mapSecond.get(num2[j])+","+num2[j]+")");
                        break;
                    }
                }
            }
        }else{
            for (int i = num2.length - 1; i >= 0; i--) {
                for (int j = num1.length-1; j >= 0; j--) {
                    if (num2[i] == num1[j]) {
                        if((mapSecond.get(num2[i])+mapFirst.get(num1[j]))==0){
                            n2++;
                            if(n2==num2.length){
                                System.out.print(0);
                            }
                        }else{
                            System.out.print("("+(mapSecond.get(num2[i])+mapFirst.get(num1[j]))+","+num2[i]+")");
                        }
                    }else if(num2[i]>num1[j]){
                        if(n2>n)
                            System.out.print("("+mapFirst.get(num1[j])+","+num1[j]+")");
                        else
                            System.out.print("("+mapSecond.get(num2[i])+","+num2[i]+")");
                        n=n2;
                        break;
                    }else if(num2[i]<num1[j]){
                        System.out.print("("+mapFirst.get(num1[j])+","+num1[j]+")");
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}

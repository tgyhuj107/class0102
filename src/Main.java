import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
//        int n=scn.nextInt(),max=Integer.MIN_VALUE;
//        int[] data=new int[n];
//        for (int i=0;i<n;i++){
//            data[i]=scn.nextInt();
//        }
//        for (int i=0;i<n;i++){
//           int sum=1;
//            for (int j=i;j<n;j++){
//                sum=sum*data[j];
//                if (sum>max){
//                    max=sum;
//                }
//
//            }
//        }
//        System.out.println(max);
        //12
//        int a=scn.nextInt(),b=scn.nextInt(),count=0;
//        int[] data=new int[a];
//        int[] data1=new int[b];
//        for (int i=0;i<a;i++){
//            data[i]=scn.nextInt();
//        }
//        for (int i=0;i<b;i++){
//            data1[i]=scn.nextInt();
//        }
//        for (int i=0;i<a;i++){
//            boolean flag=false;
//            boolean ch=true;
//            for (int j=0;j<i;j++){
//                if (data[i]==data[j]){
//                    ch=false;
//                }
//            }
//            if (ch==true){
//                for (int j=0;j<b;j++){
//                    if (data[i]==data1[j]){
//                        flag=true;
//                    }
//                    if (flag==true){
//                        count++;
//                        flag=false;
//                    }
//                }
//            }
//
//        }
//        System.out.println(count);
        //03
//        int n=scn.nextInt();
//        int[] data =new int[n];
//        for (int i=0;i<n;i++){
//            data[i]=scn.nextInt();
//        }
//        for (int i=0;i<n;i++){
//            int sum=data[i];
//            for (int j=i+1;j<n;j++){
//                sum=sum+data[j];
//                if (sum==0){
//                    for (int k=i;k<=j;k++){
//                        System.out.print(data[k]+" ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
        //13
//        int n=scn.nextInt();
        //14
//        int year=scn.nextInt(),month=scn.nextInt();
//        int v1=year/4+year/100+year/400;
//        int v2=v1*366+(year-v1)*365;
//        int[] data={31,28,31,30,31,30,31,31,30,31,30,31};
//        boolean flag=false;
//        if (year/400==0){
//            flag=true;
//        }else if (year/100==0){
//            flag=false;
//        }else if (year/4==0){
//            flag=true;
//        }else {
//            flag=false;
//        }
//        for (int i=0;i<month-1;i++){
//            if (i==1){
//                if (flag==false){
//
//                }
//            }
//        }
        //
//        System.out.println(f(scn.nextInt()));
        //
//        System.out.println(k(scn.nextInt()));
        //
        String str =scn.nextLine();
        int[][] data=new int[3][10];
        for (int i=0;i<10;i++){
            if (str.substring(2*i,2*i+1).equals('X')){
                data[0][i]=10;
            }else {
                data[0][i]=Integer.parseInt(str.substring(2*i,2*i+1));
            }
        }
        data[1][0]=data[0][0];
        data[2][0]=data[1][0];
        for (int i=0;i<10;i++){
            data[1][i+1]=data[1][i]+data[0][i+1];
            data[2][i+1]=data[2][i]+data[1][i+1];
        }
        System.out.println(data[2][9]);






    }
    public static int f(int n){
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }
    public static int k(int n){
        if (n<10){
            return 1;
        }else {
            return 1+k(n/10);
        }
    }
}

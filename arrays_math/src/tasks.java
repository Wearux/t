import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by U_LIVT33504 on 19.11.2016.
 */
public class tasks {
    public static void array1 (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i%2==0) System.out.format("%d ",array[i]);
        }
    }
    public static void array2 (int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0) System.out.format("%d ",array[i]);
        }
    }
    public static void array3 (int[] array){
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0) n++;
        }
        System.out.println(n);
    }
    public static void array4 (int[] array){
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if(i!=0 && (array[i]>array[i-1])) n++;
        }
        System.out.println(n);
    }
    public static void array5 (int[] array){
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if(i!=0 && (array[i]*array[i-1]>0)) {n=1; break;}
        }
        if (n==1) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void array6 (int[] array){
        int n=0;
        for (int i = 0; i < array.length; i++) {
            if(i!=0 && i!=array.length && (array[i]>array[i-1]) && (array[i]>array[i+1])) n++;
        }
        System.out.println(n);
    }
    public static void array7 (int[] array){
        int buf,j=array.length-1;
        for (int i = 0; i < array.length/2; i++,j--) {
            buf=array[i]; array[i]=array[j]; array[j]=buf;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void array8 (int[] array){
        int buf,n=(array.length%2==0)?array.length:array.length-1;
        for (int i = 0; i < n; i +=2) {
            buf=array[i]; array[i]=array[i+1]; array[i+1]=buf;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void array9 (int[] array){
        int buf=array[array.length-1];
        for (int i = array.length-1; i >0 ; i--) {
            array[i]=array[i-1];
        }
        array[0]=buf;
        System.out.println(Arrays.toString(array));
    }
    public static void array10 (int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            max=(max>array[i]?max:array[i]);
        }
        System.out.println(max);
    }
    public static void array11 (int[] array){
        Arrays.sort(array); int n=1;
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if(i!=0 && array[i-1]!=array[i])n++;
        }
        System.out.println(n);
    }
    public static void math1 (Scanner sc){
        int a = Integer.parseInt(sc.nextLine()),
                b = Integer.parseInt(sc.nextLine()),
                c = Integer.parseInt(sc.nextLine()),
                d = Integer.parseInt(sc.nextLine()), m,n,m1,n1;
        m=a*d+c*b; n=d*b; m1=m; n1=n;
        while(m1!=n1){
            if(m1>n1) m1 -=n1;
            else n1 -=m1;
        }
        m=m/m1; n=n/m1;
        System.out.format("%d %d",m,n);
    }
    public static void math2 (Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),m=Integer.parseInt(sc.nextLine());
        while(true){
            if (m==0) {System.out.println(n); break;}
            if (n==0) {System.out.println(m); break;}
            if(n>m) n %=m;
            else m %=n;
        }
    }
    public static void math3 (Scanner sc){
        int n=Integer.parseInt(sc.nextLine());
        int i=2, k=4;
        while(k<=n)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
            k = k + 2*i + 1;
            i++;
        }
        if(n>1) System.out.print(n);
    }
    public static void math4 (Scanner sc){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(61)-30; if(array[i]==0) array[i]=1;
            System.out.format("%d ",array[i]);
        }
        System.out.format("%n");


        //array1 (array);
        //array2 (array);
        //array3 (array);
        //array4 (array);
        //array5 (array);
        //array6 (array);
        //array7 (array);
        //array8 (array);
        //array9 (array);
        //array10 (array);
        //array11 (array);
        //math1 (sc);
        //math2 (sc);
        //math3 (sc);
        math4 (sc);
    }
}

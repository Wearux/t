import java.util.Scanner;

/**
 * Created by D on 05.11.2016.
 */
public class task {
    public static void task1(Scanner sc)
    {
        int buf ;
        for (int i = 100; i <1000 ; i++)
        {
            //buf=(i%100)*7;
            if((i%100*7)==i)System.out.println(i);

        }

    }
    public static void task2(Scanner sc)
    {
        int n = sc.nextInt();
        for (int i = 1; i <=(n/2) ; i++)
        {
            if(n%i==0)System.out.println(i);

        }
        System.out.println(n);
    }
    public static void task3(Scanner sc)
    {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sumNum = 0;

        for (int i = a; i <=b; i++)
        {
            for (int j = 1; j <= (i/2); j++)
            {
                if (i % j == 0)sumNum+=j ;

            }
            if(sumNum==i) System.out.println(i);
            sumNum=0;
        }
    }

    public static void task4(Scanner sc)
    {
        double a=sc.nextDouble(),n=sc.nextDouble(),abuf=1;
        if(n!=0)
            while(n!=0){
                if(n==1) n -=1;
                else if(n % 2 == 0) {a *=a; n /=2;}
                else {abuf *=a; n -=1;}
            }
        else a=1;
        System.out.println(a*abuf);
    }
    public static void task5(Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),m=Integer.parseInt(sc.nextLine());
        while(true){
            if (m==0) {System.out.println(n); break;}
            if (n==0) {System.out.println(m); break;}
            if(n>m) n %=m;
            else m %=n;
        }
    }
    public static void task21(Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),max=0;
        while(n>0){
            if(n%10>max) max = n%10;
            n /=10;
        }
        System.out.println(max);
    }
    public static void task22(Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),min=n;
        while(n>0){
            if(n%10<min) min = n%10;
            n /=10;
        }
        System.out.println(min);
    }
    public static void task23(Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),i=0;
        while(n>0){
            n /=10; i++;
        }
        System.out.println(i);
    }
    public static void task24(Scanner sc){
        int n=Integer.parseInt(sc.nextLine()),sum=0;
        while(n>0){
            sum +=n%10;
            n /=10;
        }
        System.out.println(sum);
    }
    public static void task25(Scanner sc){
         StringBuilder ns = new StringBuilder(); int max=0,i=0;
        ns.append(sc.next()); int n=Character.getNumericValue(ns.charAt(0));
        while(n!=0){
            max=(n>max)?n:max; i++;
            n=Character.getNumericValue(ns.charAt(i));
        }
        System.out.println(max);
    }
    public static void task26(Scanner sc){
        StringBuilder ns = new StringBuilder(); int min=10,i=0;
        ns.append(sc.next()); int n=Character.getNumericValue(ns.charAt(0));
        while(n!=0){
            min=(n<min)?n:min; i++;
            n=Character.getNumericValue(ns.charAt(i));
        }
        System.out.println(min);
    }
    public static void task27(Scanner sc){
        StringBuilder ns = new StringBuilder(); int i=0;
        ns.append(sc.next()); int n=Character.getNumericValue(ns.charAt(0));
        while(n!=0){
            i++;
            n=Character.getNumericValue(ns.charAt(i));
        }
        System.out.println(i++);
    }
    public static void task28(Scanner sc){
        StringBuilder ns = new StringBuilder(); int sum=0, i=0;
        ns.append(sc.next()); int n=Character.getNumericValue(ns.charAt(0));
        while(n!=0){
            sum +=n; i++;
            n=Character.getNumericValue(ns.charAt(i));
        }
        System.out.println(sum);
    }
    public static void task29(Scanner sc){
        int n=sc.nextInt(),i=1;
        while(i*i<n){
            System.out.print(i*i+" ");
            i++;
        }
    }
    public static void task210(Scanner sc){
        int n=sc.nextInt(); int result=n&(n-1);
        if (result==0) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // task1(sc);
        // task2(sc);
        //task3(sc);
        //task4(sc);
        //task5(sc);
        //task21(sc);
        //task22(sc);
        //task23(sc);
        //task24(sc);
        //task25(sc);
        //task26(sc);
        //task27(sc);
        //task28(sc);
        //task29(sc);
        task210(sc);
    }
}

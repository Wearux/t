import java.util.Scanner;

/**
 * Created by D on 09.10.2016.
 */
public class task {
    public static void task1(){
        int a = 13 / 5;
        int b = 13 % 5;
        int c = (int) 13.0 / 5;
        double d = 13 / 5;
        double e = 13 % 5;
        double f = 13.0 / 5;
        double g = 13 / 5 + 2 / 5;
        double h = 13.0 / 5 + 2.0 / 5;
        int i = (int) (13.0 / 5 + 2.0 / 5);
        System.out.format("зад 1: a=%d  b=%d  c=%d  d=%f e=%f f=%f  g=%f  h=%f i=%d %n", a,b,c,d,e,f,g,h,i);
    }

    public static void task2(double x){
        double x2 = x;
        x = x * x;
        x =x * x;
        System.out.format("зад 2: при x=%f будет x^4=%f %n",x2,x);
    }

    public static void task3(double x){
        double x2 = x;
        x2 = x2 * x2 *x2;
        x2 =x2 * x2;
        System.out.format("зад 3: при x=%f будет x^6=%f %n",x,x2);
    }

    public static void task4(double x){
        double x2 = x;
        x2 = x2 * x2 *x2;
        x2 =x2 * x2 * x;
        System.out.format("зад 4: при x=%f будет x^7=%f %n",x,x2);
    }

    public static void task5(double x){
        double x2 = x; double bf1, bf2, bf3;
        bf1=x2*x2;
        bf2=bf1*bf1;
        bf3=bf2*bf2;
        x2=bf3*bf3*bf2*x2;
        System.out.format("зад 5: при x=%f будет x^21=%f %n",x,x2);
    }

    public static void task6(){
        int n = 234; int f;
        f=n%10;
        System.out.format("зад 6: при натуральном x=%d последняя цифра=%d %n",n,f);
    }

    public static void task7(){
        int n = 23; int f;
        f=n/10;
        System.out.format("зад 7: при натуральном x=%d десятки=%d %n",n,f);
    }

    public static void task8(){
        int n= 3456; int f;
        f = (n%100)/10;
        System.out.format("зад 8: при натуральном x=%d десятки=%d %n",n,f);
    }

    public static void task9(){
        int z1,z2;
        z1=123;
        z2=z1%10 + (z1%100)/10 + (z1/100);
        System.out.format("зад 9: трехзнач число x=%d сумма=%d %n",z1,z2);
    }

    public static void task10(Scanner sc){
        System.out.print("зад 10: Введите v=");
        int v = sc.nextInt();
        System.out.print("t=");
        int t = sc.nextInt();
        int s = (v*t)%109;
        System.out.format("Он остановится на отметке %d %n",s);
    }

    public static void task11(Scanner sc){
        System.out.print("зад 11: Введите n=");
        int n = sc.nextInt();
        int d = n / (60*24);
        int h = n/60-d*24;
        int m = n - (h*60+d*24*60);
        System.out.format("часов: %d минут: %d %n",h,m);
    }

    public static void task12(Scanner sc){
        System.out.print("зад 12: Введите h=");
        int h = sc.nextInt();
        System.out.print("m=");
        int m = sc.nextInt();
        System.out.print("s=");
        int s = sc.nextInt();
        double o = h*30+(m*0.5)+(s*(0.5/60));
        System.out.format("угол = %f",o);
    }
    public static void main(String[] args) {
        task1();
        double x = 2;
        task2(x);
        task3(x);
        task4(x);
        task5(x);
        task6();
        task7();
        task8();
        task9();
        Scanner sc = new Scanner(System.in);
        task10(sc);
        task11(sc);
        task12(sc);
    }
}

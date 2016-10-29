import java.util.Scanner;

/**
 * Created by D on 27.10.2016.
 */
public class task {
    public static void task3_1A (){
        int a=3, b=2;
        System.out.format("a=%d b=%d %n", a,b);
        if (a>b) System.out.println(a);
        else System.out.println(b);
    }
    public static void task3_1E(){
        int a=2, b=3;
        System.out.format("a=%d b=%d %n", a,b);
        if(a==b) System.out.println(0);
        else if(a>b) System.out.println(1);
        else System.out.println(2);
    }
    public static void task3_1F(){
        int a=1, b=2, c=3,max;
        System.out.format("a=%d b=%d c=%d %n", a,b,c);
        if(a>b) max=a;
        else max=b;
        if(c>max) System.out.println(c);
        else System.out.println(max);
    }
    public static void task3_1D(){
        int x=1;
        System.out.format("a=%d %n", x);
        if(x==0) System.out.println("sign(x)=0");
        else if(x>0) System.out.println("sign(x)=1");
        else System.out.println("sign(x)=-1");
    }
    public static void task3_1U(){
        int a=2, b=1, c=1;
        System.out.format("a=%d b=%d c=%d %n", a,b,c);
        if((a==b)&&(b==c)) System.out.println(3);
        else if((a==b)||(b==c)||(a==c)) System.out.println(2);
        else System.out.println(0);
    }
    public static void task3_1G(){
        int a1=1, b1=1, a2=2, b2=1;
        System.out.format("a1=%d a2=%d b1=%d b2=%d %n", a1,b1,a2,b2);
        if(a1 == a2 || b1 == b2) System.out.println("YES");
        else System.out.println("NO");
    }
    public static void task3_1V(){
        double a=1, b=3, c=120, d;
        d=b*b-4*a*c;
        System.out.format("a=%f b=%f c=%f D=%f %n", a,b,c,d);
        if(d>0) System.out.format("x1=%f x2=%f", (-b-Math.sqrt(d))/(2*a), (-b+Math.sqrt(d))/(2*a));
        else if(d==0) System.out.format("x=%f", -b/(2*a));
    }
    public static void task3_1W(){
        int a=5,b=4,c=4,l,h,max,sr,min;
        System.out.format("%d %d %d %n", a,b,c);
        if(a>b) max=a;
        else max=b;
        if(c>max) max=c;
        if(a<b) min=a;
        else min=b;
        if(c<min) min=c;
        sr=a+b+c-max-min;
        l=min*min+sr*sr;
        h=max*max;
        if((a+b<=c)||(a+c<=b)||(b+c<=a))
            System.out.println("impossible");
        else
            if(l>h) System.out.println("acute");
            else if(l<h) System.out.println("obtuse");
            else if(l==h) System.out.println("rectangular");
    }
    public static void task3_1Y(){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //task3_1A();
        //task3_1E();
        //task3_1F();
        //task3_1D();
        //task3_1U();
        //task3_1G();
        //task3_1V();
        //task3_1W();
        task3_1Y();
    }
}

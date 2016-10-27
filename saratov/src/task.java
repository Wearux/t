import java.util.Scanner;

/**
 * Created by U_LIVT33513 on 22.10.2016.
 */
public class task {
    public static void a(Scanner sc){
        System.out.println(sc.nextInt() + sc.nextInt());//Во имя БУДДЫ!!!

    }
    public static void b(Scanner sc){
        int k =sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a<0)&&(b>=0))
            System.out.println(((b-a)+2)/k);
        else  System.out.println(((b-a)+1)/k);



    }
    public static void c(Scanner sc){
        int n =Integer.parseInt(sc.nextLine());
        String[] str = new String[n];
        for ( int i = 0;i<n;i++)
            str[i] = sc.nextLine();
        for ( int i = n-1;i>=0;i--)
            System.out.println(str[i]);


    }
    public static void d(Scanner sc){
        int low = 1;
        int up = Integer.parseInt(sc.nextLine());
        int mid;
        String s;
        while(low < up){
            mid = ((up+low) / 2)+1;
            System.out.println(mid);
            s=sc.nextLine();
            if( s.equals("<"))
                up = mid-1;
            else
                low = mid;
            //System.out.format("границы %d %d %n",low, up);
        }
        System.out.format("! %d" ,up);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // a(sc);
        //b(sc);
         //c(sc);
        d(sc);
    }
}

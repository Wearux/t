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

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // task1(sc);
        // task2(sc);
        //task3(sc);
        task4(sc);
    }
}

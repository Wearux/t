import org.omg.CORBA.PUBLIC_MEMBER;


import java.io.*;
import java.util.Scanner;

/**
 * Created by U_LIVT33513 on 15.10.2016.
 */
public class task {
    public static void task1(Scanner sc)
    {

        byte n = sc.nextByte();
        if(n<32)
            System.out.print(1<<n);
        else
            System.out.print("Ты тупой мудак!");
    }

    public static void task2(Scanner sc)
    {

        byte n = sc.nextByte();
        byte m = sc.nextByte();
        if((n<32)&&(m<32) &&(m!=n)) {
            System.out.print((1 << n) | (1 << m));

        }
        else
            System.out.print("Ты тупой мудак!");
    }

    public static void task3(Scanner sc)
    {

        byte A = sc.nextByte();
        byte  i = sc.nextByte();

        System.out.println(Integer.toBinaryString(A) );
        System.out.println(Integer.toBinaryString ((A >>> i)<<i) );

    }
    public static void task4(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString( A|(1<<i)) );
    }
    public static void task5(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString( A^(1<<i)) );
    }
    public static void task6(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString( A&~(1<<i)) );
    }
    public static void task7(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();
        System.out.println(Integer.toBinaryString ( A^(A >>> i)<<i));

    }
    public static void task8(Scanner sc)
    {
        byte A = sc.nextByte();
        byte  i = sc.nextByte();

        System.out.println(Integer.toBinaryString((A&(1<<i))>>>i));
    }
    public static void task9(Scanner sc)
    {
        StringBuilder s = new StringBuilder();
        int n = 5;
        System.out.println(n);
        for (int i = 0; i < 8; i++)
        {
            if ((n & 1) != 0)
            {
                s.append(1);
            }
            else
            {
                s.append(0);
            }
            n = n >> 1;
        }
        System.out.println(s.reverse());
    }
    public static void task10 (){
        try {
            int n=0,s=0;
            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            while(n!=-1)
            {
                n=in.read();
                if ((n>=48) && (n<=57))
                s += Character.getNumericValue(n);
            }
            in.close();

            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            out.println(s);
            out.close();
        }
        catch(IOException e) {
            System.out.println("Some error occurred!");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // task1(sc);
        // task2(sc);
        //task3(sc);
        // task4(sc);
        // task5(sc);
        // task6(sc);
        // task7(sc);
        //task8(sc);
        task9(sc);
        //task10();
    }
}
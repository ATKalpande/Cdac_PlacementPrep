import java.util.Scanner;

public class Thirt {
    //14. How to add two numbers without using the arithmetic operators in Java? 
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sum1(a, b);
       sum2(a, b);
        sc.close();
    }

    static void sum1(int a,int b)
    {
        for(int i=1;i<=b;i++)
        {
            a++;
        }
        System.out.println("Addition is : " +a);
    }

    static void sum2(int a,int b)
    {
        while(b!=0){
            int car = a&b; 
            //  00001111 (15)
           // + 00011011 (27)
           // 1 1 = (1)0 -> cary
            a = a^b;
            b = car<<1;


        }
        System.out.println("Add is "+a);
    }

}

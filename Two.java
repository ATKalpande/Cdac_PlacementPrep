import java.util.Scanner;

public class Two {

    //2. Write a Java Program to find the Factorialof given number.
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in) ;
         System.out.println("Enter the number :");
         int n = sc.nextInt();
         int res=1;
        for(int i=1;i<=n;i++)
        {
            res = res *i;
        }

         System.out.println("Factorial is :"+res);


    }
}

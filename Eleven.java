import java.util.Scanner;

public class Eleven {
    //12. Write a Java Program to find sum of the digits of a given number.

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number :");
        int a = sc.nextInt();

        int sum = 0;
        while(a>0)
        {
            sum = sum +a%10;
            a=a/10;
        }
        System.out.println("The sum of digits in a is :"+sum);
    }
}

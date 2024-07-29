import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        //11. Write a Java Program to print all the Factors of the Given number.
          Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number :");
        int a = sc.nextInt();

        System.out.println("Factors of a is :");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
        }
        
        

    }
}

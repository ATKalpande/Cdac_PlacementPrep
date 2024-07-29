import java.util.Scanner;

/**
 * Twel13. Write a Java Program to find the smallest of 3 numbers(a,b,c) without using < or > symbol? 
 */
public class Twel {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Ente the numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        int pt = 0;
        while (a!=0 && b!=0 && c!=0) {
            a--;
            b--;
            c--;
            pt++;
        }

        System.out.println("The Smallest element from is :"+pt);

    }

}
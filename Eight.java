import java.util.Scanner;

//8. Write a Java Program to find whether given number is Leap year or NOT? 
public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } 
                else{
                    System.out.println("Not");
                }
            }else{
                System.out.println("Leap");
            }
        } else{
            System.out.println("Not a leap");
        }
    }
  
}

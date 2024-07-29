import java.util.Scanner;

public class Seven {
    //7. How to check the given number is Positive or Negativein Java? 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ente the number :");
        int a = sc.nextInt();

        if(a<0)
        {
            System.out.println("-Ve");
        }else{
            System.out.println("+Ve");
        }
        
    }
}

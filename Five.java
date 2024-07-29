public class Five {

    //5. Swap two numbers without using third variable approach 2.
    public static void main(String[] args) {
        int a = 12, b = 13;

        System.out.println("a :"+a+" b :"+b);

        a = a^b; //a's bit ^ b'bit --> o'bit
        b = a^b; // o'bit ^ b'bit -- > a
        a = a^b; // b

        System.out.println("a :"+a+" b :"+b); //13 12


    }
}

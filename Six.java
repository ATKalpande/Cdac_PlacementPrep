public class Six {
    public static void main(String[] args) {
        int a = 12, b = 13;

        System.out.println("a :"+a+" b :"+b);

        a = a*b; // 156
        b = a/b; // 156/13 -> 12
        a = a/b; // 156/12 ->13

        System.out.println("a :"+a+" b :"+b); //13 12

    }
}

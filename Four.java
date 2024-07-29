public class Four {
//4. Swap two numberswithout using third variable approach 1.
    public static void main(String[] args) {
        int a=12,b=31;

        System.out.println("a: "+a+" b: "+b); //12 31
        
        a =a+ b; // 43
        b = a - b; // 43 - 31 = 12
        a = a - b; // 43-12 = 31

        System.out.println("a: "+a+" b: "+b); //31 12
    }

    
    
}
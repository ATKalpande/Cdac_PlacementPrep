public class Three {
    //3. Find the Factorialof a number using Recursion.
    public static void main(String[] args) {
       System.out.println(fact(5)); 
    }

    public static int  fact(int i)
    {
        if (i>=1)
        return i*fact(i-1) ; //5*4 , 4*3, 3*2,2*1
    else
        return 1;
    }

}
//Output : 120
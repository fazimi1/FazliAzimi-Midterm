package math.problems;

public class Fibonacci {
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        {
            int n = 40;
            System.out.println("40 Fibonacci numbers: "+fib(n));
        }

    }
}

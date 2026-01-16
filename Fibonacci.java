public class Fibonacci {

//Uses recursion for the Fibonacci method
// @param n the term position which starts at 0
// @return the Fibonacci value, which is represented my n

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
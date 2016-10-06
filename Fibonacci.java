import java.util.HashMap;

public class Fibonacci {

    private static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
    
    public int findFibo(int n)
    {
        if ( memo.containsKey( n ) ) {
            return memo.get( n );
        }
        
        int fibo;
        
        if ( n <= 1 ) {
            fibo = 1;
        } else {
            fibo = findFibo( n - 1 ) + findFibo( n - 2 );
        }
        memo.put(n, fibo);
        return fibo;
    }
}

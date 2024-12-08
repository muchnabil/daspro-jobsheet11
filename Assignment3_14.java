import java.util.Scanner;
public class Assignment3_14 {
    public static int PrimeCheckingRecursive(n, divisor = 2){
        if ( n <= 1){
            return false;
        }
        if (divisor * divisor > n){
            return true;
        }
        if (n % divisor == 0){
            return false;
        }
        return PrimeCheckingRecursive(n, divisor + 1);
    }
    
}
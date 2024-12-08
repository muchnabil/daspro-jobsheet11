import java.util.Scanner;
public class Assignment3_14 {
    public static boolean PrimeCheckingRecursive(int n, int divisor){
        if ( n <= 0){
            return false;
        }
        if (divisor * divisor > n){
            return true;
        }
        if (n % divisor == 0){
            return false;
        } else {
            return PrimeCheckingRecursive(n, divisor + 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check : ");
        int numberToCheck = input.nextInt();
        boolean prime = PrimeCheckingRecursive(numberToCheck, 2);
        if (prime) {
            System.out.println(numberToCheck + " is a prime number.");
        } else{
            System.out.println(numberToCheck + " is not prime number.");
        }
    }
}
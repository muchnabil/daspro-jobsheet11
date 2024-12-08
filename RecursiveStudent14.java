public class RecursiveStudent14 {
    static int factorialRekursive(int n){
        if (n == 0) {
            return (1);
        } else {
            return (n * factorialRekursive(n-1));
        }
    }
    static int factorialIterative(int n){
        int factor = 1;
        for (int i = n; i >= 1; i--){
            factor = factor * i;
        }
        return factor;
    }
    public static void main(String[] args){
        System.out.println("Hello World!!!");
        System.out.println(factorialRekursive(5));
        System.out.println(factorialRekursive(5));
    }
}
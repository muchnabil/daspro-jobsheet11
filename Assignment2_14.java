import java.util.Scanner;
public class Assignment2_14 {
    public static int SummationRecursive(int n){
        if (n == 0){
            return 0;
        } else{
            return n + SummationRecursive(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number : ");
        int number = input.nextInt();

        System.out.println(SummationRecursive(number));
    }
}

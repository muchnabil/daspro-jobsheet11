import java.util.Scanner;
public class Assignment1_14 {
    public static int DescendingSequenceRecursive(int n){
        if (n == 0){
            return 0;
        } else {
            System.out.println(n + " ");
            return DescendingSequenceRecursive(n -1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number : ");
        int number = input.nextInt();
        System.out.println(DescendingSequenceRecursive(number));
    }
}

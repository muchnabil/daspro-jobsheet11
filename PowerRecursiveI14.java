import java.util.Scanner;
public class PowerRecursiveI14 {
    public static int calculatePower(int base, int pow){
        if (pow == 0){
            return (1);
        }else{
            return (base * calculatePower(base, pow - 1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input base number : ");
        int base = input.nextInt();
        System.out.print("Input power number : ");
        int power = input.nextInt();
        System.out.println(calculatePower(base, power));
    }
}

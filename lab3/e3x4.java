import java.util.Scanner;

public class e3x4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr three number:");
        int num = in.nextInt();
        int rem = 0;
        int sum = 0;
        if (num < 0) {
            num *= -1;
        }

        while(num > 0) {
            rem = num % 10;
            sum += rem;
            num /= 10;
        }

        System.out.println(sum);
    }

}

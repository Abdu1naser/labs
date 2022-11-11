import java.util.Scanner;

public class e3x3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr the number:");
        int x = in.nextInt();
        if (x > 0) {
            System.out.println("the number (positive)");
        } else if (x < 0) {
            System.out.println("the number (negative)");
        } else if (x == 0) {
            System.out.println("the number (zero)");
        } else {
            System.out.println("agine");
        }

    }
}

import java.util.Scanner;

public class e3x5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr the two number");
        int x = in.nextInt();
        int a = in.nextInt();
        if (x == a) {
            System.out.println("all the same");
        } else if (x != a) {
            System.out.println(" not all the same");
        } else {
            System.out.println("no");
        }

    }
}

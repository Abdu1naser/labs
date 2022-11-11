import java.util.Scanner;

public class e3x7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enetr the two number");
        int x = in.nextInt();
        int a = in.nextInt();
        int z = in.nextInt();
        if (x <= a && a <= z) {
            System.out.println("in order");
        } else if (x >= a && a >= z) {
            System.out.println("not in order");
        } else {
            System.out.println("noooot");
        }

    }
}

import java.util.Scanner;
public class e2x4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enetr the on number: ");
        float x = input.nextFloat();
        System.out.println("enetr the two number: ");
        float y = input.nextFloat();
        System.out.println("enetr the three number: ");
        float z = input.nextFloat();
        float a = (x + y + z) / 3.0F;
        System.out.println("x=" + x + "\ny=" + y + "\nz=" + z + "\naverage=" + a);
    }
}

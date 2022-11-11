import java.util.Scanner;
public class e2x3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enetr the length: ");
        int x = input.nextInt();
        System.out.println("enetr the display: ");
        int y = input.nextInt();
        int s = x * y;
        float z = (float)(x + y) / 2.0F;
        System.out.println("the rectangle area =" + s);
        System.out.println("the concert of the  rectangle  =" + z);
    }
}

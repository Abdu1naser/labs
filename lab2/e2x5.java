import java.util.Scanner;

public class e2x5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of y =");
        int y = input.nextInt();
        System.out.println("enter the value of x =");
        int x = input.nextInt();
        System.out.println("the value of y =" + y + "\nthe value of x =" + x);
        System.out.println("-------------------------------------");
        System.out.println("the value of y =" + x + "\nthe value of x =" + y);
    }
}

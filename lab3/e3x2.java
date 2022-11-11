import java.util.Scanner;

public class e3x2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a,b,c,d,e,g");
        System.out.println("enter the charakter : ");
        char x = input.next().charAt(0);
        System.out.println("enetr the number : ");
        double number = (double)input.nextFloat();
        if (x != 'a' && x != 'b' && x != 'c' && x != 'g') {
            System.out.println("agin");
        } else {
            String cl;
            if (number % 2.0 == 0.0) {
                cl = "blake";
                System.out.println(cl);
            } else {
                cl = "white";
                System.out.println(cl);
            }
        }

    }
}

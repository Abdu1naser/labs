import java.util.Scanner;

public class labsix4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enetr the word:");
        String c=in.next();
        int n=c.length();
        for (int i = n-1; i  >=0; i--) {

            System.out.print(c.charAt(i));


        }
    }
}

import java.util.Scanner;

public class labsix3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enetr the word");
        String c=in.next();
       int n= c.length();
        for (int i = 0; i < n; i++) {

           char s= c.charAt(i);
           System.out.println(s+"\n");


        }

    }
}

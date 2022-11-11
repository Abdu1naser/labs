import java.util.Scanner;

public class labsix5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the word:");
        String c=in.next();
        int  n=c.length();
        int sim=0;
        for (int i = 0; i <n; i++) {

            char s= c.charAt(i);
            if(s=='e'||s=='o'||s=='i'||s=='u')
                sim++;



        }  System.out.println(sim);
    }
}

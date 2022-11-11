import java.util.Scanner;

public class labsix7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enetr yhe number");
        int x=in.nextInt();
        int s,sum;
      while (x!=0)
      {
          s=x%2;
          sum=s;
          System.out.print(sum);
          x=x/2;

      }


    }
}

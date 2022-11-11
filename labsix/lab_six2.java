import java.util.Scanner;

public class lab_six2 {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int x=0;
        for (int i = 2; i <100 ; i++) {
            if(i%2==0)
            {
                x=x+i;
            }

        }
        System.out.println("a="+x);
        System.out.println("--------------------------------------------------------\n");


        int aa,bb,sum=0;

           System.out.println("enetr the a number");
           aa=in.nextInt();
           System.out.println("enetr the b number");
           bb=in.nextInt();
           while (aa<=bb)
           {
               if((aa%2)>0)
               {
                   sum +=aa;
               }
               aa++;

           }
           System.out.println("b="+sum);
        System.out.println("--------------------------------------------------------\n");
        int c,w,su=0,s=0,n;
        System.out.println("enetr the a number");
        c=in.nextInt();

        while (c>0)
        {

            w=c%10;

            if((w%2)>0)
            {
                su+=w;
            }
            c=c/10;
        }
        System.out.println("sum add="+su);


    }
}

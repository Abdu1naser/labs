import java.util.Scanner;

public class labfor1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        objlabfor1 r=new objlabfor1();
        double x,y;
        System.out.println("enter the widht:");
        r.setWidth(x= in.nextDouble());
        r.setWidth(y= in.nextDouble());
        System.out.println(r.disca(x,y));
    }

}

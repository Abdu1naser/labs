public class labfive3 {
    private double withdraws;
    private double balance;
    public labfive3(double x)
    {
       balance=x;
    }
    public void withdr(double x)
    {
        balance=balance-x;

    }
    public void withdr(double x,double a)
    {
        balance=balance-(x+a);
    }
    public void desplybalace()
    {
        System.out.println("the balance ="+balance);
    }



}

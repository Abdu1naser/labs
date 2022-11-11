public class labfive4 {
    private double withdraws;
    private double balance;
    private double add;
    public labfive4(double x)
    {
        balance=x;
    }
    public void add(double x)
    {
        balance=balance+x;

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
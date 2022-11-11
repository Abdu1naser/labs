public class labsix1 {
    private double balnce;
    private double yeas;
    private double iste;
    public labsix1(double balnce,double iste)
    {
        this.balnce=balnce;
        this.yeas=iste;

    }
    public double getYeas()
    {

        return yeas;
    }
    public double getBalnce()
    {
        return balnce;
    }
    public  double numberyears(double x)
    {int  z=1;
       double a=0,v=0;

      while (z!=0)
      {
          if(balnce==x)
          {

              z=0;
          }
          else {
              balnce=balnce+yeas;
              v++;
          }




        }
        return v;
    }



}

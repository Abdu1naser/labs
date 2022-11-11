public class labfive7 {
    private  double blance;
    private  double add;
    public labfive7(double blance,double add)
    {double iaster=500;
        this.blance=blance*iaster/100;
        this.add=add;
    }
    public void addine()
    {
        double r=blance+add;
    }
    public double getBlance()
    {
        return blance;
    }
    public double desp()
    {
        double r=blance;
        blance=0;
        return r;
    }

}

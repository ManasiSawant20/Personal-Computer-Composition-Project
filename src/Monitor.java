public class Monitor
{
    private int dimesion;

    public Monitor(int dimesion)
    {
        this.dimesion = dimesion;
    }

    public void setDimesion(int dimesion)
    {
        this.dimesion = dimesion;
    }

    public int getDimesion()
    {
        return dimesion;
    }

    public void drawLogo()
    {
        System.out.println("Logo display");
    }

    public String toString()
    {
        return "Dimension : "+dimesion;
    }
}

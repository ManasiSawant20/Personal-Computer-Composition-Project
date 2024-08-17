public class MotherBoard
{
    private int ram;

    public MotherBoard(int ram)
    {
        this.ram = ram;
    }

    public int getRam()
    {
        return ram;
    }

    public void setRam(int ram)
    {
        this.ram = ram;
    }

    public void loadProgram()
    {
        System.out.println("Program is loaded");
    }

    @Override
    public String toString()
    {
        return "MotherBoard{" +
                "ram=" + ram +
                '}';
    }
}

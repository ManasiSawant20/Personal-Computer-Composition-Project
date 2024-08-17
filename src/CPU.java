public class CPU
{
    private String CompanyName;
    private MotherBoard motherBoard;

    public CPU(String companyName, MotherBoard motherBoard)
    {
        this.CompanyName = companyName;
        this.motherBoard = new MotherBoard(motherBoard.getRam());
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public void start()
    {
        motherBoard.loadProgram();
    }

    @Override
    public String toString()
    {
        return "CPU{" +
                "motherBoard=" + motherBoard +
                '}';
    }
}

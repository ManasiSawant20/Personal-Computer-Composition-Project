public class PersonalComputer
{
    private CPU cpu;
    private Monitor monitor;
    public PersonalComputer (CPU cpu, Monitor monitor)
    {
        this.cpu = new CPU(cpu.getCompanyName(), cpu.getMotherBoard());
        this.monitor = new Monitor(monitor.getDimesion());
    }

    public Monitor getMonitor()
    {
        return new Monitor(getMonitor().getDimesion());
    }

    public CPU getCpu()
    {
        return cpu;
    }

    public void start()
    {
        System.out.println("PC started");
        cpu.start();
        monitor.drawLogo();
    }

    @Override
    public String toString()
    {
        return "PersonalComputer{" +
                "cpu=" + cpu +
                ", monitor=" + monitor +
                '}';
    }
}

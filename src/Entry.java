public class Entry
{
    public static void main(String[] args)
    {
//        PersonalComputer personalComputer = new PersonalComputer("Dell", "Black");
//        System.out.println(personalComputer);
//
//        MotherBoard motherBoard = new MotherBoard(40);
//        System.out.println(motherBoard);
//
//        Monitor monitor = new Monitor(20);
//        System.out.println(monitor);
//
//        personalComputer.start();
//        motherBoard.loadProgram();
//        monitor.drawLogo();

        MotherBoard mb = new MotherBoard(40);
        CPU cpu = new CPU("xyz",mb);

        Monitor monitor = new Monitor(20);

        PersonalComputer pc = new PersonalComputer(cpu, monitor);
        pc.start();
    }
}

package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Keyboard ansiKeyboard = new Keyboard(100.0, false, KeyboardType.ANSI);
        Storage storageHdd = new Storage(HardDiskType.HDD,45,10);
        Screen screenVa = new Screen(20,20,ScreenType.VA);
        Processor processor = new Processor(10,2000,"text",80);
        OperationalMemory operationalMemoryDDR = new OperationalMemory (OperationalMemoryType.DDR,10,10);

        Computer computer = new Computer(storageHdd,"Text"," text",screenVa,processor,ansiKeyboard,operationalMemoryDDR);
        Computer computer1 = new Computer(storageHdd," Text"," text",screenVa,processor,ansiKeyboard,operationalMemoryDDR);
        Computer computer2 = new Computer(storageHdd," Text"," text",screenVa,processor,ansiKeyboard,operationalMemoryDDR);



    }
}

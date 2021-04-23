package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Keyboard ansiKeyboard = new Keyboard(100.0, false, KeyboardType.ANSI);
        Storage storageHdd = new Storage(HardDiskType.HDD);
        Screen screenVa = new Screen(20,20,ScreenType.VA);
        Processor processor = new Processor(10,2000,"text",80);

        Computer computer = new Computer(storageHdd," Text"," text",screenVa,processor,ansiKeyboard);
        Computer computer1 = new Computer(storageHdd," Text1"," text1",screenVa,processor,ansiKeyboard);
        Computer computer2 = new Computer(storageHdd," Text2"," text2",screenVa,processor,ansiKeyboard);


    }
}

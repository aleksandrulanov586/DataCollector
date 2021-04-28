package ru.skillbox;

public class Computer {

  private  Storage storage;
  private String name;
  //производитель
  private String vendor;
private Screen screen;
private Processor processor;
private Keyboard keyboard;
private OperationalMemory operationalMemory;
private double totalweight = 0;


  public Computer(Storage storage, String name, String vendor, Screen screen,
      Processor processor, Keyboard keyboard, OperationalMemory operationalMemory) {
    this.storage = storage;
    this.name = name;
    this.vendor = vendor;
    this.screen = screen;
    this.processor = processor;
    this.keyboard = keyboard;
    this.operationalMemory = operationalMemory;
  }

  public Storage getStorage() {
    return storage;
  }

  public String getName() {
    return name;
  }

  public String getVendor() {
    return vendor;
  }

  public Screen getScreen() {
    return screen;
  }

  public Processor getProcessor() {
    return processor;
  }

  public Keyboard getKeyboard() {
    return keyboard;
  }

  public OperationalMemory getOperationalMemory() {
    return operationalMemory;
  }

  public double  Calculationmass(){

    totalweight = totalweight + screen.getWeight() + storage.getWeight() + processor.getWeight() + keyboard.getWeight() + operationalMemory.getWeight();

return totalweight ;
  }
public String toString (){

    return "OperationalMemory = {" +
        "operationalMemoryType=" + operationalMemory.getOperationalMemoryType() +
        ", volume=" + operationalMemory.getVolume() +
        ", weight=" + operationalMemory.getWeight() +
        "} " + "\n" +
        " Storage = {" + "HardDiskType=" + storage.getHardDiskType()  +
        ", memorysize=" + storage.getMemorysize() + ", weight=" + storage.getWeight() + "}" + "\n" +
        " Screen = {" + "screenType=" + screen.getScreenType() + ", diagonal=" + screen.getDiagonal() + ", weight" + screen.getWeight() + "} " + "\n" +
        " Processor = {" + "frequency=" + processor.getFrequency() + ", numbercores=" + processor.getNumbercores() + ", manufacturer=" + processor.getManufacturer() + ", weight=" + processor.getWeight() + "}" + "\n" +
        " Keyboard = {" + "KeyboardType=" + keyboard.getKeyboardType() + ", hasBackLigh=" + keyboard.isHasBackLight() + ", weight" + keyboard.getWeight() + "}";
}


}

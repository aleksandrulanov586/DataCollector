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
double q = 0;
    q = totalweight * getOperationalMemory().getWeight() * getScreen().getWeight() * screen
        .getWeight() * processor.getWeight() * getStorage().getWeight();

return q;
  }
public String toString (String information){



    return information;
}


}

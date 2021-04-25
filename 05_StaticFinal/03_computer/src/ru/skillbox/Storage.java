package ru.skillbox;
//Жесткий диск
public class Storage {

  private final HardDiskType hardDiskType;
  private final double memorysize;
  private final double weight;



  public HardDiskType getHardDiskType() {
    return hardDiskType;
  }

  public double getMemorysize() {
    return memorysize;
  }

  public double getWeight() {
    return weight;
  }

  public Storage(HardDiskType hardDiskType, double memorysize, double weight) {
    this.hardDiskType = hardDiskType;
    this.memorysize = memorysize;
    this.weight = weight;
  }
}


package ru.skillbox;

public class HardDisk {
  private final double memorysize;
  private final double weight;

  public double getMemorysize() {
    return memorysize;
  }

  public HardDisk(double memorysize, double weight) {
    this.memorysize = memorysize;
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }
}

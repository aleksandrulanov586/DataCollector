package ru.skillbox;

public class OperationalMemory {

  private final OperationalMemoryType operationalMemoryType;
  private final double volume;
  private final double weight;

  public OperationalMemory(OperationalMemoryType operationalMemoryType, double volume,
      double weight) {
    this.operationalMemoryType = operationalMemoryType;
    this.volume = volume;
    this.weight = weight;
  }
  public OperationalMemoryType getOperationalMemoryType() {
    return operationalMemoryType;
  }

  public double getVolume() {
    return volume;
  }

  public double getWeight() {
    return weight;
  }


}

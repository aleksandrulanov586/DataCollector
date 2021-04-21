package ru.skillbox;

public class Storage {
  private final  HardDiskType hardDiskType;

  public Storage(HardDiskType hardDiskType) {
    this.hardDiskType = hardDiskType;
  }

  public HardDiskType getHardDiskType() {
    return hardDiskType;
  }



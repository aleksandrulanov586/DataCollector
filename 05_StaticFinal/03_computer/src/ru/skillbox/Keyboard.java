package ru.skillbox;

public class Keyboard {

  private final double weight;
  private final boolean hasBackLight;
  private final KeyboardType keyboardType;

  public double getWeight() {
    return weight;
  }

  public boolean isHasBackLight() {
    return hasBackLight;
  }

  public KeyboardType getKeyboardType() {
    return keyboardType;
  }

  public Keyboard(double weight, boolean hasBackLight, KeyboardType keyboardType) {
    this.weight = weight;
    this.hasBackLight = hasBackLight;
    this.keyboardType = keyboardType;
  }
}

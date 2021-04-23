package ru.skillbox;

public class Screen {
  private  final  double diagonal;
  private  final  double weight;
  private  final  ScreenType screenType;

  public double getDiagonal() {
    return diagonal;
  }

  public double getWeight() {
    return weight;
  }

  public ScreenType getScreenType() {
    return screenType;
  }
  public Screen(double diagonal, double weight, ScreenType screenType) {
    this.diagonal = diagonal;
    this.weight = weight;
    this.screenType = screenType;
  }
}

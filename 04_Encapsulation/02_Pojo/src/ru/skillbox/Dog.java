package ru.skillbox;

public class Dog {

  public Dog(String name, String breed) {
    this.name = name;
    this.breed = breed;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  private String name;
  private int age = 0;
  private String breed;

}

import java.util.Scanner;

public class Elevator {

  public int getCurrentFloor() {
    return currentFloor;
  }

  public static int currentFloor = 1;
  public int minFloo = 0;
  public int maxFloor = 3;


  public Elevator(int minFloo) {

    this.minFloo = minFloo;
  }

  public Elevator() {

    this.maxFloor = maxFloor;

  }

  public void moveDown() {

    while (currentFloor < 3);{

      currentFloor--;
      System.out.println("Лифт едит вниз " + currentFloor);
    }
    if (currentFloor <= 0 );{
      System.out.println("error " + currentFloor);
    }
    if (currentFloor == 1);{
      System.out.println("Вы на первом этаже " + currentFloor);
    }
    if (currentFloor == 2);{
      System.out.println("Вы на второмм этаже " + currentFloor);
    }

  }
      public void moveUp () {

      while (currentFloor < 3);
      {
        currentFloor++;
        System.out.println("Лифт едит вверх " + currentFloor);
        if (currentFloor > 3 );{
        System.out.println("error " + currentFloor);
      }
        if (currentFloor == 1);{
        System.out.println("Вы на первом этаже " + currentFloor);
      }
        if (currentFloor == 2);{
        System.out.println("Вы на второмм этаже " + currentFloor);
      }
        if (currentFloor == 3);{
        System.out.println("Вы на третьем этаже " + currentFloor);
      }
      }

    }

    public void move(int floor){


    }
Scanner scanner = new Scanner(System.in);


    }


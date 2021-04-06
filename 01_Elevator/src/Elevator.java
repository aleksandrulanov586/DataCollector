public class Elevator {

  public int getCurrentFloor() {
    return currentFloor;
  }

  public static int currentFloor = 1;
  public int minFloor = 0;
  public int maxFloor = 4;



  public Elevator(int minFloor, int maxFloor){
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public void moveDown() {




    if (currentFloor == 1)
      ;
    {
      System.out.println("Вы на первом этаже " + currentFloor);
    }
    if (currentFloor == 2)
      ;
    {
      System.out.println("Вы на второмм этаже " + currentFloor);
    }
    if (currentFloor == 3)
      ;
    {
      System.out.println("Вы на третьем этаже " + currentFloor);
    }

  }

  public void moveUp() {



    if (currentFloor == 1)
      ;
    {
      System.out.println("Вы на первом этаже " + currentFloor);
    }
    if (currentFloor == 2)
      ;
    {
      System.out.println("Вы на второмм этаже " + currentFloor);
    }
    if (currentFloor == 3)
      ;
    {
      System.out.println("Вы на третьем этаже " + currentFloor);
    }
  }



  public void move(int floor) {


    if (floor > maxFloor && floor < minFloor) {
      System.out.println("Введенного этажа не существует, никуда не поеду!");

      while (currentFloor < 4)
        ;
      {
        currentFloor++;
        System.out.println("Лифт едит вверх " + currentFloor);

        while (currentFloor > 4)
          ;
        {

          currentFloor--;
          System.out.println("Лифт едит вниз " + currentFloor);
        }


      }

    }
  }
}

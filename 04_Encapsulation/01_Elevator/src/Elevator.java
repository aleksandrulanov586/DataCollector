public class Elevator {

  public int getCurrentFloor() {
    return currentFloor;
  }

  public static int currentFloor = 1;
  public int minFloor = 1;
  public int maxFloor = 3;


  public Elevator(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public void moveDown() {

    if (currentFloor < 2)

    {

      System.out.println("Вы на первом этаже " + currentFloor);
    }
    if (currentFloor < 3)

    {

      System.out.println("Вы на второмм этаже " + currentFloor);

    }
    currentFloor = currentFloor - 1;
    if (currentFloor < 4)

    {

      System.out.println("Вы на третьем этаже " + currentFloor);
      currentFloor = currentFloor - 1;
    }
  }





  public void moveUp() {

    if (currentFloor > 0)

    {

      System.out.println("Вы на первом этаже " + currentFloor);
      currentFloor= currentFloor + 1;
    }

    if (currentFloor > 1)

    {

      System.out.println("Вы на второмм этаже " + currentFloor);
      currentFloor = currentFloor + 1;
    }

    if (currentFloor > 2)

    {

      System.out.println("Вы на третьем этаже " + currentFloor);
      currentFloor = currentFloor + 1;

    }

  }


  public void move(int floor) {

    if (floor > maxFloor || floor < minFloor) {

      System.out.println("Введенного этажа не существует, никуда не поеду!");
return;
    }
    while (currentFloor != floor )    {
          moveUp();
          moveDown();


        //  System.out.println("Лифт едит вверх " + currentFloor);


        }
       //   while (currentFloor > 1)

        //  {
        //    moveDown();


        //    System.out.println("Лифт едит вниз " + currentFloor);
        //  }


        }

      }



public class Elevator {

  public int getCurrentFloor() {
    return currentFloor;
  }

  public static int currentFloor = 1;
  public int minFloor = 1;
  public int maxFloor = 100;


  public Elevator(int minFloor, int maxFloor) {
    this.minFloor = minFloor;
    this.maxFloor = maxFloor;
  }

  public void moveDown() {


    currentFloor= currentFloor - 1;
      System.out.println("Вы на " + currentFloor + " этаже");
    }







  public void moveUp() {

    currentFloor= currentFloor + 1;
    System.out.println("Вы на " + currentFloor + " этаже");

  }


  public void move(int floor) {

    if (floor > maxFloor || floor < minFloor) {

      System.out.println("Введенного этажа не существует, никуда не поеду!");

    }
    while (currentFloor != floor )    {
          if ( floor > currentFloor ){
            moveUp();}
            if ( floor < currentFloor){
              moveDown();
            }



        //  System.out.println("Лифт едит вверх " + currentFloor);


        }
       //   while (currentFloor > 1)

        //  {
        //    moveDown();


        //    System.out.println("Лифт едит вниз " + currentFloor);
        //  }


        }

      }



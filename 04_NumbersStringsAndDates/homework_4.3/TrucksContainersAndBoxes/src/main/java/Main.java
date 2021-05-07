import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String boxes = scanner.nextLine();

    // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
    // пример вывода при вводе 2
    // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

    int truck = 0;
    int container = 0;
    int box = 0;

    int maxContainer = 12;
    int maxBox = 27;

    int numberBox = maxBox + (int) (Math.random() * maxContainer);
    int numberContainer = maxBox + (int) (Math.random() * maxContainer);
    int numberTruck = maxBox + (int) (Math.random() * maxContainer);
    int sum = box + truck + container;

    int boxCount = Integer.parseInt(boxes);

    for (int boxNumber = 1; boxNumber < boxCount; boxNumber++) {
      System.out.println("Ящик:" + box + "\n" + "Ящик:" + boxNumber);

      if (boxCount != 0) {
        box++;

      }
      continue;


    }


  }

}

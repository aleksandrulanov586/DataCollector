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
    int boxCount = Integer.parseInt(boxes);

    for (int boxNumber = 1; boxNumber <= boxCount; boxNumber++) {
      if (boxNumber % (maxBox * maxContainer) == 1) {
        truck += 1;
        System.out.println("Грузовик: " + truck);
      }
      if (boxNumber % maxBox == 1) {
        container += 1;
        System.out.println("\tКонтейнер: " + container);
      }
      System.out.println("\t\tЯщик: " + boxNumber);
      continue;
    }
    System.out.println(
        "Необходимо:" + "\n" + "грузовиков - " + truck + " шт.\n" + "контейнеров - " + container
            + " шт.");
  }


}






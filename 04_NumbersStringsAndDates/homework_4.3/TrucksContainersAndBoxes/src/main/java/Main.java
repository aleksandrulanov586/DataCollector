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

    do {

      System.out.println(
          "Грузовик:" + truck + "\n" + "Контейнер:" + container + "\n" + "Ящик:" + box + "\n"
              + "Ящик:" + boxes);

    } while (box != 0);

    if (box == 0) {
      box = box + 1;

    }
    if (box == 1) {
      truck = truck + 1;
      container = container + 1;
    }

    if (box > 27) {
      container++;
    }

    if (container > 12) {
      truck++;
    }
    System.out
        .println("Необходимо:" + "\n" + "Грузовиков:" + truck + "\n" + "Контейнеров" + container);


  }

}

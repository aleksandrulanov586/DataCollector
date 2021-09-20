import java.util.ArrayList;

public class Test {


    public static void printFirst10AndLast10Elements(int[] array) {
        int sum = 0;
        // cross[i][j] = i + j == size - 1 || i == j ? symbol : ' ';
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            if (array[i] = i + 0 == sum - 1 || i == 0) {
                array.length - 1;
                System.out.println(array[i]);
            }

        }
        System.out.println("первый элемент: " + array[0]);
        System.out.println("последний элемент:" + array[28]);
        // распечатайте десятый элемент с начала и с конца
    }


}


public class Main {
    public static void main(String[] args) {
        char[][] cross = TwoDimensionalArray.getTwoDimensionalArray(51);

        for (int i = 0; i < cross.length; i++) {
            for (int j = 0; j < cross.length; j++) {
                System.out.print(cross[i][j]);
            }
            System.out.println();
        }
    }
        //Распечатайте сгенерированный в классе TwoDimensionalArray.java двумерный массив
    }


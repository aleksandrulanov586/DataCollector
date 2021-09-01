public class TwoDimensionalArray {
    public static char symbol = 'X';
  private static char[][] cross;


  public static char[][] getTwoDimensionalArray(int size) {


        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

char[][] cross = new char[size][size];

for (int i = 0; i < size; i++ ){
  for (int j = 0; j < size; j++ ) {

      cross[i][j] = i + j == size - 1 || i == j ? symbol : ' ';
  }
      }


      return cross;


    }
}

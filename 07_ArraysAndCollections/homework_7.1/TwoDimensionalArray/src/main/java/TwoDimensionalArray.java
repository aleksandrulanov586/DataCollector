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

              if (j == i) {
                  cross[i][j] = symbol;

              }


      if (i != j) {
          cross[i][j] = ' ';
      }



              //  System.out.println(i);
              // System.out.println(j);
          }
      }


      return cross;


    }
}

public class TwoDimensionalArray {
    public static char symbol = 'X';
  private static char[][] cross;


  public static char[][] getTwoDimensionalArray(int size) {


        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
size = 1;
char[][] cross = new char[size][size];

for (int i = 0; i < size; i++ ){

if (size == 3){
  cross[0][0] = symbol;
  cross[0][1] = ' ';
  cross[0][2] = symbol;
  cross[1][0] = ' ';
  cross[1][1] = symbol;
  cross[1][2] = ' ';
  cross[2][0] = symbol;
  cross[2][1] = ' ';
  cross[2][2] = symbol;
}
  if (size == 1){
    cross[0][0] = symbol;

  }



    for (int j = 0; j < size; j++ ){

      cross[i][j] = symbol;




     //  System.out.println(i);
     // System.out.println(j);
    }
}

    return cross;
       // return new char[0][0];

    }
}

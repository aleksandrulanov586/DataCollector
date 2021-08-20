public class TwoDimensionalArray {
    public static char symbol = 'X';


    public static char[][] getTwoDimensionalArray(int size) {


        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]
size = 3;
char[][] cross = new char[size][size];

for (int i = 0; i < size; i++ ){

  if (i != 3){
   cross[symbol];

  }

    for (int j = 0; j < size; j++ ){

       System.out.println(i);
      System.out.println(j);
    }
}


        return new char[0][0];

    }
}

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

      while (x < 5) {

           x++; //11 33

         // y = y + x; // 00 11 23 36 410


             if (y < 5) {
                 x++;
                 if (y < 3) {
                     x--;
                 }
             }
             /**y = y + 2;
              y = y + 2; //  02 - 14 - 25 - 36 -  47 -
         if (y > 4) {
         y--;
         }**/
         System.out.println(x + " " + y + " ");
         x++;
         }


    }
}

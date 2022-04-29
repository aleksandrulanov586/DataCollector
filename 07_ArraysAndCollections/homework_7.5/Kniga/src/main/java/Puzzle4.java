/**public class Puzzle4 {
    public static void main(String[] args) {
        Puzzle4b[] obs = new Puzzle4b[6];
        int y = 1; //  10  100 1000  10 000 100 000
        int x = 0; //  1
        int result = 0; //

        while (x < 6) {
            obs[x] = new Puzzle4b();

            obs[x].ivar = y;
            y = y * 10;
            x++;
        }
        x = 6;
        while (x > 0) {
            x--;
            result = result + obs[x].doStuff(x);

        }
        System.out.println("Результат " + result);
    }

}

class Puzzle4b {
    int ivar; // 11

    public int doStuff(int factor) { // 500 000 400 000 300 000
        if (ivar > 100) {
            return ivar * factor ;
        } else {
            return ivar * ( 5 - factor) ;
            //33
        }
    }
}**/

import java.util.Random;

public class SimpleDotComGame {
    public static void main(String[] args) {
        SimpleDotCom simpleDotCom = new SimpleDotCom();
        int numOfGuesses = 0;

        for (int q = 0; q <= 4; q++) {
            numOfGuesses = q;
            double w = (int) Math.random() + 1 + 2 + 1;
            int[] e = new int[(int) w];
            simpleDotCom.setLocationCells(e);
            boolean isAlive = true;
            if (simpleDotCom == isAlive)


                if (simpleDotCom.locaionCell[0] == 2) {
                    simpleDotCom.checkYourself("2");
                }


        }
        System.out.println("Вам потребовалось ходов " + numOfGuesses);
    }
}

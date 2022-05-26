public class SimpleDotCom {
    int[] locaionCell;
    int numOfHits = 0;
    public void setLocationCells (int [] locs){
        locaionCell = locs;
    }
    public String checkYourself (String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell:locaionCell
             ) {if (guess == cell){
                 result = "Попал";
                 numOfHits++;
                 break;
        }

        }

        if (numOfHits == locaionCell.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }


}

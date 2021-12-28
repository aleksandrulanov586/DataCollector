/**public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "бутылок (бутылки)";
        while (beerNum > 0){
            if (beerNum == 1 ){
                word = "Бутылка";
            }
            System.out.println(beerNum + " " + word + " " + "пива на стене");
            System.out.println(beerNum + " " + word + " " +"пива.");
            System.out.println(beerNum + " " + word + " " +"Возьми одну");
            System.out.println(beerNum + " " + word + " " + "Пусти по кругу");
            beerNum = beerNum - 1;
            if (beerNum > 0){ // тут ошибка лишний блок кода потому как есть выши
                System.out.println(beerNum + " " + word + " " + "Пива на стене");
            }else{
                System.out.print(beerNum + " " + word + " " + "Нет бутылок пива на стене");
            }
        }
    }
}**/

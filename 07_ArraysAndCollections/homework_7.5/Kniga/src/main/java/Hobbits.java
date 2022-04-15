/**public class Hobbits {
    String name;

    public static void main(String[] args) {
        Hobbits [] h = new Hobbits[4];
        int z = 0 ;
        while ( z < 3 ){
            z++;
            h[z]= new Hobbits();
            h[z].name = "Бильбо";
            if (z==1){
                h[z].name = "Фродо";
            }
            if (z == 2 ){
                h[z].name = "Сэм";
            }
            System.out.println(h[z].name + " - " + "имя хорошего хоббита" );

        }
    }
}**/

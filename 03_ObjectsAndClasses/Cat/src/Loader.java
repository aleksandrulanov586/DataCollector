
public class Loader {
    public static void main(String[] args) {


        Cat murka = new Cat();
        murka.feed((double) 10000);
        int f = 1000;
        do {
            System.out.print(murka.getWeight() + f); f++;
        }
        while (f <= 9000);
        System.out.println("мурка статус " + murka.getStatus());
//=================================================================================================================
      Cat lulu = new Cat();
       lulu.feed((double) 5000);
       int r = 1000;
        do {
            System.out.println(lulu.getWeight() + r); r++;
        }
       while (r <= 9000);
        System.out.println("лулу статус " + lulu.getStatus());
 //=================================================================================================================
        Cat rizhik = new Cat();
        rizhik.meow();
        System.out.println(rizhik.getWeight());
        int m = 1000000;
        do {
         System.out.println(rizhik.getWeight() - m);
         m--;
        }  while (m <= 10000);

        System.out.println("рыжик статус " + rizhik.getStatus ());


             {
        }
    }
}





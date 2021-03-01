
public class Loader {
    public static void main(String[] args) {


        Cat murka = new Cat();
        murka.feed((double) 10000);
         int f = 1000;
        do {
            System.out.print(murka.getWeight() + f);
            f++;
        }
        while (f <= 9000);
        System.out.println("мурка статус " + murka.getStatus());
//======================================================================================================================
        Cat lulu = new Cat();
        lulu.feed((double) 5000);
        int r = 1000;
        do {
            System.out.println(lulu.getWeight() + r);
            r++;
        }
        while (r <= 9000);
        System.out.println("лулу статус " + lulu.getStatus());
 //=====================================================================================================================
        Cat rizhik = new Cat();
        while (!rizhik.getStatus().equals("Dead")) {
            rizhik.meow();
            System.out.println("рыжик статус " + rizhik.getStatus());
//======================================================================================================================
            Cat bars = new Cat();
            bars.drink((double) 5000);
            int d = 1000;
            do {
                System.out.println(lulu.getWeight() + d);
                d++;
            }
            while (r <= 9000);
            System.out.println("барс статус " + bars.getStatus());
//======================================================================================================================
            Cat kuzy = new Cat();
            kuzy.getWeight();
            System.out.println("kuzy статус " + kuzy.getStatus());


            {
            }
        }
    }
}




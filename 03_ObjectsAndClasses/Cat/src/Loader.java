

public class Loader  {


    private static Cat getKitten() {
        return new Cat(1100.0);

    }

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.feed(100.0);
        cat.drink(100.0);
        cat.pee();
        cat.meow();

        Cat copyCat = copy(cat);
        System.out.println("this is copyCat");
        System.out.println(copyCat.weight);
        System.out.println(copyCat.getWeight());
        System.out.println(copyCat.hasTail());
        System.out.println(copyCat.isAlive());
        System.out.println(copyCat.eatenfood());
        System.out.println(copyCat.getStatus());
        System.out.println(copyCat.getWeight());
        System.out.println(copyCat.getColor());

        System.out.println("this is original Cat");
        System.out.println(cat.weight);
        System.out.println(cat.getWeight());
        System.out.println(cat.hasTail());
        System.out.println(cat.isAlive());
        System.out.println(cat.getStatus());
        System.out.println(cat.eatenfood());
        System.out.println(cat.getColor());

//======================================================================================================================

        Cat kitten = getKitten();
        System.out.println(kitten.getWeight());





        //   Cat murka = new Cat();
        //   murka.feed((double) 10000);
        //    int f = 1000;
        //   do {
        //      System.out.print(murka.getWeight() + f);
        //     f++;
        //  }
        //  while (f <= 9000);
        //  System.out.println("мурка статус " + murka.getStatus());
//======================================================================================================================
        //  Cat lulu = new Cat();
        //   lulu.feed((double) 5000);
        //  int r = 1000;
        //   do {
        //        System.out.println(lulu.getWeight() + r);
        //       r++;
        //  }
        //   while (r <= 9000);
        //   System.out.println("лулу статус " + lulu.getStatus());
        //=====================================================================================================================
        //   Cat rizhik = new Cat();


        //  while (!rizhik.getStatus().equals("Dead")) {
        //     rizhik.meow();
        //    System.out.println("рыжик статус " + rizhik.getStatus());
//======================================================================================================================
        //      Cat bars = new Cat();
        //     bars.drink((double) 5000);
        //    int d = 1000;
        //    do {
        //       System.out.println(lulu.getWeight() + d);
        //        d++;
        //    }
        //   while (r <= 9000);
        //  System.out.println("барс статус " + bars.getStatus());
//======================================================================================================================
        // Cat kuzy = new Cat();
        //    kuzy.getWeight();
        //   System.out.println("kuzy статус " + kuzy.getStatus());
//======================================================================================================================
        //       Cat nym = new Cat();
        //       nym.feed((double) 0);
        //       System.out.println(nym.getWeight());
        //      nym.pee();
        //      nym.pee();
        //       System.out.println(nym.getWeight());
        //       System.out.println(nym.eatenfood());

        //       {
        //           System.out.println("ням облегчилась " + nym.getStatus());
        //      }

        //     Cat nym = new Cat();
        //     Cat kuzy = new Cat();
        //      Cat bars = new Cat();
        //      Cat rizhik = new Cat();
//======================================================================================================================
        //      System.out.println(Cat.сatcount());
        //      while (nym.getWeight() > 1000)
        //          nym.meow();
        //      System.out.println("nym вес:" + nym.getWeight() + nym.getStatus());
        //     System.out.println(Cat.сatcount());
//======================================================================================================================

        //     System.out.println(Cat.сatcount());
        //     while (kuzy.getWeight() < 1000)
        //         kuzy.meow();
        //     System.out.println("кузя вес:" + kuzy.getWeight() + kuzy.getStatus());
        //    System.out.println(Cat.сatcount());

//======================================================================================================================

        //     System.out.println(nym.getWeight());
        //     bars.feed((double) 10000);
        //     bars.drink((double) 10000);
        //     bars.pee();
        //     int r = 1000;
        //      do {
        //         System.out.println(bars.getWeight() + r);
        //         r++;
        //         if (bars.catdead() == (bars.catexploded())) ;
        //          break;
        //      }
        //      while (r <= 9000);
        //         System.out.println("барс статус " + bars.getStatus ());
        //     System.out.println(bars.getWeight());
        //     System.out.println(bars.getWeight());


//======================================================================================================================


        //  Cat nym = new Cat("ням");
        //  System.out.println(nym.getWeight());


        //      Cat kuzy = new Cat();
        //       Cat kuzy2 = Cati(kuzy);

        //       kuzy.setCloname("кузя");
        //     kuzy2.setCloname("кузя 2");
        //      System.out.println(kuzy.getName());
        //     System.out.println(kuzy2.getName());

        //  }

        //   public static Cat Cati (Cat kuzy2) {
        //      Cat kuzyclo = null;
        //      try {
        //          kuzyclo = kuzy2.clone();
        //       } catch (CloneNotSupportedException e) {
        //          e.printStackTrace();
        //     }
        //       return kuzyclo;


    }


    public static Cat copy(Cat original) {


        Cat catCopy = new Cat();

        catCopy.weight = original.weight;
        catCopy.name = original.name;
        catCopy.foodWeight = original.foodWeight;
        catCopy.setColor(original.getColor());
        return catCopy;


    }


    //         Cat kuzy = new Cat();
    //         Cat copy = (kuzy);

    //           kuzy.setCloname("кузя");
    //         copy.setCloname("кузя 2");
    //           System.out.println(kuzy.getName());
    //         System.out.println(copy.getName());

    //     Cat kuzyclo = null;
    //      try {
    //          kuzyclo = (Cat original) copy.clone();
    //      } catch (CloneNotSupportedException e) {
    //          e.printStackTrace();
    //      }
    //      return kuzyclo;


}


















public class Cat {

    public static final int EYES = 2;
    public static final int MINWEIGHT = 1200;
    public static final int MAXWEIGHT = 9000;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodWeight;
    private static int count = 0;
    private double alive;
    private double dead;
    private double exploded;
    private String name;
    private double mingetKitten;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodWeight = 250.0;
        mingetKitten = 1100.0;

    }




    public Cat (String name  )
    {
        this();


      this.name = name;


    }
    public Cat (double catWeight)
    {
        this.weight = catWeight;
        this.mingetKitten = catWeight;
    }



        public String getName()

        {
            return name;
        }



    {

    }

    public void pee() {
        weight = weight - 1;
        System.out.println("pee");
    }


    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        foodWeight = foodWeight + amount;
    }

    public static int сatcount() {
        return count;

    }



    public void drink(Double amount) {
        weight = weight + amount;
    }


        public Double catlive ()
        {
            return alive;
        }

    public Double catdead()
    {
        return dead;
    }
    public Double catexploded()
    {
        return exploded;
    }

    public Double getWeight()
    {
        return weight;
    }

    public Double eatenfood()
    {
        return foodWeight;
    }

    public String getStatus() {


        {
            {
                if (weight < minWeight) {
                    count--;
                } else if (weight > maxWeight) ;
                {
                    count++;
                }


                {
                    if (minWeight < weight) {
                        count--;
                    } else if (maxWeight > weight) ;
                    {
                        count++;
                    }
                }
            }

            if (weight < minWeight) {
                return "Dead";
            } else if (weight > maxWeight) {
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";

            }
        }


    }
}
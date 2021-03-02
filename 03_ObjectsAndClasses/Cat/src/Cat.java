
public class Cat {


    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double foodWeight;
    private static int count = 0;


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodWeight = 250.0;


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
    public static int сatcount()
    {
        return count;

    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public Double eatenfood() {
        return foodWeight;
    }

    public String getStatus() {




        {


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
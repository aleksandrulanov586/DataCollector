
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

    private double exploded;
    private String name;
    private double mingetKitten;
    private CatColor GREEN;
    private CatColor BLACK;
    private CatColor RED;

    private boolean alive;
    private boolean isAlive;
    private boolean thereistail;
    private boolean hasTail;

    public CatColor getRED() {
        return RED;
    }

    public void setRED(CatColor newRED) {
        RED = newRED;
    }


    public CatColor getBLACK() {
        return BLACK;
    }

    public void setBLACK(CatColor newBLACK) {
        BLACK = newBLACK;
    }

    public CatColor getGREEN() {
        return GREEN;
    }

    public void setGREEN(CatColor newGREEN) {
        GREEN = newGREEN;
    }


    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        foodWeight = 250.0;
        mingetKitten = 1100.0;
    }

    public Cat(double catWeight) {
        this();
        this.originWeight = weight;
        this.weight = weight;

    }


    public Cat(String name) {


        this.name = name;


    }


    public String getName() {
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


    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive (boolean alive) {
        isAlive = alive;
    }

    public boolean hasTail() {
        return hasTail;
    }

    public void SetHasnoTail (boolean hasTail) {
        this.hasTail = hasTail;
    }


    public Double catexploded() {
        return exploded;
    }

    public Double getWeight() {
        return weight;
    }

    public Double eatenfood() {
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

public class Cat
{

    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double eatenfeed;



    public Cat()
    {
        weight = 50.0 + 50.0 ;
        originWeight = weight;
        minWeight = 100.0;
        maxWeight = 150.0;

    }
    public void pee()
    {
        weight = weight - 1;
        System.out.println("pee");
    }
    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()

    {


        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}
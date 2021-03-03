package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    public String getNumber()
    {
        return number;
    }
    public void setNumber(String newNumber)
    {
        number = newNumber;
    }

    public int getHeighth()
    {
        return height;
    }
    public void setHeigh (int newHeight)
    {
        height = newHeight;
    }

    public double setWeightt ()
    {
        return weight;
    }
    public void setWeight (double newWeight)
    {
        weight = newWeight;

    }
    public boolean setHasVehicle ()
    {
        return hasVehicle;
    }
    public void setHasVehicle (boolean newHasVehicle)
    {
        hasVehicle = newHasVehicle;
    }


        public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}


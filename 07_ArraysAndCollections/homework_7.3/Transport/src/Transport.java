public class Transport {
    boolean isPassenger = false;
    double weight = 50;
    int wheelsCount = 4;
    double maxSpeed = 60;
    boolean isEngineStarted = false;


    public Transport(boolean isPassenger, double weight, int wheelsCount, double maxSpeed) {
        this.isPassenger = isPassenger;
        this.weight = weight;
        this.wheelsCount = wheelsCount;
        this.maxSpeed = maxSpeed;
    }

    public void startEngine() {
        if (weight <= 0 && wheelsCount == 4 || maxSpeed <= 60.0) {
            isEngineStarted = true;
            System.out.println("Двигатель заведён");
        } else {

            System.out.println("Машина стоит на месте");
        }


    }

    public double shortestTimeToTravel(double distance) {

        return distance / maxSpeed;
    }
}

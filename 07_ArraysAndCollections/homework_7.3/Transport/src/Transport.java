public class Transport {
    boolean isPassenger ;
    double weight ;
    int wheelsCount ;
    double maxSpeed ;
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
    public double movingTime (double a, double b) {

        return a * b;
    }
}

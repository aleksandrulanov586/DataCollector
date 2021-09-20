public class Transport {
    boolean isPassenger;
    double weight;
    int wheelsCount;
    double maxSpeed = 200.0;
    boolean isEngineStarted = false;


    public Transport(boolean isPassenger, double weight, int wheelsCount) {
        this.isPassenger = isPassenger;
        this.weight = weight;
        this.wheelsCount = wheelsCount;
    }

    public void startEngine() {
        if (weight > 0 && wheelsCount == 4) {
            isEngineStarted = true;
            System.out.println("Двигатель заведён");
        } else {

            System.out.println("Машина стоит на месте");
        }


    }

    public double shortestTimeToTravel(int distance) {

        return;
    }
}

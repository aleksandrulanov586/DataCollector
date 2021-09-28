public class Main {
    public static void main(String[] args) {
        // Transport transport = new Transport(true, 100, 4, 150);

        // System.out.println(transport.shortestTimeToTravel(1225));
        // transport.startEngine();
        CargoTransport cargoTransport = new CargoTransport(false, 50, 4, 80);
        System.out.println(cargoTransport.shortestTimeToTravel(1225));
       // cargoTransport.startEngine();
        CargoTransport cargoTransport1 = new CargoTransport(false, 50, 6, 90);
        cargoTransport1.startEngine();
        System.out.println(cargoTransport.movingTime(30,60));
    }
}

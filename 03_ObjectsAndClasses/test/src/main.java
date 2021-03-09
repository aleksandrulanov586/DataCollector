import com.skillbox.airport.Airport;

import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main(String[] args) {



        Airport airoport = Airport.getInstance();

        System.out.println("список " + airoport.getAllAircrafts().size());
        Airport airport = Airport.getInstance();
       // int aircraftAmount = airport.getAllAircrafts().size();
       // System.out.println(aircraftAmount);



    }


}

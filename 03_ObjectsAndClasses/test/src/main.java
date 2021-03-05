import com.skillbox.airport.Airport;

import java.util.ArrayList;
import java.util.List;

public class main<getInstance> {
    public static void main(String[] args) {

        Airport airoport = Airport.getInstance();
        airoport.getTerminals();
        System.out.println("список " + airoport.getAllAircrafts());
        List<String> list = new ArrayList<String>();
        list.add("Boeing");
        list.add("Airbus");
        System.out.println("Before operation: " + list);
        list.size();
        int size = list.size();
        System.out.println("Size of list = " + size);


    }


}

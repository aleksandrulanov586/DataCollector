

import core.Line;
import core.Station;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {
    RouteCalculator routeCalculator = new RouteCalculator(new StationIndex());



    List<Station> stations;


    @Override
    protected void setUp() throws Exception {
        stations = new ArrayList<>();

        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Вторая");
Station station = new Station("Петровская", line);
        stations.add(new Station("Петровская", line));
        stations.add(new Station("Морковна", line2));
        stations.add(new Station("Морковна", line3));

    }


    public void testcalculateDuration() throws Exception {
        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");

        Station station1 = new Station("Петровская", line);
        Station station2 = new Station("Петровская", line2);
       Station station3 = new Station("Морковна",line3 );



        Station actual = (Station) routeCalculator.getShortestRoute( station1 ,  station2);

        assertEquals(station1, actual);


    }






    
    @Override
    protected void tearDown() throws Exception {

    }

}



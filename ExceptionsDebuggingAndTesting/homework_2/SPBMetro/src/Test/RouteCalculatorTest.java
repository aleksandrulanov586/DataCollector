

import core.Line;
import core.Station;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {
    RouteCalculator routeCalculator = new RouteCalculator(new StationIndex());



    List<Station> stations;
    List<Station> stations2;

    @Override
    protected void setUp() throws Exception {
        stations = new ArrayList<>();
        stations2 = new ArrayList<>();
        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Вторая");
Station station = new Station("Петровская", line);
        stations.add(new Station("Петровская", line));
        stations2.add(new Station("Морковна", line2));
        stations.add(new Station("Морковна", line3));

    }


    public void testcalculateDuration() throws Exception {
        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Вторая");
        Station station = new Station("Петровская", line);
        Station station2 = new Station("Петровская", line);
       String station1 = "Морковна";
        String station2  =   "Петровская";

        // Station Station = " dsdsad";
        Station actual = routeCalculator.getShortestRoute( station ,  station2);

        assertEquals(station1, actual);


    }






    
    @Override
    protected void tearDown() throws Exception {

    }

}



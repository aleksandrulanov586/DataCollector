

import core.Line;
import core.Station;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import org.junit.Test;

public class RouteCalculatorTest extends TestCase {
    RouteCalculator routeCalculator = new RouteCalculator(new StationIndex());

    List<Station> stations;

    @Override
    protected void setUp() throws Exception {
        stations = new ArrayList<>();

         Line line = new Line(1, "Первая");
         Line line2 = new Line(2, "Вторая");
         Line line3 = new Line(3, "Вторая");

         stations.add(new Station("Петровская", line));
         stations.add(new Station("Арбузная", line));
         stations.add(new Station("Морковна", line2));
         stations.add(new Station("Морковна", line3));

    }


     public void testcalculateDuration() throws Exception {
         double expected = 9.5;
         double actual = RouteCalculator.calculateDuration(stations);

         assertEquals(expected, actual);


    }

    public void testgetShortestRouteNull() throws Exception {


        Station actual = (core.Station) routeCalculator.getShortestRoute("sss");
        assertNull(actual);


    }

    @Override
    protected void tearDown() throws Exception {

    }

}



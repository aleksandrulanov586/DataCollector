

import core.Line;
import core.Station;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {
    RouteCalculator routeCalculator = new RouteCalculator(new StationIndex());


    List<Station> stations;
    List<Station> stations1;

    @Override
    protected void setUp() throws Exception {
        stations = new ArrayList<>();
        stations1 = new ArrayList<>();
        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Вторая");

        stations.add(new Station("Петровская", line));
        stations1.add(new Station("Морковна", line2));
        stations.add(new Station("Морковна", line3));

    }


    public void testcalculateDuration() throws Exception {


        Station Station = null;
        String station1 = (Station) + "Петровская";

        Station actual = (Station) routeCalculator.getShortestRoute((core.Station) stations, (core.Station) stations1);

        assertEquals(station1, actual);


    }

    public void testgetShortestRouteReflection() throws Exception {
        try {

            Method method = RouteCalculator.class.getDeclaredMethod("getShortestRoute", Station.class);
            method.setAccessible(true);
            assertEquals(method.invoke(routeCalculator.toString(), " "));
        } catch (Exception exception) {
            e
        }


    }


    @Override
    protected void tearDown() throws Exception {

    }

}



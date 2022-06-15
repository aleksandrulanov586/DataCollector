

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
        Line line3 = new Line(2, "Вторая");
        stations.add(new Station("Петровская", line));
        stations.add(new Station("Арбузная", line));
        stations.add(new Station("Морковна", line2));
        stations.add(new Station("Морковна", line3));

    }

    @Test
    public void calculateDuration() throws Exception {
        double expected = 9.5;
        double actual = RouteCalculator.calculateDuration(stations);

        assertEquals(expected, actual);


    }
    public void testgetShortestRouteNull() throws Exception {

        ArrayList<String> route = new ArrayList<>();
        Station actual = (Station) routeCalculator.getShortestRoute((Station) stations, (Station) stations);
        assertNull(String.valueOf(route), actual);


    }
    @Override
    protected void tearDown() throws Exception {

    }

}



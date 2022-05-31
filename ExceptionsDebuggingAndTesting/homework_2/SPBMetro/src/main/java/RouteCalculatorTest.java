import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class RouteCalculatorTest extends TestCase {

    List<Station> stations;

    @Test
    public void setUp() throws Exception {
        stations = new ArrayList<>();
        Line line = new Line(1, "1");
        Line line2 = new Line(2, "2");
        Line line3 = new Line(3, "3");
        stations.add(new Station("AAsasS", line));
        stations.add(new Station("AAsasS", line2));
        stations.add(new Station("AAsasS", line3));

    }

    public void testgetShortestRoute() throws Exception {
        double current = RouteCalculator.ShortestRoute();
        double t = 3;
        assertEquals(t, current);


    }
}

package Test;

import core.Line;
import core.Station;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;
import core.;
import core.*;
public class RouteCalculatorTest extends TestCase {
RouteCalculator

    List<Station> stations;

    @Override
    protected void setUp() throws Exception {
        stations = new ArrayList<>();
        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");

        stations.add(new Station("Петровская", line));
        stations.add(new Station("Арбузная", line));
        stations.add(new Station("Морковна", line2));
        stations.add(new Station("Морковна", line2));

    }

    @Test
    public void calculateDuration() throws Exception {

        double actual = RouteCalculator.getShortestRoute();
        double expected = 8.5;
        assertEquals(expected, actual);


    }

    @Override
    protected void tearDown() throws Exception {

    }

}



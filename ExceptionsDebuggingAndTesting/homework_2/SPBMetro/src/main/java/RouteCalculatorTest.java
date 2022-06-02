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



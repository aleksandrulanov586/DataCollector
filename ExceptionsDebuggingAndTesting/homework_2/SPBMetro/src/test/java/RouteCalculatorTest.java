

import core.Line;
import core.Station;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {
    StationIndex stationIndex = new StationIndex();
    RouteCalculator routeCalculator = new RouteCalculator(stationIndex);


    List<Station> route = new ArrayList<>();


    @Override
    protected void setUp() throws Exception {


        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");


        Station station1 = new Station("Петровская", line);
        Station station2 = new Station("Петровская", line2);
        Station station3 = new Station("Морковна", line3);
        Station station4 = new Station("Морковна", line3);

        List<Station> transfer1 = new ArrayList<>();
        List<Station> transfer2 = new ArrayList<>();
        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);

        stationIndex.addConnection(transfer1);
        stationIndex.addConnection(transfer2);
testcalculateDuration(station1, station2, station3, station4 );
    }


    public void testcalculateDuration(Station station1,Station station2,Station station3,Station station4 ) throws Exception {




        List<Station> actual = routeCalculator.getShortestRoute(station1, station4);
        List<Station> expected = List.of(station1, station2, station3, station4);
        assertEquals(expected, actual);


    }


    @Override
    protected void tearDown() throws Exception {

    }

}



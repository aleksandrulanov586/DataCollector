

import core.Line;
import core.Station;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class RouteCalculatorTest extends TestCase {

    StationIndex stationIndex = new StationIndex();
    RouteCalculator routeCalculator = new RouteCalculator(stationIndex);

    List<Station> transfer1 = new ArrayList<>();
    List<Station> transfer2 = new ArrayList<>();


    @Override
    protected void setUp() throws Exception {


        Line line = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");


        Station station1 = new Station("Лесная", line);
        Station station2 = new Station("Достоевская", line);
        Station station3 = new Station("Сенная площадь", line);
        Station station4 = new Station("Гостиный двор", line);
        Station station5 = new Station("Девяткино", line);

        Station station6 = new Station("Гражданский проспект", line2);
        Station station7 = new Station("Академическая", line2);
        Station station8 = new Station("Политехническая", line2);
        Station station9 = new Station("Площадь Мужества", line2);
        Station station10 = new Station("Чёрная речка", line2);


        line.addStation(station1);
        line.addStation(station2);
        line.addStation(station3);
        line.addStation(station4);
        line.addStation(station5);

        line2.addStation(station6);
        line2.addStation(station7);
        line2.addStation(station8);
        line2.addStation(station9);
        line2.addStation(station10);


        stationIndex.addLine(line);
        stationIndex.addLine(line2);


        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);

        stationIndex.addStation(station6);
        stationIndex.addStation(station7);
        stationIndex.addStation(station8);
        stationIndex.addStation(station9);
        stationIndex.addStation(station10);


        transfer1.add(station7);
        transfer1.add(station3);
        stationIndex.addConnection(transfer1);


    }


    public void testcalculateDuration() throws Exception {
        double expectedTime = 10.0;

        Line line = stationIndex.getLine(1);


        List<Station> stations = line.getStations();


        Station station = stations.get(0);
        Station station2 = stations.get(4);


        List<Station> actualTime = routeCalculator.getShortestRoute(station, station2);
        double actual = RouteCalculator.calculateDuration(actualTime);

        assertEquals(expectedTime, actual);


    }

    public void testcalculateDuration2() throws Exception {

        Line line = stationIndex.getLine(1);


        List<Station> stations = line.getStations();


        Station station = stations.get(0);
        Station station2 = stations.get(4);

        Station station3 = stations.get(1);
        Station station4 = stations.get(2);
        Station station5 = stations.get(3);

        List<Station> actual = routeCalculator.getShortestRoute(station, station2);
        List<Station> expected = List.of(station, station3, station4, station5, station2);
        assertEquals(expected, actual);

    }

    public void testcalculateDuration3() throws Exception {


        double expectedTime = 13.5;

        Line line = stationIndex.getLine(1);
        Line line2 = stationIndex.getLine(2);

        List<Station> stations = line.getStations();
        List<Station> stations2 = line2.getStations();

        Station station = stations.get(1);
        Station station2 = stations2.get(4);


        List<Station> actualTime = routeCalculator.getShortestRoute(station, station2);
        double actual = RouteCalculator.calculateDuration(actualTime);

        assertEquals(expectedTime, actual);

    }

    @Override
    protected void tearDown() throws Exception {

    }

}



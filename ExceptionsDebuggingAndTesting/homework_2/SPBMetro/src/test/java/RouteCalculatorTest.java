

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
        Station station2 = new Station("Достоевская", line3);
        Station station3 = new Station("Сенная площадь", line2);
        Station station4 = new Station("Гостиный двор", line3);
        Station station5 = new Station("Девяткино", line3);
        Station station6 = new Station("Гражданский проспект", line);
        Station station7 = new Station("Академическая", line3);
        Station station8 = new Station("Политехническая", line2);
        Station station9 = new Station("Площадь Мужества", line3);
        Station station10 = new Station("Лесная", line3);
        Station station11 = new Station("Выборгская", line);
        Station station12 = new Station("Площадь Ленина", line3);
        Station station13 = new Station("Чернышевская", line2);
        Station station14 = new Station("Площадь Восстания", line3);
        Station station15 = new Station("Владимирская", line3);

        line.addStation(station1);
        line.addStation(station2);
        line.addStation(station3);
        line.addStation(station4);
        line.addStation(station5);
        line.addStation(station6);
        line.addStation(station7);
        line.addStation(station8);
        line.addStation(station9);
        line.addStation(station10);
        line.addStation(station11);
        line.addStation(station12);
        line.addStation(station13);
        line.addStation(station14);
        line.addStation(station15);

        stationIndex.addLine(line);
        stationIndex.addLine(line2);
        stationIndex.addLine(line3);

        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);
        stationIndex.addStation(station7);
        stationIndex.addStation(station8);
        stationIndex.addStation(station1);
        stationIndex.addStation(station2);
        stationIndex.addStation(station3);
        stationIndex.addStation(station4);
        stationIndex.addStation(station5);
        stationIndex.addStation(station6);
        stationIndex.addStation(station7);
        stationIndex.addStation(station8);

        stationIndex.addConnection(transfer1);
        stationIndex.addConnection(transfer2);

        transfer1.add(station2);
        transfer2.add(station3);
    }


    public void testcalculateDuration() throws Exception {


        Line line = stationIndex.getLine(1);
        Line line2 = stationIndex.getLine(2);
        Line line3 = stationIndex.getLine(3);
        List<Station> stations = line.getStations();
        List<Station> stations2 = line2.getStations();
        List<Station> stations3 = line3.getStations();
        Station station = stations.get(1);
        Station station2 = stations2.get(2);
        Station station3 = stations3.get(3);

        List<Station> actual = routeCalculator.getShortestRoute(station, station2);
        List<Station> expected = List.of(station, station2, station3);
        assertEquals(expected, actual);


    }


    @Override
    protected void tearDown() throws Exception {

    }

}



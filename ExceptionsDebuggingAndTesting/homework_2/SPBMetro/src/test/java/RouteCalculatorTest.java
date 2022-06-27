

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


        List<Station> actual = routeCalculator.getShortestRoute(stationIndex.getLine(1));
        List<Station> expected = List.of(station1, station2, station3, station4);
        assertEquals(expected, actual);


    }


    @Override
    protected void tearDown() throws Exception {

    }

}



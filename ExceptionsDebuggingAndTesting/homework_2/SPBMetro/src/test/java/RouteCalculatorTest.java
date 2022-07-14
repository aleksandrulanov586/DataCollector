

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

        Station station11 = new Station("Выборгская", line3);
        Station station12 = new Station("Площадь Ленина", line3);
        Station station13 = new Station("Чернышевская", line3);
        Station station14 = new Station("Площадь Восстания", line3);
        Station station15 = new Station("Владимирская", line3);


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

        line3.addStation(station11);
        line3.addStation(station12);
        line3.addStation(station13);
        line3.addStation(station14);
        line3.addStation(station15);

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
        stationIndex.addStation(station9);
        stationIndex.addStation(station10);

        stationIndex.addStation(station11);
        stationIndex.addStation(station12);
        stationIndex.addStation(station13);
        stationIndex.addStation(station14);
        stationIndex.addStation(station15);

        transfer1.add(station7);
        transfer1.add(station3);
        stationIndex.addConnection(transfer1);
        transfer2.add(station13);
        transfer2.add(station9);
        stationIndex.addConnection(transfer2);


    }


    public void testcalculateDuration() throws Exception {
        double expectedTime = 10.0;

        Line line = stationIndex.getLine(1);


        List<Station> stations = line.getStations();


        Station forest = stations.get(0);
        Station devyatkina = stations.get(4);


        List<Station> actualTime = routeCalculator.getShortestRoute(forest, devyatkina);
        double actual = RouteCalculator.calculateDuration(actualTime);

        assertEquals(expectedTime, actual);


    }

    public void testshortestRoute() throws Exception {

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

        Station blackRiver = stations.get(1);
        Station dostoevsky = stations2.get(4);


        List<Station> actualTime = routeCalculator.getShortestRoute(blackRiver, dostoevsky);
        double actual = RouteCalculator.calculateDuration(actualTime);

        assertEquals(expectedTime, actual);

    }

    public void testcalculateDurationTwoTransfers() throws Exception {


        double expectedTime = 22.0;

        Line line = stationIndex.getLine(1);
        Line line3 = stationIndex.getLine(3);

        List<Station> stations = line.getStations();
        List<Station> stations3 = line3.getStations();

        Station forest = stations.get(0);

        Station vladimirovskaya = stations3.get(4);

        List<Station> actualTime = routeCalculator.getShortestRoute(forest, vladimirovskaya);
        double actual = RouteCalculator.calculateDuration(actualTime);

        assertEquals(expectedTime, actual);

    }

    public void testshortestRouteTwoTransfers() throws Exception {

        Line line = stationIndex.getLine(1);
        Line line2 = stationIndex.getLine(2);
        Line line3 = stationIndex.getLine(3);

        List<Station> StationsOfLine1 = line.getStations();
        List<Station> StationsOfLine2 = line2.getStations();
        List<Station> StationsOfLine3 = line3.getStations();


        Station forest = StationsOfLine1.get(0);
        Station vladimirovskaya = StationsOfLine3.get(4);

        Station dostoevsky = StationsOfLine1.get(1);

        Station sennapLoschad = StationsOfLine1.get(2);
        Station academic = StationsOfLine2.get(1);

        Station polytechnic = StationsOfLine2.get(2);
        Station courageSquare = StationsOfLine2.get(3);
        Station chernyshevskaya = StationsOfLine3.get(2);
        Station vosstaniyaSquare = StationsOfLine3.get(3);

        List<Station> actual = routeCalculator.getShortestRoute(forest, vladimirovskaya);
        List<Station> expected = List.of(forest, dostoevsky, sennapLoschad, academic, polytechnic, courageSquare, chernyshevskaya, vosstaniyaSquare, vladimirovskaya);
        assertEquals(expected, actual);

    }

    @Override
    protected void tearDown() throws Exception {

    }

}



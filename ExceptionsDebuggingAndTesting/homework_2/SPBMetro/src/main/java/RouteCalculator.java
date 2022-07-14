import core.Station; // имортируем пакеты

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class RouteCalculator { // создаем класс

    private final StationIndex stationIndex; // ссылка на обьект

    private static final double INTER_STATION_DURATION = 2.5; // константа со значением
    private static final double INTER_CONNECTION_DURATION = 3.5;

    public RouteCalculator(StationIndex stationIndex) { // конструктор с аргемунтом класса stationIndex
        this.stationIndex = stationIndex; // this говорит о том что имеется ввиду именно эта переменная
    }


    public List<Station> getShortestRoute(Station from, Station to) {
        List<Station> route = getRouteOnTheLine(from, to);
        if (route != null && route.size() != 0 ) { // проверка является ли коллекция которая переданные в метод пустой
            return route; // если нет то вернуть коллекцию
        }

        route = getRouteWithOneConnection(from, to);
        if (route != null && route.size() != 0  ) {
            return route;// если нет то вернуть коллекцию
        }

        route = getRouteWithTwoConnections(from, to); // еще одна ссылка на передачу в третий метод
        return route; // и после этого возвращаем его
    }

    public static double calculateDuration(List<Station> route) { // создаем статический метод который возвращает значение с плавующий точкой с аргуметом коллекции
        double duration = 0; // создаем переменную со значением 0
        Station previousStation = null; // создаем переменную со значением null
        for (int i = 0; i < route.size(); i++) { // создаем массив перебора по коллекции аргумента
            Station station = route.get(i); // создаем ссылку на обьект и ложем ее в коллекцию аргумента которая будет возвращать колличество стацний
            if (i > 0) { // проверка пока переменная в цикле равна больше 0
                duration += previousStation.getLine().equals(station.getLine()) ? // то ложится в переменную сравнения null с 0
                        INTER_STATION_DURATION : INTER_CONNECTION_DURATION; // если совпадения тру то ложим в переменную  2.5 если нет то 3.5
            }
            previousStation = station; // null присваивается и ложим в коллекцию? Не совсем понятно зачем?
        }
        return duration; // возвращаем значение переменной после цикла
    }

    private List<Station> getRouteOnTheLine(Station from, Station to) {

        if (!from.getLine().equals(to.getLine())) { // проверка два пункта назначения, если  откуда и куда не одинаковые
            return null; // то возвращаем null
        }

        List<Station> route = new ArrayList<>(); // создаем новую коллекцию
        List<Station> stations = from.getLine().getStations(); // ссылка на коллекцию с возвращением станции и линии
        int direction = 0;
        for (Station station : stations) { // цикл foreach
            if (direction == 0) { // проверка если направления равна 0
                if (station.equals(from)) { // то мы сравниваем станцию откуда
                    direction = 1; // если две проверки совпали то направления равна 0
                } else if (station.equals(to)) { // проверка сравнения станции и куда
                    direction = -1; // если совпала то направления - 1
                }
            }

            if (direction != 0) { //если направление на равна 0
                route.add(station); // то добавляем в коллекцию станцию
            }

            if ((direction == 1 && station.equals(to)) ||// если направление равно 1 ии станция равна равна направлению куда
                    (direction == -1 && station.equals(from))) {  // или направления равна - 1 и станция станция равна откуда
                break;        // то конец выполнения кода
            }
        }
        if (direction == -1) { // если направления равна минус 1
            Collections.reverse(route); // то меняем порядок коллекции на обратный
        }
        return route;
    }

    private List<Station> getRouteWithOneConnection(Station from, Station to) {
        if (from.getLine().equals(to.getLine())) { // если пункт назначения откуда и куда равна, то возвращаем null
            return null;
        }

        List<Station> route = new ArrayList<>();

        List<Station> fromLineStations = from.getLine().getStations();// ссылка на коллекцию станцию передаем два метода
        List<Station> toLineStations = to.getLine().getStations();
        for (Station srcStation : fromLineStations) { // цикл на первую ссылку перебор "откуда"
            for (Station dstStation : toLineStations) {// цикл на вторую ссылку перебор "куда"
                if (isConnected(srcStation, dstStation)) { // помещаем в метод isConnected
                    ArrayList<Station> way = new ArrayList<>(); // после чего создаем нувую коллекцию
                    way.addAll(getRouteOnTheLine(from, srcStation)); // добавлаем в коллекцию из других коллекций после работы метода
                    way.addAll(getRouteOnTheLine(dstStation, to));
                    if (route.isEmpty() || route.size() > way.size()) { // если коллекция route пустая или больше коллекции way
                        route.clear(); // то отчищаем коллекцию route
                        route.addAll(way);// и добавляем все из коллекции way
                    }
                }
            }
        }
        return route;// после чего возвращем коллекцию route
    }

    private boolean isConnected(Station station1, Station station2) { // создаем приватный метод который возвращем логическое выражения
        Set<Station> connected = stationIndex.getConnectedStations(station1); // ссылка на метод getConnectedStations в классе stationIndex который выполняет сравнения ключи в дереве если не совпадает возвращает пустое дерево
        return connected.contains(station2); // возвращаем результат работы ссылки connected и сравнивает со станцией 2
    }

    private List<Station> getRouteViaConnectedLine(Station from, Station to) {// приватный метод
        Set<Station> fromConnected = stationIndex.getConnectedStations(from);//ссылка на метод getConnectedStations в классе stationIndex который выполняет сравнения ключи "Откуда" в дереве если не совпадает возвращает пустое дерево
        Set<Station> toConnected = stationIndex.getConnectedStations(to);
        for (Station srcStation : fromConnected) {
            for (Station dstStation : toConnected) {
                if (srcStation.getLine().equals(dstStation.getLine())) { // сравниваем два пункта откуда и куда
                    return getRouteOnTheLine(srcStation, dstStation);// если они не одинаковые возвращаем null
                }
            }
        }
        return null;
    }

    private List<Station> getRouteWithTwoConnections(Station from, Station to) {
        if (from.getLine().equals(to.getLine())) { //  сравнения два пункта откуда и куда
            return null; // если одинаковые то возвращаем null
        }

        ArrayList<Station> route = new ArrayList<>();

        List<Station> fromLineStations = from.getLine().getStations();// ссылка на два метода  где возврает станию и линию
        List<Station> toLineStations = to.getLine().getStations();

        for (Station srcStation : fromLineStations) {
            for (Station dstStation : toLineStations) {
                List<Station> connectedLineRoute =
                        getRouteViaConnectedLine(srcStation, dstStation); // ссылка(коллекции) на метод где сравниваем и передаем туда перебор двух циклов в коллекциях
                if (connectedLineRoute == null) { // сравниваем ссылку с null
                    continue;// null пропускается и программа продолжает работать дальше
                }
                List<Station> way = new ArrayList<>();
                way.addAll(getRouteOnTheLine(from, srcStation));// добавляем все в новый созданную коллекцию после того как передадим "откуда" c переборам цикла
                way.addAll(connectedLineRoute); // Добавляем все в коллекцию из ссылки коллекции
                way.addAll(getRouteOnTheLine(dstStation, to));
                if (route.isEmpty() || route.size() > way.size()) { // проверка если коллекция  пустая или она больше чем другая коллекция
                    route.clear(); //то отчищаем колекцию
                    route.addAll(way);// после чего добавляем все из одной коллекции в другую
                }
            }
        }

        return route;
    }
}
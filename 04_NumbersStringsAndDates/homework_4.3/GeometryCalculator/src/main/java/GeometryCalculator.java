public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double radis = 3;
        double area = Math.PI * (radis * radis);
        System.out.println("Площадь круга равна: " + area);
        double circumference= Math.PI * 2*radis;
        System.out.println("Длины окружности равна: " + circumference) ;
        return 0;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        return 0;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        return 0;
    }

}

public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        double radis = 0 ;
        double area = Math.PI * (radis * radis);

        return area;
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

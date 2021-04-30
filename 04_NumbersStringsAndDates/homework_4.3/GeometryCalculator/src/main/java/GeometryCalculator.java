public class GeometryCalculator {
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {

        double area = Math.PI * (radius * radius);

        return area;
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        //Площадь треугольника по основанию и высоте
double area  = radius / radius * Math.PI;
        return area;
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a + b >= c) {
            if (c + b >= a)
                if (a + c >= b);
        }
        return false;
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
//double halfMeter = 0;
        double halfMeter = (a + b + c) / 2;
        double area = halfMeter * (halfMeter - a - b - c);


        return -1.0;

    }

}

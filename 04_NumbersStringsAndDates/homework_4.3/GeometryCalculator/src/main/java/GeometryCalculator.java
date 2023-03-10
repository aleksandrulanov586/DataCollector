public class GeometryCalculator {

  // метод должен использовать абсолютное значение radius
  public static double getCircleSquare(double radius) {

    double area = Math.PI * (radius * radius);

    return area;
  }

  // метод должен использовать абсолютное значение radius
  public static double getSphereVolume(double radius) {
    //Площадь треугольника по основанию и высоте
    double r = (4.0 / 3.0) * Math.PI * radius * radius * radius;
    double moduleNumbers = Math.abs(r);

    return moduleNumbers;

  }

  public static boolean isTrianglePossible(double a, double b, double c) {

    if (a + b > c) {
      if (c + b > a) {
        if (a + c > b) {
          return true;
        }
      }
    }
    return false;
  }

  // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
  // методом isTrianglePossible, если невозможен вернуть -1.0
  public static double getTriangleSquare(double a, double b, double c) {
    if (!isTrianglePossible(a, b, c)) {
      return -1.0;
    }

    double r = (a + b + c) / 2;
    double area = r * (r - a) * (r - b) * (r - c);
    double root = Math.sqrt(area);

    return root;

  }

}

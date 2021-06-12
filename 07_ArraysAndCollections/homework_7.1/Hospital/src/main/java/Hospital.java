public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
     float[] cout = {100,60,66,4};




    return new float[0];
  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
    generatePatientsTemperatures(5);

    double averageTemperature = 0;
    if (temperatureData.length > 0) {
      double sum = 0;
      for (int j = 0; j < temperatureData.length; j++) {
        sum += temperatureData[j];
      }
      averageTemperature = sum / temperatureData.length;
    }
    String report =
        "Температуры пациентов: " + 0 +
            "\nСредняя температура: " + 0 +
            "\nКоличество здоровых: " + 0;

    return report;
  }
}

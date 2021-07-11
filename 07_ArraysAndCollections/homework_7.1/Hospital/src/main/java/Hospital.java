public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
    float[] patientsTemperatures = new float[patientsCount];


     for (int i = 0; i < patientsTemperatures.length; i++){
       double random = (int)(Math.random()*((36+2)+1))+1;

     }

    return patientsTemperatures;


  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
    float[] averageTemperature = new float[temperatureData];
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

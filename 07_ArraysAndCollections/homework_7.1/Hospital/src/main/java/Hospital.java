public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
    float[] patientsTemperatures = new float[patientsCount];


     for (int i = 0; i < patientsTemperatures.length; i++){
       float random = (int)(Math.random()*((20+10)+3))+3;

     }

    return patientsTemperatures;


  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
    float[] averageTemperature = new float[] [generatePatientsTemperatures()];
    generatePatientsTemperatures(5);

    double Temperature = 0.0;
    if (temperatureData.length > 0) {
      double sum = 0;
      for (int j = 0; j < temperatureData.length; j++) {
        sum += temperatureData[j];
        if(Temperature > 36.0 ){

        }
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

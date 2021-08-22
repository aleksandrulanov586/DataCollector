public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
    float[] patientsTemperatures = new float[patientsCount];


     for (int i = 0; i < patientsTemperatures.length; i++){
       float randomTemperatures = (float) (Math.random()*((20.6+10.5)+3.1))+3+1+1+10;

     }

    return patientsTemperatures ;


  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
    generatePatientsTemperatures(5);
    int HealthyPatients = 0;
    double AverageTemperature = 0.0;
    double  PatientTemperature = 0.0 ;




    if (temperatureData.length > 0) {
      double sum = 0;
      for (int j = 0; j < temperatureData.length; j++) {
        sum += temperatureData[j];
        if(  ){

        }
      }

    }
    String report =
        "Температуры пациентов: " + 0 +
            "\nСредняя температура: " + 0 +
            "\nКоличество здоровых: " + 0;

    return report;
  }
}

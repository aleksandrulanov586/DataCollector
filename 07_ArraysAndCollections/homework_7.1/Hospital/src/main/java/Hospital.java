public class Hospital {

  public static float[] generatePatientsTemperatures(int patientsCount) {

    //TODO: напишите метод генерации массива температур пациентов
    float[] patientsTemperatures = new float[patientsCount];


     for (int i = 0; i < patientsTemperatures.length; i++){
       float randomTemperatures = (float) (Math.random()*((20.6+10.5)+3.1))+3+1+1+10;
       patientsTemperatures[patientsCount] = randomTemperatures;
     }

    return patientsTemperatures ;


  }

  public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

    int healthyPatients = 0;
    double averageTemperature = 0.0;
    double  patientTemperature = 0.0 ;



        if( patientTemperature > 36.6 || patientTemperature  < 36.9 ){
          healthyPatients++;
        }



    String report =
        "Температуры пациентов: " + 0 +
            "\nСредняя температура: " + 0 +
            "\nКоличество здоровых: " + 0;

    return report;
  }
}

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperatures = new float[patientsCount];


        for (int i = 0; i < patientsTemperatures.length; i++) {
            float randomTemperatures = (float) (Math.random() * ((20.6 + 10.5) + 3.1)) + 3 + 1 + 1 + 10;
            patientsTemperatures[i] = randomTemperatures;

        }

        return patientsTemperatures;


    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */

        int healthyPatients = 0;
        float averageTemperature = 0;
        String patientTemperature = "";

        for (int i = 0; i < temperatureData.length; i++) {
            for (float a : temperatureData){
                averageTemperature += a;

            }
            if (healthyPatients > 0 ){
    System.out.println(patientTemperature);

}


            if (patientTemperature > 36.6 || patientTemperature < 36.9) {
                healthyPatients++;
            }


        }


        String report =
                "Температуры пациентов: " + patientTemperature +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}

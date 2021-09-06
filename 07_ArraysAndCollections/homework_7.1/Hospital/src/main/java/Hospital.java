public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperatures = new float[patientsCount];

        float minTemperature = 32F;
        float maxTemperature = 40F;
        for (int i = 0; i < patientsTemperatures.length; i++) {
            float random = (float) (minTemperature + Math.random() * (maxTemperature - minTemperature));
            patientsTemperatures[i] = random;

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

        for (float currentTemperature : temperatureData) {
            if (currentTemperature > 36.6 && currentTemperature < 36.9) {
                healthyPatients++;
            }
            patientTemperature += currentTemperature + " ";
            for (int i = 0; i < temperatureData.length; ++i) {
                currentTemperature += temperatureData[i];
            }


        }


        String report =
                "Температуры пациентов: " + patientTemperature +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}

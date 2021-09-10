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

            if (currentTemperature >= 36.2F && currentTemperature <= 36.9F) {
                healthyPatients++;

            }

            patientTemperature += currentTemperature + " ";

        }

        for (int i = 0; i < temperatureData.length; i++) {
            averageTemperature = averageTemperature + temperatureData[i];

        }
        float temperature = averageTemperature / temperatureData.length;
        float t = temperature * 100;
        int i = (int) t;
        float temperaturePatient = (float) i / 100;

        String report =
                "Температуры пациентов: " + patientTemperature.trim() +
                        "\nСредняя температура: " + temperaturePatient +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}

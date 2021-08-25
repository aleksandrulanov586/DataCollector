public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        float[] patientsTemperatures = new float[patientsCount];


        for (int i = 0; i < patientsTemperatures.length; i++) {
            float randomTemperatures = (float) (Math.random() * ((20.6 + 10.5) + 3.1)) + 3 + 1 + 1 + 10;
            patientsTemperatures[i] = randomTemperatures;
            getReport(patientsTemperatures);
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
        float patientTemperature = 0;

        for (int i = 0; i < temperatureData.length; i++) {
            if (patientTemperature > 36.6 || patientTemperature < 36.9) {
                healthyPatients++;
            }
            if (true) {
                temperatureData + temperatureData / temperatureData;

            }
            temperatureData[i] = patientTemperature;
        }


        String report =
                "Температуры пациентов: " + patientTemperature +
                        "\nСредняя температура: " + averageTemperature +
                        "\nКоличество здоровых: " + healthyPatients;

        return report;
    }
}

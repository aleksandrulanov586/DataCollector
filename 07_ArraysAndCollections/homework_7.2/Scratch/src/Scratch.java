public class Scratch {


        public static void main(String[] args) {

            float[] numbers = new float[]{3, 4, 5};
            float sum =0F;
            for (int i = 0; i < numbers.length; i++){
                sum=sum+numbers[i];

            }
            float averageTemperature = sum/ numbers.length;
            System.out.println(averageTemperature);
        }
}

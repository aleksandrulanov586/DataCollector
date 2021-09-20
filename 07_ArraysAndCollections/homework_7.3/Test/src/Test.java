public class Test {
    public static void printFirst10AndLast10Elements(int[] array) {
        int sum = 1;
       // int[] nums = new int[30];

        for (int i = 0; i < array.length; i++ ){
            array[i] = sum;
            if(i <= 10){
                System.out.println(i);
            }
            if(i > 19){
                System.out.println(i);
            }
        }
        System.out.println("первый элемент: " + array[0]);

        // распечатайте десятый элемент с начала и с конца
    }







}

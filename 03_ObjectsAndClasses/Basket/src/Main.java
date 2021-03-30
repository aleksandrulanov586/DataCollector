public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(1,2);
        System.out.println(arithmetic.info());
Basket basket = new Basket();
basket.add("Молоко", 50);
basket.add("Кефир", 60);
basket.add("Моллоко Кефир");

System.out.println(basket.getTotalPrice());
    }
}

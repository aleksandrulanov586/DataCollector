import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.hasNext());
        todoList.add("work");
        todoList.add(1,"java");


        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {


        todoList.add("work");
        todoList.add(1, "java");
        todoList.printTodos();
System.out.println(todoList);


        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}

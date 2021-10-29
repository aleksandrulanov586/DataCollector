import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String DELETING_BY_INDEX = "DELETE\\s+\\d+";
    public static String TEAM_LIST = "LIST";

    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.split(input);
        String[] a = input.split(" ", 3);
        String q = a[1];
        int parsInput = Integer.parseInt(q);

        if (input.matches(todoList.ADDING_TO_END)) {
            todoList.add(input);
        }
        if (input.matches(todoList.ADDING_BY_INDEX)) {

            todoList.add(parsInput, input);
        }
        if (input.matches(todoList.REPLACE_WITH_INDEX)) {
            todoList.edit(input, parsInput);

        }
        if (input.matches(DELETING_BY_INDEX)) {
            todoList.delete(parsInput);
        }
        if (input.matches(TEAM_LIST)) {
            System.out.println(todoList.getTodos());
        }

        todoList.add("work");
        todoList.add(1, "java");
        todoList.printTodos();

        System.out.println(todoList);


        // TODO: написать консольное приложение для работы со списком дел todoList
    }
}
